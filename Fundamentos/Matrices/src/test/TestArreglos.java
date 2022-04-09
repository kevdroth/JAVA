package test;

public class TestArreglos {
    public static void main(String[] args) {
        int edades[] = new int[3];
        System.out.println("Edades= " + edades);

        edades[0] = 10;
        System.out.println("Edades 0: " + edades[0]);

        edades[1] = 5;
        edades[2] = 15;
        System.out.println("Edades 1: " + edades[1] +
                "\n" + "Edades 2: " + edades[2]);

        for(int i = 0; i < edades.length; i++){
            System.out.println("Edad elemento " + i + ": " + edades[i]);
        }

        //resumida
        String frutas[] = {"Naranja", "Banana", "Uva"};
        for (int i=0; i < frutas.length; i++){
            System.out.println("Indice " + i + " Fruta: " + frutas[i]);
        }

    }
}