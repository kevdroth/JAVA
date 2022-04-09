package ar.com.onwave.MundoPC;

public class Monitor {
    private static int idMonitor;
    private String marca;
    private double tamaño;
    private static int contadorMonitores;

    public Monitor(){
        idMonitor = ++contadorMonitores;
    }

    public Monitor(String marca, double tamaño){
        this.marca = marca;
        this.tamaño = tamaño;
    }

    @Override
    public String toString() {
        return "ID Monitor: " + idMonitor +
                ", Marca: " + marca +
                ", Tamaño: " + tamaño;
    }

    public int getIdMonitor() {
        return idMonitor;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public double getTamaño() {
        return tamaño;
    }

    public void setTamaño(double tamaño) {
        this.tamaño = tamaño;
    }

    public static int getContadorMonitores() {
        return contadorMonitores;
    }

}
