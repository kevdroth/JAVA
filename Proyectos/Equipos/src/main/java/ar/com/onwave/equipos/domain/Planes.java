package ar.com.onwave.equipos.domain;

public class Planes {
    private int idPlanes;
    private String nombre;
    private double precio;
    private String internet;
    private String minutos;
    private String sms;

    public Planes() {
    }

    public Planes(int idPlanes) {
        this.idPlanes = idPlanes;
    }

    public Planes(int idPlanes, String nombre, double precio, String internet, String minutos, String sms) {
        this.idPlanes = idPlanes;
        this.nombre = nombre;
        this.precio = precio;
        this.internet = internet;
        this.minutos = minutos;
        this.sms = sms;
    }

    public Planes(String nombre, double precio, String internet, String minutos, String sms) {
        this.nombre = nombre;
        this.precio = precio;
        this.internet = internet;
        this.minutos = minutos;
        this.sms = sms;
    }

    public int getIdPlanes() {
        return idPlanes;
    }

    public void setIdPlanes(int idPlanes) {
        this.idPlanes = idPlanes;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public String getInternet() {
        return internet;
    }

    public void setInternet(String internet) {
        this.internet = internet;
    }

    public String getMinutos() {
        return minutos;
    }

    public void setMinutos(String minutos) {
        this.minutos = minutos;
    }

    public String getSms() {
        return sms;
    }

    public void setSms(String sms) {
        this.sms = sms;
    }

    @Override
    public String toString() {
        return "Planes{" +
                "idPlanes=" + idPlanes +
                ", nombre='" + nombre + '\'' +
                ", precio=" + precio +
                ", internet='" + internet + '\'' +
                ", minutos='" + minutos + '\'' +
                ", sms='" + sms + '\'' +
                '}';
    }
}
