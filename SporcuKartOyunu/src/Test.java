public class Test {
    public static void main(String[] args) {
        Game game = new Game();
        game.setVisible(true);
        
        Futbolcu messi = new Futbolcu("Lionel Messi", "Barcelona");
        Futbolcu ronaldo = new Futbolcu("Christiano Ronaldo", "Juventus");
        Futbolcu carlos = new Futbolcu("Roberto Carlos", "Fenerbahçe");
        Futbolcu neymar = new Futbolcu("Neymar JR", "Paris");
        Futbolcu robben = new Futbolcu("Arjen Robben", "Bayern Munich");
        Futbolcu drogba = new Futbolcu("Didier Drogba", "Galatasaray");
        Futbolcu metin = new Futbolcu("Metin Oktay", "Galatasaray");
        Futbolcu suarez = new Futbolcu("Luis Suarez", "Barcelona");
        
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
        
        drogba.setPenalti(95);
        drogba.setSerbestAtis(80);
        drogba.setKaleciKarsiKarsiya(80);
        
        metin.setPenalti(90);
        metin.setSerbestAtis(85);
        metin.setKaleciKarsiKarsiya(95);
        
        suarez.setPenalti(75);
        suarez.setSerbestAtis(70);
        suarez.setKaleciKarsiKarsiya(75);
        
        Basketbolcu harden = new Basketbolcu("James Harden", "Housten Rockets");
        Basketbolcu lebron = new Basketbolcu("Lebron James", "LA Lakers");
        Basketbolcu kobe = new Basketbolcu("Kobe Bryant", "LA Lakers");
        Basketbolcu durant = new Basketbolcu("Kevin Durant", "Brooklyn Nets");
        Basketbolcu curry = new Basketbolcu("Stephen Curry", "Golden State");
        Basketbolcu jordan = new Basketbolcu("Michael Jordan", "Chicago Bulls");
        Basketbolcu cedi = new Basketbolcu("Cedi Osman", "Cleveland Cavailers");
        Basketbolcu luka = new Basketbolcu("Luka Doncic", "Dallas Mavericks");
        
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
        
    }
}
