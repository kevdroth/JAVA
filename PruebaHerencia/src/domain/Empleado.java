package domain;

public class Empleado extends Persona{
    private static int contadorEmpleado;
    private int idEmpleado;
    private String area;

    public Empleado(String nombre, char genero, int edad, String area) {
        super(nombre, genero, edad);
        this.idEmpleado = ++Empleado.contadorEmpleado;
        this.area = area;
    }

    public int getIdEmpleado() {
        return this.idEmpleado;
    }

    public String getArea() {
        return this.area;
    }

    public void setArea(String area) {
        this.area = area;
    }

    public String toString(){
        StringBuilder sb = new StringBuilder();
        sb.append("ID: ").append(idEmpleado);
        sb.append(", Area: ").append(area);
        sb.append(", ").append(super.toString());
        return sb.toString();
    }
}
