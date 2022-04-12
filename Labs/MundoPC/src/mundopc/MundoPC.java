package mundopc;
import ar.com.onwave.MundoPC.*;

public class MundoPC {
    public static void main(String[] args) {
        Monitor monitorSamsung = new Monitor("Samsung",32);
        Teclado tecladoCorsair = new Teclado("Bluetooth","Corsair");
        Raton ratonGenius = new Raton("USB","Genius");
        Computadora computadoraHP = new Computadora("Computadora Samsung",monitorSamsung, tecladoCorsair, ratonGenius);

        Monitor monitorAsus = new Monitor("ASUS",24);
        Teclado tecladoRedDragon = new Teclado("USB","Red Dragon");
        Raton ratonLogitech = new Raton("USB","Logitech");
        Computadora computadoraGamer = new Computadora("Computadora Gamer",monitorAsus, tecladoRedDragon, ratonLogitech);

        Orden orden1 = new Orden();
        orden1.agregarComputadora(computadoraHP);
        orden1.agregarComputadora(computadoraGamer);
        orden1.mostrarOrden();
    }
}
