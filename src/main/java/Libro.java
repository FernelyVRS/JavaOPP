public class Libro {
    private String titulo;
    private String autor;
    private int cantidadDisponible;

    public Libro(String newTitulo, String newAutor, int newCantidadDisponible){
        this.titulo = newTitulo;
        this.autor = newAutor;
        this.cantidadDisponible = newCantidadDisponible;
    }

    public boolean prestar(){
        if (this.cantidadDisponible >=  1){
            this.cantidadDisponible --;
            return true;
        }
        return false;
    }

    public void devolver(){
        this.cantidadDisponible ++;
    }

    public String mostrarInfo(){
        return "| Titulo: " + titulo +" | Autor: " + autor + " | Canidad Dismponible: " + cantidadDisponible;
    }

    public String getTitulo(){
        return this.titulo;
    }

}