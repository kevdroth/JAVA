package ar.com.kevin.peliculas.negocio;

public interface ICatalogoPeliculas {

    String NOMBRE_ARCHIVO = "peliculas.txt";

    void agregarPelicula(String nombrePelicula);

    void listarPeliculas();

    void buscarPelicula(String buscar);

    void iniciarArchivo();

}
