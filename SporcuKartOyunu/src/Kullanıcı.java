public class Kullanıcı extends Oyuncu{

    public Kullanıcı() {
    }

    public Kullanıcı(String oyucuID, String oyuncuAdi, int skor) {
        super(oyucuID, oyuncuAdi, skor);
    }

    @Override
    public void KartSec() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }  
}
