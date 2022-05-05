package domain;

/*las clases abstractas se usan para no dejar que se creen objetos de su tipo. Tienen metodos que se definen
en tiempo de ejecucion.*/

public abstract class FiguraGeometrica {
    protected String tipoFigura;

    protected FiguraGeometrica(String tipoFigura){
        this.tipoFigura = tipoFigura;
    }

    public abstract void dibujar();

    public String getTipoFigura() {
        return this.tipoFigura;
    }

    public void setTipoFigura(String tipoFigura) {
        this.tipoFigura = tipoFigura;
    }

    @Override
    public String toString() {
        return "Tipo Figura: " + tipoFigura;
    }
}
