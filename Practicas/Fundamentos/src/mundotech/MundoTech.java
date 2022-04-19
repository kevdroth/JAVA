package mundotech;

import com.ar.mundotech.*;

public class MundoTech {
    public static void main(String[] args) {
        Teclado corsair = new Teclado("Bluetooth", "Corsair");
        Raton logitech = new Raton("USB", "Logitech");
        Monitor samsung = new Monitor("Samsung",24);
        Computadora gamer = new Computadora("Gamer",samsung,corsair,logitech);

        Orden orden1 = new Orden();
        orden1.agregarComputadora(gamer);
        orden1.agregarComputadora(gamer);
        orden1.agregarComputadora(gamer);
        orden1.agregarComputadora(gamer);
        orden1.agregarComputadora(gamer);
        orden1.agregarComputadora(gamer);
        orden1.agregarComputadora(gamer);
        orden1.agregarComputadora(gamer);
        orden1.agregarComputadora(gamer);
        orden1.mostrarOrden();
    }
}
