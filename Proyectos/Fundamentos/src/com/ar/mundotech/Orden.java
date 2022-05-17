package com.ar.mundotech;
import com.ar.mundotech.Computadora;

public class Orden {
    private final int idOrden;
    private Computadora computadoras[];
    private static int contadorOrdenes;
    private int contadorComputadoras;
    private final static int MAX_COMPUTADORAS = 10;

    public Orden(){ //inicializo array y contador/id
        this.idOrden = ++Orden.contadorOrdenes;
        this.computadoras = new Computadora[MAX_COMPUTADORAS];
    }

    public void agregarComputadora (Computadora computadora){
        if (contadorComputadoras < Orden.MAX_COMPUTADORAS){ //valído
            this.computadoras[this.contadorComputadoras++] = computadora;
        }else{
            System.out.println("Se supero el maximo de PCs: " + Orden.MAX_COMPUTADORAS);
        }
    }
    public void mostrarOrden(){
        System.out.println("Orden ID: " + this.idOrden);
        for (int i=0; i < contadorComputadoras; i++){
            System.out.println(computadoras[i]);
        }
    }
}
