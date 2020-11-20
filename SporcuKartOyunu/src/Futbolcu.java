public class Futbolcu extends Sporcu{

    int penalti;
    int serbestAtis;
    int kaleciKarsiKarsiya;
    String futbolcuAdi;
    String futbolcuTakim;

    public Futbolcu() {
    }

    public Futbolcu(String futbolcuAdi, String futbolcuTakim) {
        super(futbolcuAdi, futbolcuTakim);
    }  
    
    @Override
    public void sporcuPuaniGoster() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    boolean kartKullanildiMi;

    public int getPenalti() {
        return penalti;
    }

    public void setPenalti(int penalti) {
        this.penalti = penalti;
    }

    public int getSerbestAtis() {
        return serbestAtis;
    }

    public void setSerbestAtis(int serbestAtis) {
        this.serbestAtis = serbestAtis;
    }

    public int getKaleciKarsiKarsiya() {
        return kaleciKarsiKarsiya;
    }

    public void setKaleciKarsiKarsiya(int kaleciKarsiKarsiya) {
        this.kaleciKarsiKarsiya = kaleciKarsiKarsiya;
    }
    
    
}
