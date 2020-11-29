package sporcular;

public class Basketbolcu extends Sporcu {
    private int ikilik;
    private int ucluk;
    private int serbestAtis;

    public Basketbolcu() {
    }

    public Basketbolcu(String sporcuIsim, String sporcuTakim, String resimYolu) {
        super(sporcuIsim, sporcuTakim, resimYolu);
    } 

    
    @Override
    public int sporcuPuaniGoster(int i) {
        if(i==0) 
            return ikilik;
        else if(i==1)
            return ucluk;
        else
            return serbestAtis;
    }
    
    boolean kartKullanildiMi;

    public int getIkilik() {
        return ikilik;
    }

    public void setIkilik(int ikilik) {
        this.ikilik = ikilik;
    }

    public int getUcluk() {
        return ucluk;
    }

    public void setUcluk(int ucluk) {
        this.ucluk = ucluk;
    }

    public int getSerbestAtis() {
        return serbestAtis;
    }

    public void setSerbestAtis(int serbestAtis) {
        this.serbestAtis = serbestAtis;
    }
    
    
}
