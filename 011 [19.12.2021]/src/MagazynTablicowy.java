public class MagazynTablicowy {
    private Kontener[] items;

    public void MagazynTablicowy() {
        items = new Kontener[5];
    }

    public void przyjmijKontener(Kontener item) {

    }

    public Kontener wydajKontener() {
        return items[0];
    }
}
