package domain;

public class LineaDTO {
    private int idLinea;
    private String usuario;
    private String equipo;
    private String plan;

    public LineaDTO() {

    }

    public LineaDTO(int idLinea) {
        this.idLinea = idLinea;
    }

    public LineaDTO(int idLinea, String usuario, String equipo, String plan) {
        this.idLinea = idLinea;
        this.usuario = usuario;
        this.equipo = equipo;
        this.plan = plan;
    }

    public int getIdLinea() {
        return this.idLinea;
    }

    public void setIdLinea(int idLinea) {
        this.idLinea = idLinea;
    }

    public String getUsuario() {
        return this.usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getPlan() {
        return this.plan;
    }

    public void setPlan(String plan) {
        this.plan = plan;
    }

    public String getEquipo() {
        return this.equipo;
    }

    public void setEquipo(String equipo) {
        this.equipo = equipo;
    }

    @Override
    public String toString() {
        return "Linea: " + idLinea + '\'' +
                ", Usuario: " + usuario + '\'' +
                ", Equipo: " + equipo + '\'' +
                ", Plan: " + plan + '\'';
    }
}
