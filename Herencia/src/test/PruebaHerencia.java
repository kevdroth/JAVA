package test;

import domain.Cliente;
import domain.Empleado;

import java.util.Date;

public class PruebaHerencia {
    public static void main(String[] args) {
        Empleado empleado1 = new Empleado("Juan", 5000.00);
        System.out.println("empleado1 = " + empleado1);

/*        var fecha = new Date();

        Cliente cliente1 = new Cliente (fecha,true,"Carlos", 'M', 28, "Av. Santa Fe 2349");
        System.out.println("Cliente1= " + cliente1);*/
    }
}
