package hr.vsite.java;

import java.util.LinkedList;

public class Racun{

    final private String brojRacuna;
    private Vlasnik vlasnik;
    final private double pocetnoStanje;
    private double trenutnoStanje;
    private LinkedList<Promet> prometi = new LinkedList<>();

    public Racun(String brojRacuna, Vlasnik vlasnik) {
        this.brojRacuna = brojRacuna;
        this.vlasnik = vlasnik;
        this.pocetnoStanje = 0.0;
    }

    public String getBrojRacuna() {
        return brojRacuna;
    }

    public Vlasnik getVlasnik() {
        return vlasnik;
    }

    public double getPocetnoStanje() {
        return pocetnoStanje;
    }

    public double getTrenutnoStanje() {
        trenutnoStanje = pocetnoStanje;

        for (Promet p : prometi) {
            double tempDug = p.getIznosDug();
            double tempPot = p.getIznosPot();

            double iznos = tempDug == 0.0 ? tempPot : -1 * tempDug;

            trenutnoStanje += iznos;
        }

        return trenutnoStanje;
    }

    public boolean uplata(Iznos iznos) {
        prometi.add(Promet.kreirajPotPromet(iznos));
        return true;
    }

    public boolean isplata(Iznos iznos) {
        if (getTrenutnoStanje() >= iznos.getIznos()) {
            prometi.add(Promet.kreirajDugPromet(iznos));
            return true;
        }
        return false;
    }

    @Override
    public String toString() {
        return "Broj računa: " + brojRacuna + "\nVlasnik: " + vlasnik.getIme() + " " + vlasnik.getPrezime() +
                "\nTrenutno stanje: " + getTrenutnoStanje();
    }

}
