package test;

public class TestBoxingUnboxing {
    public static void main(String[] args) {
        Integer entero = 10; //autoboxing
        System.out.println("Entero: " + entero);
        System.out.println("Entero: " + entero.toString());
        System.out.println("Entero: " + entero.doubleValue());

        int entero2 = entero; //unboxing
        System.out.println("Entero 2: " + entero2);
    }
}
