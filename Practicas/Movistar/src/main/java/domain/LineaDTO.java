package domain;

public class LineaDTO {
    private int idLineaUsuario;
    private String linea;
    private String usuario;
    private String equipo;
    private String plan;

    public LineaDTO() {

    }

    public LineaDTO(int idLineaUsuario) {
        this.idLineaUsuario = idLineaUsuario;
    }

    public LineaDTO(int idLineaUsuario, String linea, String usuario, String equipo, String plan) {
        this.idLineaUsuario = idLineaUsuario;
        this.linea = linea;
        this.usuario = usuario;
        this.equipo = equipo;
        this.plan = plan;
    }

    public int getIdLineaUsuario() {
        return this.idLineaUsuario;
    }

    public void setIdLineaUsuario(int idLineaUsuario) {
        this.idLineaUsuario = idLineaUsuario;
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

    public String getLinea() {
        return this.linea;
    }

    public void setLinea(String linea) {
        this.linea = linea;
    }

    @Override
    public String toString() {
        return "ID LINEA USUARIO: " + idLineaUsuario + '\'' +
                ", Linea: " + linea + '\'' +
                ", Usuario: " + usuario + '\'' +
                ", Equipo: " + equipo + '\'' +
                ", Plan: " + plan + '\'';
    }
}
