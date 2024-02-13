package hr.vsite.java;

public class Promet{
    final private double iznosPot;
    final private double iznosDug;
    final private String valuta;


    private Promet(double iznosPot, double iznosDug, String valuta) {
        this.iznosPot = iznosPot;
        this.iznosDug = iznosDug;
        this.valuta = valuta;
    }

    public double getIznosPot() {
        return iznosPot;
    }

    public double getIznosDug() {
        return iznosDug;
    }

    public String getValuta() {
        return valuta;
    }


    public static Promet kreirajDugPromet (Iznos iznos){
        return new Promet(0, iznos.getIznos(), iznos.getValuta());
    }

    public static Promet kreirajPotPromet (Iznos iznos){

        return new Promet(iznos.getIznos(), 0, iznos.getValuta());
    }

    @Override
    public String toString() {
        return "Promet:\nUplata: " + getIznosPot() + "\nIsplata: " + getIznosDug() + "\nValuta: " + getValuta();
    }
}
