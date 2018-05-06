public class Ikan extends Hewan {
    private boolean isTawar;

    Ikan(boolean isTawar) {
        this.isTawar = isTawar;
    }

    @Override
    protected int getJumlahKaki() {
        return 0;
    }

    void getHabitat() {
        if (isTawar) {
            System.out.println("Ini jenis ikan air tawar");
        } else {
            System.out.println("Ini jenis ikan air asin");
        }
    }


}
