public class Pelanggan {
    String nama;
    String noHP;

    Pelanggan(String nama, String noHP) {
        this.nama = nama;
        this.noHP = noHP;
    }

    void tampilkanPelanggan() {
        System.out.println("Nama: " + nama);
        System.out.println("No HP: " + noHP);
    }
}
