public class Cukierek {
    private int nr;
    private String smak;

    public Cukierek(int nr, String smak) {
        this.nr = nr;
        this.smak = smak;
    }

    public String toString() {
        return "Cukierek nr " + nr + " smak: " + smak + (nr<6 ? "11" : "");
    }
}
