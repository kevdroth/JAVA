package ar.com.onwave.MundoPC;

public class Raton extends DispositivoEntrada{
    private int idRaton;
    private static int contadorRaton;

    public Raton(){
        super();
        idRaton = ++Raton.contadorRaton;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("ID Raton: ").append(idRaton);
        /*sb.append(super.toString()); Quiero reutilizar el toString de Disp Entrada*/
        return sb.toString();
    }
}
