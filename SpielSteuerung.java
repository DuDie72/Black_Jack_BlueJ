public class SpielSteuerung
{
    // Instanzvariablen - ersetzen Sie das folgende Beispiel mit Ihren Variablen
    private Spieler spieler1;
    private Computer spieler2;
    private Person gewinner;
    
    private Kartenstapel stock;
    

    /**
     * Konstruktor für Objekte der Klasse SpielUI
     */
    public SpielSteuerung()
    {
        spieler1 = new Spieler("Kai");
        spieler2 = new Computer("Computer");
        System.out.print("Es spielt der Spieler " + spieler1.gibName());
        System.out.println(" gegen " + spieler2.gibName());
        
        stock = new Kartenstapel();
        stock.kartenMischen();
        spielStart();
        gewinner = gewinnerErmitteln(spieler1,spieler2);
        System.out.println("Gewonnen hat: " + gewinner.gibName());
        
    }

    public void spielStart()
    {
        while (spieler1.gibGewinnpunkte() < 10 && spieler2.gibGewinnpunkte() < 10)
        {
            System.out.println("\n" + spieler1.gibName() + " ist am Zug!");
            spieler1.spielen(stock);
            spielAuswerten(spieler1, spieler2);
            
        }
    }

    public void spielAuswerten(Spieler pSpieler, Computer qSpieler)
    {
        if (pSpieler.gibErgebnis()==21)
        {
            pSpieler.gewinnpunkteErhoehen();
            System.out.println(" " + pSpieler.gibName() + " hat nun " + pSpieler.gibGewinnpunkte() + " Punkte");
            System.out.println(" " + qSpieler.gibName() + " hat nun " + qSpieler.gibGewinnpunkte() + " Punkte");
        }
        else if (pSpieler.gibErgebnis()>21)
        {
            qSpieler.gewinnpunkteErhoehen();
            System.out.println(" " + pSpieler.gibName() + " hat nun " + pSpieler.gibGewinnpunkte() + " Punkte");
            System.out.println(" " + qSpieler.gibName() + " hat nun " + qSpieler.gibGewinnpunkte() + " Punkte");
        }
        else if (pSpieler.gibErgebnis()<21)
        {
            System.out.println("\n" + qSpieler.gibName() + " ist am Zug");
            qSpieler.spielen(stock);
            if (qSpieler.gibErgebnis() > pSpieler.gibErgebnis() && qSpieler.gibErgebnis() <= 21)
            {
                qSpieler.gewinnpunkteErhoehen();
                System.out.println(" " + pSpieler.gibName() + " hat nun " + pSpieler.gibGewinnpunkte() + " Punkte");
                System.out.println(" " + qSpieler.gibName() + " hat nun " + qSpieler.gibGewinnpunkte() + " Punkte");
            }
            else
            {
                pSpieler.gewinnpunkteErhoehen();
                System.out.println(" " + pSpieler.gibName() + " hat nun " + pSpieler.gibGewinnpunkte() + " Punkte");
                System.out.println(" " + qSpieler.gibName() + " hat nun " + qSpieler.gibGewinnpunkte() + " Punkte");
            }
        }
       
    }
    
    public Person gewinnerErmitteln(Person pSpieler, Person qSpieler)
    {
        if (pSpieler.gibGewinnpunkte() > qSpieler.gibGewinnpunkte())
        {
            return pSpieler;
        }
        else
            return qSpieler;
    }
}
