package pasosporreferencia;

import clases.Persona;

public class PasoPorReferencia {

    public static void main(String[] args) {
        Persona persona1 = new Persona();
        persona1.nombre = "Juan";
        System.out.println("Nombre persona1: " + persona1.nombre);
        cambiarValor(persona1);
        System.out.println("Nombre persona1 cambiado: " + persona1.nombre);
    }

    public static void cambiarValor(Persona persona){
        persona.nombre = "Carla";
    }

}
