package domain;

public class Empleado extends Persona{
    private int idEmpleado;
    private double sueldo;
    private static int contadorEmpleado;

    public Empleado(){
        this.idEmpleado = ++Empleado.contadorEmpleado;
    }

    public Empleado(String nombre, double sueldo) {
        this(); //sobrecarga de constructor
        this.nombre = nombre;
        this.sueldo = sueldo;
    }

    public int getIdEmpleado() {
        return this.idEmpleado;
    }

    public double getSueldo() {
        return this.sueldo;
    }

    public void setSueldo(double sueldo) {
        this.sueldo = sueldo;
    }

    public String toString(){
        StringBuilder sb = new StringBuilder();
        sb.append("Empleado{idEmpleado: ").append(this.idEmpleado);
        sb.append(", sueldo: ").append(this.sueldo);
        sb.append(super.toString()).append("}");
        sb.append("}");
        return sb.toString();
    }
}

