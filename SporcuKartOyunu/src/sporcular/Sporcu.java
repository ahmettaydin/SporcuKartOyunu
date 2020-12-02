package sporcular;

public abstract class Sporcu {
    private String sporcuIsim;
    private String sporcuTakim;
    private String resimYolu;

    public String getResimYolu() {
        return resimYolu;
    }

    public void setResimYolu(String resimYolu) {
        this.resimYolu = resimYolu;
    }
    private boolean kartKullanildiMi;

    public boolean isKartKullanildiMi() {
        return kartKullanildiMi;
    }

    public void setKartKullanildiMi(boolean kartKullanildiMi) {
        this.kartKullanildiMi = kartKullanildiMi;
    }
    
    
    
    
    public Sporcu() {
    }

    public Sporcu(String sporcuIsim, String sporcuTakim, String resimYolu) {
        this.setSporcuIsim(sporcuIsim);
        this.setSporcuTakim(sporcuTakim);
        this.setResimYolu(resimYolu);
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