package test;

import domain.Persona;

public class TestBloqueInicializacion {
    public static void main(String[] args) {
        Persona persona1 = new Persona();
        System.out.println("Persona: " + persona1);
        System.out.println(" ");
        Persona persona2 = new Persona();
        System.out.println("Persona: " + persona2);
    }
}
