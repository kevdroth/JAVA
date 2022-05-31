package domain;

public class Datos {

    private int minNCA;
    private int maxNCA;
    private int minNCB;
    private int maxNCB;
    private int minFCA;
    private int maxFCA;
    private int minFCB;
    private int maxFCB;

    public Datos(){

    }

    public Datos(int minNCA, int maxNCA, int minNCB, int maxNCB, int minFCA, int maxFCA, int minFCB, int maxFCB) {
        this.minNCA = minNCA;
        this.maxNCA = maxNCA;
        this.minNCB = minNCB;
        this.maxNCB = maxNCB;
        this.minFCA = minFCA;
        this.maxFCA = maxFCA;
        this.minFCB = minFCB;
        this.maxFCB = maxFCB;
    }

    public int getMinNCA() {
        return this.minNCA;
    }

    public void setMinNCA(int minNCA) {
        this.minNCA = minNCA;
    }

    public int getMaxNCA() {
        return this.maxNCA;
    }

    public void setMaxNCA(int maxNCA) {
        this.maxNCA = maxNCA;
    }

    public int getMinNCB() {
        return this.minNCB;
    }

    public void setMinNCB(int minNCB) {
        this.minNCB = minNCB;
    }

    public int getMaxNCB() {
        return this.maxNCB;
    }

    public void setMaxNCB(int maxNCB) {
        this.maxNCB = maxNCB;
    }

    public int getMinFCA() {
        return this.minFCA;
    }

    public void setMinFCA(int minFCA) {
        this.minFCA = minFCA;
    }

    public int getMaxFCA() {
        return this.maxFCA;
    }

    public void setMaxFCA(int maxFCA) {
        this.maxFCA = maxFCA;
    }

    public int getMinFCB() {
        return this.minFCB;
    }

    public void setMinFCB(int minFCB) {
        this.minFCB = minFCB;
    }

    public int getMaxFCB() {
        return this.maxFCB;
    }

    public void setMaxFCB(int maxFCB) {
        this.maxFCB = maxFCB;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("TOTAL NC A: ").append(maxNCA - minNCA + 1).append(",     empezando por la " + minNCA + "     hasta " + maxNCA).append("   |   PROXIMO MES EMPIEZA EN: ").append(maxNCA + 1).append("\n");
        sb.append("TOTAL NC B: ").append(maxNCB - minNCB + 1).append(",     empezando por la " + minNCB + "     hasta " + maxNCB).append("   |   PROXIMO MES EMPIEZA EN: ").append(maxNCB + 1).append("\n");
        sb.append("TOTAL FC A: ").append(maxFCA - minFCA + 1).append(",     empezando por la " + minFCA + "     hasta " + maxFCA).append("   |   PROXIMO MES EMPIEZA EN: ").append(maxFCA + 1).append("\n");
        sb.append("TOTAL FC B: ").append(maxFCB - minFCB + 1).append(",     empezando por la " + minFCB + "     hasta " + maxFCB).append("   |   PROXIMO MES EMPIEZA EN: ").append(maxFCB + 1).append("\n");
        return sb.toString();
    }
}
