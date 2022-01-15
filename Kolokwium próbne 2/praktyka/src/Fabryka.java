public class Fabryka {
    private String smak;
    private int nrCukierka = 1;

    public Fabryka(String smak) {
        this.smak = smak;
    }

    public Cukierek[] produkuj(int ilosc) {
        System.out.println("Produkcja " + ilosc + " cukierkow o smaku: " + smak);

        Cukierek cukierki[] = new Cukierek[ilosc];

        for (int i = 0; i <= ilosc - 1; i++) {
            if ((i + 1) % 5 == 0) {
                System.out.println("Wyprodukowano 5 cukierkow");
            }

            cukierki[i] = new Cukierek(nrCukierka, smak);
            nrCukierka++;
        }

        return cukierki;
    }
}
