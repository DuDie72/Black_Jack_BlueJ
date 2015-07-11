public class Computer extends Person
{
   
    public Computer(String pName)
    {
        super("Computer");
    }

    public void spielen(Kartenstapel k)
    {
        setErgebnis(0);
        // Der Spieler erhält 2 Karten
        while (gibErgebnis()<17)
        {
            karteNehmen(k);
        }
    }
}
