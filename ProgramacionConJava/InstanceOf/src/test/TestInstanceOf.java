package test;

import domain.*;

public class TestInstanceOf {
    public static void main(String[] args) {
        Empleado emplado1 = new Empleado("Juan",5000);
        determinarTipo(emplado1);
        emplado1 = new Gerente("Carlos",10000,"Contabilidad");
        //determinarTipo(emplado1);
    }

    public static void determinarTipo(Empleado empleado){
        if(empleado instanceof Gerente){
            System.out.println("Es de tipo gerente");
            Gerente gerente = (Gerente)empleado;
            System.out.println("Gerente: " + gerente.getDepartamento());
        }else if (empleado instanceof Empleado){
            System.out.println("Es de tipo empleado");
            //Gerente gerente = (Gerente)empleado;
            //System.out.println("Gerente: " + gerente.getDepartamento());
            System.out.println("Empleado: " + empleado.getNombre());
        }else if (empleado instanceof Object);
        System.out.println("Es de tipo object");
        empleado.toString();
    }
}
