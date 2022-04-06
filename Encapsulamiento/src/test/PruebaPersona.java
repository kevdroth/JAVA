package test;
import dominio.Persona;

public class PruebaPersona {
    public static void main(String[] args) {
         Persona persona1 = new Persona("Juan",5000.00,false);
        persona1.setNombre("Juan Carlos");
        /*System.out.println("Nombre: " + persona1.getNombre());
        System.out.println("Sueldo: " + persona1.getSueldo());
        System.out.println("Estado: " + persona1.isEliminado());*/
        /*Persona persona2 = new Persona("Kevin",2000.00,true);
        System.out.println("Nombre: " + persona2.getNombre());
        System.out.println("Sueldo: " + persona2.getSueldo());
        System.out.println("Estado: " + persona2.isEliminado());*/
        System.out.println("Persona 1: " + persona1);

    }
}
