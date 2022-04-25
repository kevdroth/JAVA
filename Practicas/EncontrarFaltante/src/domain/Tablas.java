package domain;

public class Tablas {

    private int nca;
    private int ncb;
    private int fca;
    private int fcb;

    public Tablas(){

    }

    public Tablas(int nca, int ncb, int fca, int fcb){
        this.nca = nca;
        this.ncb = ncb;
        this.fca = fca;
        this.fcb = fcb;
    }

    public void calcular(){

    }

    public int getNca() {
        return this.nca;
    }

    public void setNca(int nca) {
        this.nca = nca;
    }

    public int getNcb() {
        return this.ncb;
    }

    public void setNcb(int ncb) {
        this.ncb = ncb;
    }

    public int getFca() {
        return this.fca;
    }

    public void setFca(int fca) {
        this.fca = fca;
    }

    public int getFcb() {
        return this.fcb;
    }

    public void setFcb(int fcb) {
        this.fcb = fcb;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("NC A: ").append(nca);
        sb.append("NC B: ").append(ncb);
        sb.append("FC A: ").append(fca);
        sb.append("FC B: ").append(fcb);
        return sb.toString();
    }
}
