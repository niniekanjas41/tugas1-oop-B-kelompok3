public class Pelanggan {
    private String nama;
    private String noHP;

    public Pelanggan(String nama, String noHP) {
        this.nama = nama;
        this.noHP = noHP;
    }

    public String getNama() {
        return nama;
    }

    public String getNoHP() {
        return noHP;
    }

    public void tampilkanPelanggan() {
        System.out.println("Nama : " + nama);
        System.out.println("No HP: " + noHP);
    }
}
