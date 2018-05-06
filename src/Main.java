public class Main {
    public static void main(String[] args) {
        Hewan kucing = new Kucing();
        Hewan ayam = new Ayam();
        Hewan ikan = new Ikan(true);


        kucing.infoJumlahKaki();
        ayam.infoJumlahKaki();
        ikan.infoJumlahKaki();
        ((Ikan) ikan).getHabitat();
    }
}
