package oyuncular;

import java.util.ArrayList;
import java.util.Random;
import sporcular.*;

public class Bilgisayar extends Oyuncu{
  
    public Bilgisayar() {
    }

    public Bilgisayar(String oyucuID, String oyuncuAdi, int skor) {
        super(oyucuID, oyuncuAdi, skor);
    }
    
    @Override
    public Sporcu KartSec() {
        
        int k = new Random().nextInt(this.kartSayisi());

	int count = 0;
	for (int i = 0; i < this.sporcular.size(); i++)
	{
		if (this.sporcular.get(i) == null || this.sporcular.get(i).kartKullanildiMi)
			continue;

		if (count == k)
		{
			return this.sporcular.get(i);
		}
		count++;
	}
        
        return null;
    }
}
