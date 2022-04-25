package test;

import domain.Tablas;

import java.util.Scanner;

public class TestEncontrarFaltante {
    public static void main(String[] args) {
        var scanner = new Scanner(System.in);
        var tabla = new Tablas();

        System.out.println("Menor numero de NC A: ");
        int minNCA = Integer.parseInt(scanner.nextLine());

        System.out.println("Mayor numero de NC A: ");
        int maxNCA = Integer.parseInt(scanner.nextLine());

        System.out.println("Menor numero de NC B: ");
        int minNCB = Integer.parseInt(scanner.nextLine());

        System.out.println("Mayor numero de NC B: ");
        int maxNCB = Integer.parseInt(scanner.nextLine());

        System.out.println("Menor numero de FC A: ");
        int minFCA = Integer.parseInt(scanner.nextLine());

        System.out.println("Mayor numero de FC A: ");
        int maxFCA = Integer.parseInt(scanner.nextLine());

        System.out.println("Menor numero de FC B: ");
        int minFCB = Integer.parseInt(scanner.nextLine());

        System.out.println("Mayor numero de FC B: ");
        int maxFCB = Integer.parseInt(scanner.nextLine());

        int rnca = maxNCA - minNCA + 1;
        int rncb = maxNCB - minNCB + 1;
        int rfca = maxFCA - minFCA + 1;
        int rfcb = maxFCB - minFCB + 1;

        System.out.println("NC A: " + rnca);
        System.out.println("NC B: " + rncb);
        System.out.println("FC A: " + rfca);
        System.out.println("FC B: " + rfcb);

    }
}
