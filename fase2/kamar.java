public class Kamar {
    private int nomor;
    private String tipe;
    private int harga;

    public Kamar(int nomor, String tipe, int harga) {
        this.nomor = nomor;
        this.tipe = tipe;
        this.harga = harga;
    }

    public int getNomor() {
        return nomor;
    }

    public String getTipe() {
        return tipe;
    }

    public int getHarga() {
        return harga;
    }

    public void tampilkanInfo() {
        System.out.println(nomor + " - " + tipe + " - Rp." + harga);
    }
}
