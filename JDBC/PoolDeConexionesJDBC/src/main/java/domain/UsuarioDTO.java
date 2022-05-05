package domain;

public class UsuarioDTO {
    private int idusuario;
    private String usuario;
    private String password;

    public UsuarioDTO() {
    }

    public UsuarioDTO(int idusuario) {
        this.idusuario = idusuario;
    }

    public UsuarioDTO(int idusuario, String usuario, String password) {
        this.idusuario = idusuario;
        this.usuario = usuario;
        this.password = password;
    }

    public UsuarioDTO(String usuario, String password) {
        this.usuario = usuario;
        this.password = password;
    }

    public int getIdusuario() {
        return idusuario;
    }

    public void setIdusuario(int idusuario) {
        this.idusuario = idusuario;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public String toString() {
        return "id: " + idusuario +
                ", usuario: " + usuario +
                ", password: " + password ;
    }
}
