public class Basketbolcu extends Sporcu{
    int ikilik;
    int ucluk;
    int serbestAtis;
    String basketbolcuAdi;
    String basketbolcuTakim;

    public Basketbolcu() {
    }

    public Basketbolcu(String sporcuIsim, String sporcuTakim) {
        super(sporcuIsim, sporcuTakim);
    } 

    
    @Override
    public void sporcuPuaniGoster() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
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
