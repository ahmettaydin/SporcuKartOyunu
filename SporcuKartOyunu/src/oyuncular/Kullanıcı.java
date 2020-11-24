package oyuncular;

import sporcular.Sporcu;

public class Kullanıcı extends Oyuncu{

    public Kullanıcı() {
    }

    public Kullanıcı(String oyucuID, String oyuncuAdi, int skor) {
        super(oyucuID, oyuncuAdi, skor);
    }
    
    @Override
    public Sporcu KartSec() {
        return null;
    }
    
}
