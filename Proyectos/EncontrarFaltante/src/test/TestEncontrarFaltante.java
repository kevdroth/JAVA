package test;

import domain.Archivos;
import domain.Datos;

import java.util.Scanner;

public class TestEncontrarFaltante {
    public static void main(String[] args) {

        var scanner = new Scanner(System.in);

        System.out.println("Ingrese nombre de archivo: ");
        var nombreArchivo = scanner.nextLine();
        Archivos.crearArchivo(nombreArchivo);
        var datos = new Datos();

        System.out.println("Menor numero de NC A: ");
        datos.setMinNCA(Integer.parseInt(scanner.nextLine()));

        System.out.println("Mayor numero de NC A: ");
        datos.setMaxNCA(Integer.parseInt(scanner.nextLine()));

        System.out.println("Menor numero de NC B: ");
        datos.setMinNCB(Integer.parseInt(scanner.nextLine()));

        System.out.println("Mayor numero de NC B: ");
        datos.setMaxNCB(Integer.parseInt(scanner.nextLine()));

        System.out.println("Menor numero de FC A: ");
        datos.setMinFCA(Integer.parseInt(scanner.nextLine()));

        System.out.println("Mayor numero de FC A: ");
        datos.setMaxFCA(Integer.parseInt(scanner.nextLine()));

        System.out.println("Menor numero de FC B: ");
        datos.setMinFCB(Integer.parseInt(scanner.nextLine()));

        System.out.println("Mayor numero de FC B: ");
        datos.setMaxFCB(Integer.parseInt(scanner.nextLine()));

        Archivos.escribirArchivo(nombreArchivo,datos.toString());

    }
}
