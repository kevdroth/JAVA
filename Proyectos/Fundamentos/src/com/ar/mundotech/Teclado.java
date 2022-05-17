package com.ar.mundotech;

public class Teclado extends DispositivoEntrada{
    private final int idTeclado;
    private static int contadorTeclados;

    public Teclado(String tipoEntrada, String marca) {
        super(tipoEntrada, marca);
        this.idTeclado = ++Teclado.contadorTeclados;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("ID Teclado: ").append(idTeclado);
        sb.append("Marca: ").append(super.marca);
        sb.append("Tipo Entrada: ").append(super.tipoEntrada);
        return sb.toString();
    }
}
