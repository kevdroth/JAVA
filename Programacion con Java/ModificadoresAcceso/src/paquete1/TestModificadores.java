package paquete1;

import paquete1.Clase1;
import paquete1.ClaseHija;

/*
publico: acceso a todos los metodos, clases y atributos
protected: utilizado para casos de herencia, utilizando super() para llamar metodos y constructores
default: solo se accede desde el mismo paquete. Debe hacerse uso de extends
privado: no puede modificarse desde otras clases, aunque sea hija o este en el mismo paquete. GET/SET para acceder.
*/

public class TestModificadores {
    public static void main(String[] args) {
        /*Clase1 clase1 = new Clase1("Publico");
        System.out.println("clase1.atributoPublico = " + clase1.atributoPublico);
        clase1.metodoPublico();

        ClaseHija claseHija = new ClaseHija();
        System.out.println("claseHija = " + claseHija);*/

        Clase1 clase1 = new Clase1("Argumento");
        /*clase1.metodoDefault();
        clase1.atributoDefault = "Cambio desde la prueba ";
        System.out.println("Clase1 atributo default: " + clase1.atributoDefault);*/
        clase1.setAtributoPrivado("Cambio valor atributo privado ");
        System.out.println("Get: " + clase1.getAtributoPrivado());
    }
}
