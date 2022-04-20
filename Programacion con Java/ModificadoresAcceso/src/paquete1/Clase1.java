package paquete1;

class Clase1 {
    public String atributoPublico = "Valor atributo publico";
    protected String atributoProtected = "Valor atributo protected";
    String atributoDefault = "Valor atributo default";
    private String atributoPrivado = "Valor atributo privado";

    public Clase1(String arg){
        this();
        System.out.println("Constructor publico");
    }

    private Clase1(){
        System.out.println("Constructor privado");
    }

    private void metodoPrivado(){
        System.out.println("Metodo privado");
    }

    /*Clase1(){
        System.out.println("Constructor default");
    }*/

    /*protected Clase1(){

    }*/

    protected void metodoProtected(){
        System.out.println("Metodo protected");
    }

    public void metodoPublico(){
        System.out.println("Metodo publico");
    }

    void metodoDefault(){
        System.out.println("Metodo default");
    }

    public String getAtributoPrivado() {
        return this.atributoPrivado;
    }

    public void setAtributoPrivado(String atributoPrivado) {
        this.atributoPrivado = atributoPrivado;
    }
}
