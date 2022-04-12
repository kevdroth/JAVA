package ar.com.onwave.MundoPC;

public class Raton extends DispositivoEntrada{
    private final int idRaton;
    private static int contadorRaton;

    public Raton(String tipoEntrada, String marca){
        super(tipoEntrada, marca);
        this.idRaton = ++Raton.contadorRaton;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("ID Raton: ").append(idRaton);
        sb.append(super.toString());
        return sb.toString();
    }
}
