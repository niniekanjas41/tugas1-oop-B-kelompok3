public class Kamar {
    int nomor;
    String tipe;
    int harga;

    Kamar(int nomor, String tipe, int harga) {
        this.nomor = nomor;
        this.tipe = tipe;
        this.harga = harga;
    }

    void tampilkanInfo() {
        System.out.println(nomor + " - " + tipe + " - Rp." + harga);
    }

    int hitungTotal(int malam) {
        return harga * malam;
    }
}
