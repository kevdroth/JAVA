package palabrathis;

public class PalabraThis {
    public static void main(String[] args) {

        Persona persona = new Persona("Juan", "Perez");
        System.out.println("persona = " + persona);
        System.out.println("persona nombre: " + persona.nombre);
        System.out.println("persona apellido: " + persona.apellido);
    }
}

class Persona{
    String nombre;
    String apellido;

    //constructor
    Persona (String nombre, String apellido){
        this.nombre = nombre;
        this.apellido = apellido;
        System.out.println("objeto persona: " + this);
        new Imprimir().imprimir(this);
    }
}

class Imprimir{

    //metodo
    public void imprimir(Persona persona){
        System.out.println("Persona desde imprimir: " + persona);
        System.out.println("Imprimir del objeto actual (this)" + this);
    }
}
