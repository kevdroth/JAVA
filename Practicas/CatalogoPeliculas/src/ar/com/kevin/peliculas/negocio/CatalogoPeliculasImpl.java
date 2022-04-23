package ar.com.kevin.peliculas.negocio;

import ar.com.kevin.peliculas.datos.IAccesoDatos;

public class CatalogoPeliculasImpl implements ICatalogoPeliculas {

    IAccesoDatos datos;

    public IAccesoDatos CatalogoPeliculas(IAccesoDatos datos){
        return datos;
    }


    @Override
    public void agregarPelicula(String nombrePelicula, String nombreArchivo) {

    }

    @Override
    public void listarPeliculas(String nombreArchivo) {

    }

    @Override
    public void buscarPelicula(String nombreArchivo, String buscar) {

    }

    @Override
    public void iniciarArchivo(String nombreArchivo) {

    }
}
