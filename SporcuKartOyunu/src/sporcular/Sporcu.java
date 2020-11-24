package sporcular;

public abstract class Sporcu {
    private String sporcuIsim;
    private String sporcuTakim;
    public boolean kartKullanildiMi;
    
    public Sporcu() {
    }

    public Sporcu(String sporcuIsim, String sporcuTakim) {
        this.setSporcuIsim(sporcuIsim);
        this.setSporcuTakim(sporcuTakim);
    }
    
    public abstract int sporcuPuaniGoster(int i);

    public String getSporcuIsim() {
        return sporcuIsim;
    }

    public void setSporcuIsim(String sporcuIsim) {
        this.sporcuIsim = sporcuIsim;
    }

    public String getSporcuTakim() {
        return sporcuTakim;
    }

    public void setSporcuTakim(String sporcuTakim) {
        this.sporcuTakim = sporcuTakim;
    }
}