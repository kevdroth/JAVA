package ar.com.onwave.equipos.domain;

public class Lineas {
    private int idLineas;
    private int idPlan;
    private String numero;

    public Lineas() {
    }

    public Lineas(int idLineas) {
        this.idLineas = idLineas;
    }

    public Lineas(int idPlan, String numero) {
        this.idPlan = idPlan;
        this.numero = numero;
    }

    public Lineas(int idLineas, int idPlan) {
        this.idLineas = idLineas;
        this.idPlan = idPlan;
    }

    public Lineas(int idLineas, int idPlan, String numero) {
        this.idLineas = idLineas;
        this.idPlan = idPlan;
        this.numero = numero;
    }

    public int getIdLineas() {
        return idLineas;
    }

    public void setIdLineas(int idLineas) {
        this.idLineas = idLineas;
    }

    public int getIdPlan() {
        return idPlan;
    }

    public void setIdPlan(int idPlan) {
        this.idPlan = idPlan;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    @Override
    public String toString() {
        return "Lineas{" +
                "idLineas=" + idLineas +
                ", idPlan=" + idPlan +
                ", numero='" + numero + '\'' +
                '}';
    }
}
