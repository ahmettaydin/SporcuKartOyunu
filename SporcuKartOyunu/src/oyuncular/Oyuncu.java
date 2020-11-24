package oyuncular;

import java.util.ArrayList;
import sporcular.Sporcu;

public abstract class Oyuncu {
    String oyucuID;
    String oyuncuAdi;
    int skor;
    
    ArrayList<Sporcu> sporcular = new ArrayList<Sporcu>();
    
    public Oyuncu() {
    }

    public int kartSayisi() {
        int counter=0;
        for(int i=0; i<sporcular.size(); i++) {
            if(sporcular.get(i) != null) {
                counter++;
            }
        }
        return counter;
    }
     
    public Oyuncu(String oyucuID, String oyuncuAdi, int skor) {
        this.oyucuID = oyucuID;
        this.oyuncuAdi = oyuncuAdi;
        this.skor = skor;
    }
    
    public int SkorGoster() {
        return skor;
    }
    
    public abstract Sporcu KartSec();
}
