

import java.util.ArrayList;
import java.util.List;

public class Biblioteca {

    private List<Libro> libros;

    public Biblioteca(){
        this.libros = new ArrayList<>();
    }

    public void  agregarLibro(Libro libro){
        libros.add(libro);
        System.out.println("El libro " + libro.getTitulo() + " agregado a la biblioteca");
    }

    public void  mostrarLibroDisponible(){
        System.out.println("Libros disponibles");

        for(int i = 0; i < libros.size(); i++){
            System.out.println(libros.get(i).mostrarInfo());
        }
    }


}