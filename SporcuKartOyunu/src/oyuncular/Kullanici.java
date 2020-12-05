package oyuncular;

import sporcular.Sporcu;

public class Kullanici extends Oyuncu {
    
    public Kullanici() {
    }
    
    public Kullanici(String oyucuID, String oyuncuAdi, int skor) {
        super(oyucuID, oyuncuAdi, skor);
    }
    
    @Override
    public int KartSec(int deger) {
        kartKullan(this.sporcular.get(deger));
        return -1;
    }
    
    @Override
    public void kartKullan(Sporcu sporcu) {
        sporcu.setKartKullanildiMi(true);
    }
    
}
