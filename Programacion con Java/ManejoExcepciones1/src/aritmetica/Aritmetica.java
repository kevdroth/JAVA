package aritmetica;

import excepciones.OperacionExcepcion;

/*//throws: posiblemente puede arrojar una excepcion
throw: arroja la excepcion
Exception: precisa saber que se van a arrojar excepciones, RuntimeException el metodo no precisa el aviso de excepciones ni
el bloque try catch
Para excepciones esperadas/definidas usar Exception, para el resto usar RuntimeException*/

public class Aritmetica {

    public static int division(int numerador, int denominador){
        if (denominador == 0){
            throw new OperacionExcepcion("Division entre cero");
        }

        return numerador / denominador;

    }

}
