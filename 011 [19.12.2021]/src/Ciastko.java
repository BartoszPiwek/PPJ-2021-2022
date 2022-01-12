public class Ciastko {
    private String smak;
    private double waga;

    public Ciastko(String smak, double waga) {
        this.smak = smak;
        this.waga = waga;
    }

    public void show() {
        System.out.println("smak: " + smak + "; waga: " + waga);
    }
}
