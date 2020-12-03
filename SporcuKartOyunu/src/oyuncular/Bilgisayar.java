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
            
            
            while (true) 
                
	{      
            k=new Random().nextInt(4);
		if (this.sporcular.get(k) == null || this.sporcular.get(k).isKartKullanildiMi())
			continue;
                else{
                    kartKullan(this.sporcular.get(k));
                    return k;
                }
                    
	  }
        }
	
        
        
        else {
            
             while(true)
	{       k=new Random().nextInt(4)+4;
		if (this.sporcular.get(k) == null || this.sporcular.get(k).isKartKullanildiMi())
			continue;
                else{
                    kartKullan(this.sporcular.get(k));
                    return k;
                }
	}
             
        }
       
        
    }
}
