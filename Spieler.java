import java.util.*;
public class Spieler extends Person
{
    private boolean weiterspielen;
    
    public Spieler(String pName)
    {
        super(pName);
        weiterspielen = true;
    }

    
    public boolean entscheiden()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Möchtest du noch eine Karte?");
        return sc.nextBoolean();
    }
    public void spielen(Kartenstapel k)
    {
        setErgebnis(0);
        // Der Spieler erhält 2 Karten
        karteNehmen(k);
        karteNehmen(k);
        weiterspielen = entscheiden(); 
        do
        {   if (weiterspielen == true)
            {
                karteNehmen(k);
                if (gibErgebnis() < 21)
                {
                   weiterspielen=entscheiden();
                }
            }
        } while (weiterspielen ==true && gibErgebnis()<21);
    }
}
