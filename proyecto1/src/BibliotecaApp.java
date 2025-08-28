public class BibliotecaApp {
    public static void main(String[] args) {

        libro libro1 = new libro("Cien años de soledad", "Gabriel García Márquez", 1967);

        libro libro2 = new libro("El Quijote", "Miguel de Cervantes", 1605);

        System.out.println("Información de los libros:");

        libro1.mostrarInfo();

        System.out.println("----------------------");
        
        libro2.mostrarInfo();
    }
}
