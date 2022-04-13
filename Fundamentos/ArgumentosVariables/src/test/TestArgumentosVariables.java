package test;

public class TestArgumentosVariables {
    public static void main(String[] args) {
        imprimirNumeros(3,4,5);
        imprimirNumeros(1,2);
        variosParametros("Juan",8,7,6);
    }

    private static void variosParametros(String nombre, int... numeros){
        System.out.println("Nombre: " + nombre);
        imprimirNumeros(numeros);
    }
    private static void imprimirNumeros(int... numeros){
        for (int i=0; i < numeros.length; i++){
            System.out.println("Elemento: " + numeros[i]);
        }
    }
}
