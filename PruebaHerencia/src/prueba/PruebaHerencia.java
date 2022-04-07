package prueba;

import domain.Cliente;
import domain.Empleado;

public class PruebaHerencia {
    public static void main(String[] args) {

        Empleado empleado = new Empleado("Carlos", 'M', 24, "Sistemas");
        System.out.println("Empleado= " + empleado);

        Cliente cliente = new Cliente("Nacho", 'M', 29, "Privamed", true);
        System.out.println("Cliente= " + cliente);

        Cliente cliente1 = new Cliente("Ana", 'F', 27, "Accord Salud", true);
        System.out.println("Cliente= " + cliente1);

    }
}
