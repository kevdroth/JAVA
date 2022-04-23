package ar.com.kevin.peliculas.datos;

import ar.com.kevin.peliculas.domain.Pelicula;
import excepciones.*;

import java.io.*;
import java.util.*;

public class AccesoDatosImpl implements IAccesoDatos {

    @Override
    public boolean existe(String nombreArchivo) throws AccesoDatosEx {
        var archivo = new File(nombreArchivo);
        return archivo.exists();
    }

    @Override
    public List<Pelicula> listar(String nombreArchivo) throws LecturaDatosEx {
        var archivo = new File(nombreArchivo);
        List<Pelicula> peliculas = new ArrayList<>();
        try {
            var entrada = new BufferedReader(new FileReader(archivo));
            var lectura = entrada.readLine();
            while (lectura != null){
                var pelicula = new Pelicula(lectura);
                peliculas.add(pelicula);
                System.out.println("Peliculas: " + lectura);
                lectura = entrada.readLine();
            }
            entrada.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
            throw new LecturaDatosEx("Excepcion al listar peliculas" + e.getMessage());
        } catch (IOException e) {
            e.printStackTrace();
            throw new LecturaDatosEx("Excepcion al listar peliculas" + e.getMessage());
        }
        return peliculas;
    }

    @Override
    public void escribir(Pelicula pelicula, String nombreArchivo, boolean anexar) throws EscrituraDatosEx {

    }

    @Override
    public String buscar(String nombreArchivo, String buscar) throws LecturaDatosEx {
        return null;
    }

    @Override
    public void crear(String nombreArchivo) throws AccesoDatosEx {

    }

    @Override
    public void borrar(String nombreArchivo) throws AccesoDatosEx {

    }
}
