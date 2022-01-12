public class Kontener {
    private Ciastko ladunek;
    private double masaLadunku;
    private int dniPrzydatnosci;

    public void Kontener(double masaLadunku) {
        this.masaLadunku = masaLadunku;
    }

    public void zaladuj(Ciastko ladunek, int dniPrzydatnosci) {
        this.ladunek = ladunek;
        this.dniPrzydatnosci = dniPrzydatnosci;
    }

    public boolean sprawdzPrzydatnosc() {
        return dniPrzydatnosci > 0;
    }
}
