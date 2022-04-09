package domain;

public class Cliente extends Persona{
    private static int contadorCliente;
    private int idCliente;
    private String empresa;
    private boolean vip;

    public Cliente(String nombre, char genero, int edad, String empresa, boolean vip){
        super(nombre, genero, edad);
        this.empresa = empresa;
        this.vip = vip;
        this.idCliente = ++Cliente.contadorCliente;
    }

    public int getIdCliente() {
        return this.idCliente;
    }

    public String getEmpresa() {
        return this.empresa;
    }

    public void setEmpresa(String empresa) {
        this.empresa = empresa;
    }

    public boolean isVip() {
        return this.vip;
    }

    public void setVip(boolean vip) {
        this.vip = vip;
    }

    public String toString(){
        StringBuilder sb = new StringBuilder();
        sb.append("ID: ").append(this.idCliente);
        sb.append(", Empresa: ").append(empresa);
        sb.append(", VIP: ").append(vip);
        sb.append(", ").append(super.toString());
        return sb.toString();
    }
}
