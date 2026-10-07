public class AppLibro {
    public static void main(String[] args) {
        Libro libro1 = new Libro();

        libro1.setTitulo("Cien años de soledad");
        libro1.setAutor("Gabriel Garcia Marquez");
        libro1.setDisponible(true);

        Libro libro2 = new Libro();

        libro2.setTitulo("El principito");
        libro2.setAutor("Antonie de Saint-Exupéry");
        libro2.setDisponible(true);

        System.out.println("LIBRO 1");
        libro1.mostrarInfo();

        System.out.println("LIBRO 2");
        libro2.mostrarInfo();

        System.out.println("GETTERS");
        System.out.println("Titulo del libro 1: " + libro1.getTitulo());
        System.out.println("Autor del libro 1: " + libro1.getAutor());
        System.out.println("Disponible: " + libro1.isDisponible());

        System.out.println("PRESTAR");
        libro1.prestar();

        libro1.prestar();

        System.out.println("DEVOLVER");
        libro1.devolver();

        System.out.println("TITULO VACIO");
        libro1.setTitulo(" ");
    }
    
}
