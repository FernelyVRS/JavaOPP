import java.util.ArrayList;
import java.util.List;

public  class Usuario {

    private String nombre;
    private List<String> librosPrestados;

    public Usuario(String newNombre){
        this.nombre = newNombre;
        this.librosPrestados = new ArrayList<>();
    }

    public void tomarLibro(Libro libro){
        if (libro.prestar()){
            librosPrestados.add(libro.getTitulo());
        }else {
            System.out.println("Lo sentimos, libro no dispible " + libro.getTitulo());
        }
    }

    public void devolverLibro(Libro libro){
        if (librosPrestados.contains(libro.getTitulo())){
            libro.devolver();
            librosPrestados.remove(libro.getTitulo());
            System.out.println("El libro " + libro.getTitulo() + " fue devuelto por " + nombre );
        }else {
            System.out.println(nombre + " no tiene el libro "+ libro.getTitulo() +" prestado");
        }
    }

    public void mostrarInfo(){
        System.out.println(nombre + " tiene los libros prestados: " + String.join(",", librosPrestados) );
    }


}