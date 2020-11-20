public abstract class Oyuncu {
    String oyucuID;
    String oyuncuAdi;
    int skor;

    public Oyuncu() {
    }

    public Oyuncu(String oyucuID, String oyuncuAdi, int skor) {
        this.oyucuID = oyucuID;
        this.oyuncuAdi = oyuncuAdi;
        this.skor = skor;
    }
    
    public void SkorGoster() {
        
    }
    
    public abstract void KartSec();
}
