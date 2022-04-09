package ar.com.onwave.MundoPC;

public class Teclado extends DispositivoEntrada{
    private int idTeclado;
    private static int contadorTeclados;

    public Teclado(){
        idTeclado = ++Teclado.contadorTeclados;
    }

    @Override
    public String toString() {
        return "Tipo Entrada: " + tipoEntrada +
                ", Marca: " + marca +
                ", idTeclado: " + idTeclado;
    }
}
