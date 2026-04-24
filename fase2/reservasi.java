public class Reservasi {
    private Pelanggan pelanggan;
    private Kamar kamar;
    private int malam;
    private boolean statusCheckIn;

    public Reservasi(Pelanggan pelanggan, Kamar kamar, int malam) {
        this.pelanggan = pelanggan;
        this.kamar = kamar;
        this.malam = malam;
        this.statusCheckIn = false;
    }

    public void checkIn() {
        if (!statusCheckIn) {
            statusCheckIn = true;
            System.out.println("Check-in berhasil!");
        } else {
            System.out.println("Sudah check-in!");
        }
    }

    public void checkOut() {
        if (statusCheckIn) {
            statusCheckIn = false;
            System.out.println("Check-out berhasil!");
        } else {
            System.out.println("Belum check-in!");
        }
    }

    public int hitungTotal() {
        return kamar.getHarga() * malam;
    }

    public void tampilkanDetail() {
        System.out.println("\n======= DETAIL RESERVASI =======");
        pelanggan.tampilkanPelanggan();
        System.out.printf("Kamar  : %d (%s)%n", kamar.getNomor(), kamar.getTipe());
        System.out.printf("Malam  : %d%n", malam);
        System.out.printf("Total  : Rp%d%n", hitungTotal());
        System.out.println("================================");
    }
}
