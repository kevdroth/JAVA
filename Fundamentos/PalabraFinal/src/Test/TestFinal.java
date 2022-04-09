package Test;

import domain.Persona;

public class TestFinal {
    public static void main(String[] args) {
        final int miVariable = 10;
        System.out.println("Mi variable= " + miVariable);

        System.out.println("Mi constante: "+ Persona.MI_CONSTANTE);

        final Persona persona1 = new Persona();
        persona1.setNombre("Juan");
        System.out.println("Nombre: " + persona1.getNombre());
        persona1.setNombre("Carlos");
        System.out.println("Nombre: " + persona1.getNombre());
    }
}
