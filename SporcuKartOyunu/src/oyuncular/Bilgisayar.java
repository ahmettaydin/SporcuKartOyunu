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
    
    public void kartKullan(Sporcu sporcu){
       
       sporcu.setKartKullanildiMi(true);
        
    }
    
    @Override
    public int KartSec(int deger) {
        
        int k ; 

	int count = 0;
        if(deger ==1){
            k=new Random().nextInt(4);
            
            for (int i = 0; i < 4; i++)
	{
		if (this.sporcular.get(i) == null || this.sporcular.get(i).isKartKullanildiMi())
			continue;

		if (count == k)
		{
			return k;
		}
		count++;
                
            
	  }
        }
	
        
        
        else {
            k=new Random().nextInt(4)+4;
             for (int i = 0; i < this.sporcular.size(); i++)
	{
		if (this.sporcular.get(i) == null || this.sporcular.get(i).isKartKullanildiMi())
			continue;

		if (count == k)
		{
			return k ;
		}
		count++;
	}
             
        }
       
        
        return -1;
    }
}
