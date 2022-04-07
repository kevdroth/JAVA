package domain;

public class Persona {

    protected String nombre;
    protected char genero;
    protected int edad;

    public Persona(String nombre, char genero, int edad) {
        this.nombre = nombre;
        this.genero = genero;
        this.edad = edad;
    }

    public String getNombre(){
        return this.nombre;
    }

    public void setNombre(String nombre){
        this.nombre = nombre;
    }

    public char getGenero(){
        return this.genero;
    }

    public void setGenero(char genero){
        this.genero = genero;
    }

    public int getEdad(){
        return this.edad;
    }

    public void setEdad(int edad){
        this.edad = edad;
    }

    public String toString(){
        StringBuilder sb = new StringBuilder();
        sb.append("Nombre: ").append(this.nombre);
        sb.append(", Genero: ").append(this.genero);
        sb.append(", Edad: ").append(this.edad);
        return sb.toString();
    }
}
