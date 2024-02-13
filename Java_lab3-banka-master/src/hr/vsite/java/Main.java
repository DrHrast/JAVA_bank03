package hr.vsite.java;

public class Main {
    public static void main(String[] args) {
        Vlasnik v1 = new Vlasnik("11025478542", "Sonja", "Varunica", "Dubrovacka 22");
        Vlasnik v2 = new Vlasnik("74542896572", "Petar", "Pan", "Beogradska 11");

        // 1.
        Racun r1 = new Racun("1", v1);
        Racun r2 = new Racun("2", v2);

        System.out.printf("r1: " + r1);
        System.out.printf("\nr2: " + r2);
        System.out.println();

        // 2.
        r1.uplata(new Iznos(100.0, "HRK"));
        r2.isplata(new Iznos(90.0, "HRK"));

        System.out.printf("r1: " + r1);
        System.out.printf("\nr2: " + r2);
        System.out.println();
        System.out.println();

        // 3.
        Racun r3 = r1;

        System.out.printf("r1: " + r1);
        System.out.printf("\nr2: " + r2);
        System.out.printf("\nr3: " + r3);
        System.out.println();
        System.out.println();

        // 4.
        r3.isplata(new Iznos(100.0, "HRK"));
        r2.uplata(new Iznos(200, "HRK"));

        System.out.printf("r1: " + r1);
        System.out.printf("\nr2: " + r2);
        System.out.printf("\nr3: " + r3);
        System.out.println();
        System.out.println();

        // 5
        r3 = new Racun("3", v1);
        r3.uplata(new Iznos(250.0, "HRK"));

        System.out.printf("r1: " + r1);
        System.out.printf("\nr2: " + r2);
        System.out.printf("\nr3: " + r3);
        System.out.println();
    }
}
