package test;

import excepciones.OperacionExcepcion;

import static aritmetica.Aritmetica.division;

public class TestExcepciones {
    public static void main(String[] args) {
        int resultado = 0;
        try {
            resultado = division(10, 0);
        }catch (OperacionExcepcion e){
            System.out.println("Ocurrio un error de tipo OperacionExcepcion");
            e.printStackTrace(System.out);
        } catch (Exception e) {
            System.out.println("Ocurrio un error de tipo Exception");
            e.printStackTrace(System.out);
        }
        finally {   //se utiliza para cerrar recursos.
            System.out.println("Se reviso la division entre cero");
        }
        System.out.println("resultado = " + resultado);
    }
}
