package ar.com.kevin.peliculas.negocio;

import ar.com.kevin.peliculas.datos.AccesoDatosImpl;
import ar.com.kevin.peliculas.datos.IAccesoDatos;
import ar.com.kevin.peliculas.domain.Pelicula;
import excepciones.AccesoDatosEx;
import excepciones.LecturaDatosEx;

import java.util.List;

public class CatalogoPeliculasImpl implements ICatalogoPeliculas {

    private final IAccesoDatos datos;

    public CatalogoPeliculasImpl() {
        this.datos = new AccesoDatosImpl();
    }

    public IAccesoDatos CatalogoPeliculas(IAccesoDatos datos){
        return datos;
    }


    @Override
    public void agregarPelicula(String nombrePelicula) {
        var pelicula = new Pelicula(nombrePelicula);
        boolean anexar = false;
        try {
            anexar = datos.existe(NOMBRE_ARCHIVO);
            datos.escribir(pelicula, NOMBRE_ARCHIVO, anexar);
        } catch (AccesoDatosEx e) {
            System.out.println("Error de acceso a datos al agregar");
            e.printStackTrace(System.out);
        }
    }

    @Override
    public void listarPeliculas() {
        try {
            List<Pelicula> peliculas = this.datos.listar(NOMBRE_ARCHIVO);
            for (var pelicula : peliculas);
            //System.out.println("Pelicula: " + peliculas);
        } catch (LecturaDatosEx e) {
            e.printStackTrace(System.out);
            System.out.println("Error de acceso datos al listar");
        }
    }

    @Override
    public void buscarPelicula(String buscar) {
        String resultado = null;
        try {
            resultado = this.datos.buscar(NOMBRE_ARCHIVO, buscar);
        } catch (AccesoDatosEx e) {
            e.printStackTrace();
            System.out.println("Error de acceso datos al buscar");
        }
        if (resultado != null){
            System.out.println("Resultado: " + resultado);
        }else{
            System.out.println("Pelicula no encontrada");
        }

    }

    @Override
    public void iniciarArchivo() {
        try {
            if (this.datos.existe(NOMBRE_ARCHIVO)){
                datos.borrar(NOMBRE_ARCHIVO);
                datos.crear(NOMBRE_ARCHIVO);
            }else{
                datos.crear(NOMBRE_ARCHIVO);
            }
        } catch (AccesoDatosEx e) {
            e.printStackTrace(System.out);
            System.out.println("Error al iniciar catalogo de peliculas");
        }
    }
}
