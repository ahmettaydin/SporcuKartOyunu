package sporcular;

public class Futbolcu extends Sporcu{

    private int penalti;
    private int serbestAtis;
    private int kaleciKarsiKarsiya;
    
    public Futbolcu() {
    }

    public Futbolcu(String sporcuIsim, String sporcuTakim, String resimYolu) {
        super(sporcuIsim, sporcuTakim, resimYolu);
    }
    
    @Override
    public int sporcuPuaniGoster(int i) {
        if(i==0) 
            return penalti;
        else if(i==1)
            return serbestAtis;
        else
            return kaleciKarsiKarsiya;    
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
