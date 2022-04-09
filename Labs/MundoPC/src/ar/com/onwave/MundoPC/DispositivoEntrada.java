package ar.com.onwave.MundoPC;

public class DispositivoEntrada {
    protected String tipoEntrada;
    protected String marca;

    public void DispositivoEntrada(){

    }

    @Override
    public String toString() {
        return "Tipo Entrada: " + this.tipoEntrada +
                ", Marca: " + this.marca;
    }

    public String getTipoEntrada() {
        return tipoEntrada;
    }

    public void setTipoEntrada(String tipoEntrada) {
        this.tipoEntrada = tipoEntrada;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        marca = marca;
    }
}
