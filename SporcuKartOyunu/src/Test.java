import sporcular.*;
import java.util.ArrayList;
import java.util.Collections;
import oyuncular.*;

public class Test {
    public static void main(String[] args) {
        Game game = new Game();
        game.setVisible(true);
        
        Futbolcu messi = new Futbolcu("Lionel Messi", "Barcelona", "images/messi.png");
        Futbolcu ronaldo = new Futbolcu("Christiano Ronaldo", "Juventus", "images/ronaldo.png");
        Futbolcu carlos = new Futbolcu("Roberto Carlos", "Fenerbahçe", "images/carlos.png");
        Futbolcu neymar = new Futbolcu("Neymar JR", "Paris", "images/neymar.png");
        Futbolcu robben = new Futbolcu("Arjen Robben", "Bayern Munich", "images/robben.png");
        Futbolcu feyyaz = new Futbolcu("Feyyaz Uçar", "Galatasaray", "images/feyyaz.png");
        Futbolcu metin = new Futbolcu("Metin Oktay", "Galatasaray", "images/metin.png");
        Futbolcu suarez = new Futbolcu("Luis Suarez", "Barcelona", "images/suarez.png");
        
        messi.setPenalti(100);
        messi.setSerbestAtis(75);
        messi.setKaleciKarsiKarsiya(90);
        
        ronaldo.setPenalti(100);
        ronaldo.setSerbestAtis(90);
        ronaldo.setKaleciKarsiKarsiya(85);
        
        carlos.setPenalti(80);
        carlos.setSerbestAtis(100);
        carlos.setKaleciKarsiKarsiya(65);
        
        neymar.setPenalti(90);
        neymar.setSerbestAtis(80);
        neymar.setKaleciKarsiKarsiya(100);
        
        robben.setPenalti(85);
        robben.setSerbestAtis(95);
        robben.setKaleciKarsiKarsiya(90);
        
        feyyaz.setPenalti(95);
        feyyaz.setSerbestAtis(80);
        feyyaz.setKaleciKarsiKarsiya(80);
        
        metin.setPenalti(90);
        metin.setSerbestAtis(85);
        metin.setKaleciKarsiKarsiya(95);
        
        suarez.setPenalti(75);
        suarez.setSerbestAtis(70);
        suarez.setKaleciKarsiKarsiya(75);
        
        Basketbolcu harden = new Basketbolcu("James Harden", "Housten Rockets", "images/harden.png");
        Basketbolcu lebron = new Basketbolcu("Lebron James", "LA Lakers", "images/lebron.png");
        Basketbolcu kobe = new Basketbolcu("Kobe Bryant", "LA Lakers", "images/kobe.png");
        Basketbolcu durant = new Basketbolcu("Kevin Durant", "Brooklyn Nets", "images/durant.png");
        Basketbolcu curry = new Basketbolcu("Stephen Curry", "Golden State", "images/curry.png");
        Basketbolcu jordan = new Basketbolcu("Michael Jordan", "Chicago Bulls", "images/jordan.png");
        Basketbolcu cedi = new Basketbolcu("Cedi Osman", "Cleveland Cavailers", "images/cedi.png");
        Basketbolcu luka = new Basketbolcu("Luka Doncic", "Dallas Mavericks", "images/luka.png");
        
        harden.setIkilik(70);
        harden.setUcluk(85);
        harden.setSerbestAtis(65);
        
        lebron.setIkilik(95);
        lebron.setUcluk(90);
        lebron.setSerbestAtis(100);

        kobe.setIkilik(85);
        kobe.setUcluk(75);
        kobe.setSerbestAtis(80);

        durant.setIkilik(90);
        durant.setUcluk(85);
        durant.setSerbestAtis(75);

        curry.setIkilik(75);
        curry.setUcluk(100);
        curry.setSerbestAtis(70);

        jordan.setIkilik(100);
        jordan.setUcluk(80);
        jordan.setSerbestAtis(95);
       
        cedi.setIkilik(85);
        cedi.setUcluk(70);
        cedi.setSerbestAtis(75);

        luka.setIkilik(90);
        luka.setUcluk(95);
        luka.setSerbestAtis(60);
       
        ArrayList<Sporcu> futbolcular = new ArrayList<Sporcu>();
        futbolcular.add(messi);
        futbolcular.add(ronaldo);
        futbolcular.add(carlos);
        futbolcular.add(neymar);
        futbolcular.add(robben);
        futbolcular.add(feyyaz);
        futbolcular.add(metin);
        futbolcular.add(suarez);
        
        ArrayList<Sporcu> basketbolcular = new ArrayList<Sporcu>();
        basketbolcular.add(harden);
        basketbolcular.add(lebron);
        basketbolcular.add(kobe);
        basketbolcular.add(durant);
        basketbolcular.add(curry);
        basketbolcular.add(jordan);
        basketbolcular.add(cedi);
        basketbolcular.add(luka);
        
        Collections.shuffle(futbolcular);
        Collections.shuffle(basketbolcular);
        
    }
}
