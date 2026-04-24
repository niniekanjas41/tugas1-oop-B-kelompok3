public class Reservasi {
    int total;

    Reservasi(int harga, int malam) {
        total = harga * malam;
    }

    void tampilkanTotal() {
        System.out.println("Total bayar: Rp." + total);
    }
}
