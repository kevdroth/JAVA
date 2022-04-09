package test;

import domain.Persona;

import javax.management.modelmbean.InvalidTargetObjectTypeException;

public class TestMatrices {
    public static void main(String[] args) {
        int edades[][] = new int[3][2];
        System.out.println("edades = " + edades);

 /*     edades[0][0] = 45;
        edades[0][1] = 37;
        edades[1][0] = 24;
        edades[1][1] = 82;
        edades[2][0] = 29;
        edades[2][1] = 15;
  */
        System.out.println("Edades[0][0]: " + edades[0][0]);
        System.out.println("Edades[0][1]: " + edades[0][1]);
        System.out.println("Edades[1][0]: " + edades[1][0]);
        System.out.println("Edades[1][1]: " + edades[1][1]);
        System.out.println("Edades[2][0]: " + edades[2][0]);
        System.out.println("Edades[2][1]: " + edades[2][1]);

        /*for (int ren = 0; ren < edades.length; ren++) {
            for (int col = 0; col < edades[ren].length; col++) {
                System.out.println("Indice " + ren + " " + col + ", Edades: " + edades[ren][col]);
            }
        }*/

        Persona personas[][] = new Persona[2][3];
        personas[0][0] = new Persona("Juan");
        personas[0][1] = new Persona("Martin");
        personas[0][2] = new Persona("Ana");
        personas[1][0] = new Persona("Julieta");
        personas[1][1] = new Persona("Martina");
        personas[1][2] = new Persona("Agustina");
        imprimir(personas);

        /*Persona personas[][] = {{"Juan", "Carlos", "Ricardo", "Javier"}, {"Roberto", "Misael", "Kevin", "Karina"},
                {"Ana", "Nacho", "Martin", "Emanuel"}};

        for (int ren = 0; ren < personas.length; ren++) {
            for (int col = 0; col < personas[ren].length; col++) {
                System.out.println("Indice " + ren + "-" + col + " Nombre: " + personas[ren][col]);
            }
        }*/

        String frutas[][] = {{"Naranja","Limon"},{"Fresa","Frutilla","Uva"}};
        imprimir(frutas);
    }

    public static void imprimir(Object matriz[][]){
        for (int ren = 0; ren < matriz.length; ren++) {
            for (int col = 0; col < matriz[ren].length; col++) {
                System.out.println("Indice " + ren + " " + col + ", Nombre: " + matriz[ren][col]);
            }
        }
    }
}