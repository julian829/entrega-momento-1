public class libro {

    private String titulo;

    private String autor;

    private int año;

    public libro(){};

    
    public libro(String titulo, String autor, int anio) {

        this.titulo = titulo;

        this.autor = autor;

        this.año = anio;

    }

    // organizacion del metodo: miguel-cambio
    public void mostrarInfo() {

        System.out.println("Título: " + titulo);

        System.out.println("Autor: " + autor);

        System.out.println("Año: " + año);
    }
}
