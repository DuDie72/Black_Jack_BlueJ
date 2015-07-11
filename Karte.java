public class Karte
{
    private int kartennummer;
    private String farbe;
    private int wert;
    private String bildwert;

    public Karte(int pKartennummer)
    {   
        kartennummer = pKartennummer;
        wert = kartenWert();
        System.out.println("Der Wert beträgt " + wert);
        farbe = kartenFarbe();
        System.out.println("Die Farbe ist " + farbe);
        bildwert = wertInWorten();
        System.out.println("Es handelt sich um  " + farbe + " " + bildwert);
        
    }
   
    public int kartenWert()
    {
        int w = kartennummer % 13;
        if (w<=8)
            return w+2;
        else
            if (w==12)
                return 11;
            else
                return 10;
    }
    public String kartenFarbe()
    {
        int x = kartennummer /13;
        
        switch (x)
        {
            case 0:
                farbe = "Karo";
                break;
            case 1:
                farbe = "Herz";
                break;
             case 2:
                farbe = "Pik";
                break;
             case 3:
                farbe = "Kreuz";
                break;
             default:
                System.out.println("Karte gibt es nicht!");    
        }
        return farbe;
    }
    public String wertInWorten()
    {
        int w = kartennummer % 13;
        switch (w)
        {
            case 0:
                return bildwert = "zwei";
            case 1:
                return bildwert = "drei";
            case 2:
                return bildwert = "vier";
            case 3:
                return bildwert = "fünf";
            case 4:
                return bildwert = "sechs";
            case 5:
                return bildwert = "sieben";
            case 6:
                return bildwert = "acht";
            case 7:
                return bildwert = "neun";
            case 8:
                return bildwert = "zehn";
            case 9:
                return bildwert = "Bube";
            case 10:
                return bildwert = "Dame";
            case 11:
                return bildwert = "König";
            case 12:
                return bildwert = "Ass";
            default:
                //System.out.println("Karte gibt es nicht!");   
        }
        return bildwert;
    }
}
