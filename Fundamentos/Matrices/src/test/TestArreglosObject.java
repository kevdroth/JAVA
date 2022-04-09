package test;

import domain.Persona;

public class TestArreglosObject {
    public static void main(String[] args) {
        Persona personas[] = new Persona[2];
        personas[0] = new Persona("Kevin");
        personas[1] = new Persona("Ana");
        System.out.println("Personas0= " + personas[0]);
        System.out.println("Personas1= " + personas[1]);

        for(int i=0; i < personas.length; i++){
            System.out.println("Personas " + i + ", " + personas[i]);
        }
    }
}