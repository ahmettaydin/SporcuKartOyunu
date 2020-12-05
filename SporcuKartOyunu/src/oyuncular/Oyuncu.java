package oyuncular;

import java.util.ArrayList;
import sporcular.Sporcu;

public abstract class Oyuncu {

    private String oyucuID;
    private String oyuncuAdi;
    private int skor;

    public ArrayList<Sporcu> sporcular = new ArrayList<Sporcu>();

    public Oyuncu() {
    }

    public Oyuncu(String oyucuID, String oyuncuAdi, int skor) {
        this.oyucuID = oyucuID;
        this.oyuncuAdi = oyuncuAdi;
        this.skor = skor;
    }

    public String getOyucuID() {
        return oyucuID;
    }

    public void setOyucuID(String oyucuID) {
        this.oyucuID = oyucuID;
    }

    public String getOyuncuAdi() {
        return oyuncuAdi;
    }

    public void setOyuncuAdi(String oyuncuAdi) {
        this.oyuncuAdi = oyuncuAdi;
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

    public abstract int KartSec(int deger);

    public abstract void kartKullan(Sporcu sporcu);
}
