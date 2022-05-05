package test;

import domain.Persona;

public class TestForEach {
    public static void main(String[] args) {
        int edades[] = {5, 6, 7, 9};
        for (int edad : edades){
            System.out.println("Edades: " + edad);
        }
        Persona personas[] = {new Persona("Juan"), new Persona("Carlos"), new Persona("Julieta")};
        for (Persona persona : personas){
            System.out.println("Persona: " + persona);
        }
    }
}
