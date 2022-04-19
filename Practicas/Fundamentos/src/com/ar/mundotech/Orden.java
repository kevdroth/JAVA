package com.ar.mundotech;
import com.ar.mundotech.Computadora;

public class Orden {
    private final int idOrden;
    private Computadora computadoras[];
    private static int contadorOrdenes;
    private static int contadorComputadoras;
    private final static int MAX_COMPUTADORAS = 10;

    public Orden(){
        this.idOrden = ++Orden.contadorOrdenes;
        Computadora computadora1 = computadoras[MAX_COMPUTADORAS];
    }

    public void agregarComputadora (Computadora computadoras[]){

    }

    public void mostrarOrden(){

    }
}
