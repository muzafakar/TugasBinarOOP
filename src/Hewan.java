public abstract class Hewan {

    void infoJumlahKaki() {
        String className = this.getClass().getName();
        int jumlahKaki = getJumlahKaki();
        if (className.equals("Ikan") /* || jumlahKaki == 0 */) {
            System.out.println(className + " tidak punya kaki");
        } else {
            System.out.println(className + " memiliki " + jumlahKaki + " kaki");
        }
    }

    protected abstract int getJumlahKaki();
}

