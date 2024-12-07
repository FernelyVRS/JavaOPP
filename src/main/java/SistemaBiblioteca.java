public class SistemaBiblioteca {

    public static void main(String[] args){

        Libro libro1 = new Libro("El Principito", "Pebro", 3);
        Libro libro2 = new Libro("La Casa Blanca", "Juan", 2);

        Biblioteca biblioteca = new Biblioteca();
        biblioteca.agregarLibro(libro1);
        biblioteca.agregarLibro(libro2);
        biblioteca.mostrarLibroDisponible();

        Usuario usuario = new Usuario("Fernely");
        usuario.tomarLibro(libro1);
        usuario.tomarLibro(libro2);

        usuario.mostrarInfo();
        biblioteca.mostrarLibroDisponible();

        usuario.devolverLibro(libro1);
        usuario.mostrarInfo();
        biblioteca.mostrarLibroDisponible();
    }

}