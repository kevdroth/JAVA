package test;

import javax.print.attribute.standard.JobKOctets;
import java.util.*;

/*Set no guarda el orden de los elementos, es mas rapido y no permite duplicados
* List puede duplicar mismos valores y son ordenados
* Map utilizar put (no add), asocia un valor a una llave agregada */

public class TestColecciones {
    public static void main(String[] args) {
        List miLista = new ArrayList();
        miLista.add("Lunes");
        miLista.add("Martes");
        miLista.add("Miercoles");
        miLista.add("Jueves");
        miLista.add("Viernes");
        //imprimir(miLista);

        /*for (Object elemento: miLista){
            System.out.println("Elemento: " + elemento);
        }*/

        /*miLista.forEach(elemento -> {
            System.out.println("Elemento: " + elemento);
        });*/

        Set miSet = new HashSet();
        miSet.add("Lunes");
        miSet.add("Martes");
        miSet.add("Miercoles");
        miSet.add("Jueves");
        miSet.add("Viernes");
        //imprimir(miSet);

        Map miMapa = new HashMap();
        miMapa.put("valor1","Juan");
        miMapa.put("valor2","Pedro");
        miMapa.put("valor3", "Carlos");

        String elemento = (String) miMapa.get("valor1");
        System.out.println("Elemento: " + elemento);

        imprimir(miMapa.keySet());
        imprimir(miMapa.values());
    }
    public static void imprimir(Collection coleccion){
        /*for (Object elemento: coleccion){
            System.out.println("Elemento: " + elemento);
        }*/
        coleccion.forEach(elemento -> {
            System.out.println("Elemento: " + elemento);
        });
    }
}
