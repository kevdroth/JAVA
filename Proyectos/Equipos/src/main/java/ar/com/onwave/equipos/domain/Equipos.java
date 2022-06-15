package ar.com.onwave.equipos.domain;

public class Equipos {
    private int idEquipos;
    private String registrado;
    private String imeiRegistrado;
    private String marcaTrafica;
    private String modeloTrafica;
    private String imeiTrafica;
    private String sim;

    public Equipos() {
    }

    public Equipos(int idEquipos) {
        this.idEquipos = idEquipos;
    }

    public Equipos(String registrado, String imeiRegistrado, String marcaTrafica, String modeloTrafica, String imeiTrafica, String sim) {
        this.registrado = registrado;
        this.imeiRegistrado = imeiRegistrado;
        this.marcaTrafica = marcaTrafica;
        this.modeloTrafica = modeloTrafica;
        this.imeiTrafica = imeiTrafica;
        this.sim = sim;
    }

    public Equipos(int idEquipos, String registrado, String imeiRegistrado, String marcaTrafica, String modeloTrafica, String imeiTrafica, String sim) {
        this.idEquipos = idEquipos;
        this.registrado = registrado;
        this.imeiRegistrado = imeiRegistrado;
        this.marcaTrafica = marcaTrafica;
        this.modeloTrafica = modeloTrafica;
        this.imeiTrafica = imeiTrafica;
        this.sim = sim;
    }

    public int getIdEquipos() {
        return idEquipos;
    }

    public void setIdEquipos(int idEquipos) {
        this.idEquipos = idEquipos;
    }

    public String getRegistrado() {
        return registrado;
    }

    public void setRegistrado(String registrado) {
        this.registrado = registrado;
    }

    public String getImeiRegistrado() {
        return imeiRegistrado;
    }

    public void setImeiRegistrado(String imeiRegistrado) {
        this.imeiRegistrado = imeiRegistrado;
    }

    public String getMarcaTrafica() {
        return marcaTrafica;
    }

    public void setMarcaTrafica(String marcaTrafica) {
        this.marcaTrafica = marcaTrafica;
    }

    public String getModeloTrafica() {
        return modeloTrafica;
    }

    public void setModeloTrafica(String modeloTrafica) {
        this.modeloTrafica = modeloTrafica;
    }

    public String getImeiTrafica() {
        return imeiTrafica;
    }

    public void setImeiTrafica(String imeiTrafica) {
        this.imeiTrafica = imeiTrafica;
    }

    public String getSim() {
        return sim;
    }

    public void setSim(String sim) {
        this.sim = sim;
    }

    @Override
    public String toString() {
        return "Equipos{" +
                "idEquipos=" + idEquipos +
                ", registrado='" + registrado + '\'' +
                ", imeiRegistrado='" + imeiRegistrado + '\'' +
                ", marcaTrafica='" + marcaTrafica + '\'' +
                ", modeloTrafica='" + modeloTrafica + '\'' +
                ", imeiTrafica='" + imeiTrafica + '\'' +
                ", sim='" + sim + '\'' +
                '}';
    }
}
