package oyuncular;

import java.util.ArrayList;
import sporcular.Sporcu;

public abstract class Oyuncu {

    String oyucuID;
    String oyuncuAdi;
    int skor;

    public ArrayList<Sporcu> sporcular = new ArrayList<Sporcu>();

    public ArrayList<Sporcu> getSporcular() {
        return sporcular;
    }

    public void setSporcular(ArrayList<Sporcu> sporcular) {
        this.sporcular = sporcular;
    }

    public Oyuncu() {
    }

    public int kartSayisi() {
        int counter = 0;
        for (int i = 0; i < sporcular.size(); i++) {
            if (sporcular.get(i) != null) {
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

    public int getSkor() {
        return skor;
    }

    public void setSkor(int skor) {
        this.skor = skor;
    }

    public int KartSec(int deger) {
        return -1;
    }
}
