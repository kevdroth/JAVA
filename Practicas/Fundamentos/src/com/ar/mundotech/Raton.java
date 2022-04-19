package com.ar.mundotech;

public class Raton extends DispositivoEntrada {
    private final int idRaton;
    private static int contadorRatones;

    public Raton(String tipoEntrada, String marca) {
        super(tipoEntrada, marca);
        this.idRaton = ++Raton.contadorRatones;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("ID Raton: ").append(idRaton);
        sb.append("Marca: ").append(super.marca);
        sb.append("Tipo Entrada: ").append(super.tipoEntrada);
        return sb.toString();
    }
}
