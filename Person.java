public abstract class Person
{
    // Instanzvariablen - ersetzen Sie das folgende Beispiel mit Ihren Variablen
    private String name;
    private int ergebnis =0;
    private int gewinnpunkte;

    public Person(String pName)
    {
        this.name = pName;
        gewinnpunkte = 0;
    }

    public String gibName()
    {
        return name;
    }
    public int gibErgebnis()
    {
        return ergebnis;
    }
    public void setErgebnis(int pErgebnis)
    {
        ergebnis = pErgebnis;
    }
    public int gibGewinnpunkte()
    {
        return gewinnpunkte;
    }
    public void gewinnpunkteErhoehen()
    {
        gewinnpunkte++;
    }
    public void addiereZuErgebnis(int a)
    {
        ergebnis = ergebnis + a;
    }
    public void karteNehmen(Kartenstapel k)
    {
         if (k.gibKartenstapel().isEmpty())
         {
             System.out.println("Es wird neu gemischt!");
             k.kartenMischen();
         }
             Karte karte = (Karte)k.gibKartenstapel().top();
             k.gibKartenstapel().pop();
             addiereZuErgebnis(karte.kartenWert());
             System.out.println("Name: " + gibName() + "\t Kartenwert: " + karte.kartenWert() + "\t Ergebnis: " + gibErgebnis());
    }
    public abstract void spielen(Kartenstapel k);
    
}
