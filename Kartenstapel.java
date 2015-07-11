import java.util.*;
public class Kartenstapel
{
    // Instanzvariablen - ersetzen Sie das folgende Beispiel mit Ihren Variablen
    private Stack kartenstapel;
    /**
     * Konstruktor für Objekte der Klasse Kartenstapel
     */
    public Kartenstapel()
    {
        kartenstapel = new Stack();
        kartenMischen();
    }
    public Stack gibKartenstapel()
    {
        return kartenstapel;
    }
    public void kartenMischen()
    {
        boolean abhaken[] = new boolean[52];
        Random r = new Random();
        int a=0;
        
        do
        {
            int i = r.nextInt(52);
            if (abhaken[i]== false)
            {    
                abhaken[i]= true;
                kartenstapel.push(new Karte(i));
                a++;
            }        
        }while(a < 52);
    }
}
