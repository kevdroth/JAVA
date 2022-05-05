package test;

import domain.*;

public class TestSobreescritura {
    public static void main(String[] args) {
        /*Gerente gerente1 = new Gerente("Juan",5000, "Sistemas");
        System.out.println("Gerente 1: " + gerente1.obtenerDetalles());*/
        Empleado emplado1 = new Empleado("Juan",5000);
        /*System.out.println("Empleado: " + emplado1.obtenerDetalles());*/
        imprimir(emplado1);

        emplado1 = new Gerente("Carlos",10000,"Contabilidad");
/*        gerente1.obtenerDetalles();
        System.out.println("Gerente: " + gerente1.obtenerDetalles());*/
        imprimir(emplado1);
    }

    public static void imprimir(Empleado empleado){
        String detalles = empleado.obtenerDetalles();
        System.out.println("Empleado: " + detalles);
    }
}
