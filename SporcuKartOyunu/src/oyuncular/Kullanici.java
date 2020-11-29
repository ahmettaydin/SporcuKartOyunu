package oyuncular;

import java.util.ArrayList;
import sporcular.Sporcu;

public class Kullanici extends Oyuncu{
    
    
    public Kullanici() {
    }

    public Kullanici(String oyucuID, String oyuncuAdi, int skor) {
        super(oyucuID, oyuncuAdi, skor);
    }
    
    @Override
    public Sporcu KartSec() {
        return null;
    }
    
}
