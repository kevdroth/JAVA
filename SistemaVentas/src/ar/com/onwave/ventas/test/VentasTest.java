package ar.com.onwave.ventas.test;

import ar.com.onwave.ventas.*;

public class VentasTest {
    public static void main(String[] args) {
        Producto producto1 = new Producto("Camisa", 50);
        Producto producto2 = new Producto("Pantalon",100);
        Producto producto3 = new Producto("Buzo",250);
        Producto producto4 = new Producto("Zapatillas", 300);

        Orden orden1 = new Orden();
        orden1.agregarProducto(producto1);
        orden1.agregarProducto(producto2);
        orden1.mostrarOrden();

        Orden orden2 = new Orden();
        orden2.agregarProducto(producto2);
        orden2.agregarProducto(producto4);
        orden2.mostrarOrden();
    }
}
