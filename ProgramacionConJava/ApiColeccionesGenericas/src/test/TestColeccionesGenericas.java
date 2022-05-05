package test;

import java.util.*;

/*Set no guarda el orden de los elementos, es mas rapido y no permite duplicados
* List puede duplicar mismos valores y son ordenados
* Map utilizar put (no add), asocia un valor a una llave agregada (no puede repetirse el valor del set <izquierdo> */

public class TestColeccionesGenericas {
    public static void main(String[] args) {
        List<String> miLista = new ArrayList<>();
        miLista.add("Lunes");
        miLista.add("Martes");
        miLista.add("Miercoles");
        miLista.add("Jueves");
        miLista.add("Viernes");
        String elemento = miLista.get(0);
        //System.out.println("El elemento es: " + elemento);
        //imprimir(miLista);

        /*for (Object elemento: miLista){
            System.out.println("Elemento: " + elemento);
        }*/

        /*miLista.forEach(elemento -> {
            System.out.println("Elemento: " + elemento);
        });*/

        Set<String> miSet = new HashSet<>();
        miSet.add("Lunes");
        miSet.add("Martes");
        miSet.add("Miercoles");
        miSet.add("Jueves");
        miSet.add("Viernes");
        //imprimir(miSet);

        Map<String, String> miMapa = new HashMap<>();
        miMapa.put("valor1","Juan");
        miMapa.put("valor2","Pedro");
        miMapa.put("valor3", "Carlos");

        String elementoMapa = miMapa.get("valor1");
        System.out.println("Elemento: " + elementoMapa);

        imprimir(miMapa.keySet());
        imprimir(miMapa.values());
    }
    public static void imprimir(Collection<String> coleccion){
        for (String elemento: coleccion){
            System.out.println("Elemento: " + elemento);
        }
        coleccion.forEach(elemento -> {
            System.out.println("Elemento: " + elemento);
        });
    }
}
