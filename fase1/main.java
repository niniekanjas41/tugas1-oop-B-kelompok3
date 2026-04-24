import java.util.Scanner;

public class Hotel {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        // ===== INPUT PELANGGAN =====
        System.out.print("Masukkan nama: ");
        String nama = input.nextLine();

        System.out.print("Masukkan No HP: ");
        String noHP = input.nextLine();

        Pelanggan p1 = new Pelanggan(nama, noHP);
        
         // ===== DATA KAMAR =====
        Kamar k1 = new Kamar(101, "Standard", 200000);
        Kamar k2 = new Kamar(102, "Deluxe", 400000);
        Kamar[] daftarKamar = {k1, k2};

        System.out.println("================================");
        System.out.println("      DAFTAR KAMAR      ");
        System.out.println("================================");

        for (int i = 0; i < daftarKamar.length; i++) {
            System.out.println((i + 1) + " . " +
                daftarKamar[i].nomor + " - " +
                daftarKamar[i].tipe + " - Rp." +
                daftarKamar[i].harga);
        }

        System.out.println("================================");

        System.out.println("Pilih kamar (1/2)");
        int pilih = input.nextInt() - 1;

        System.out.println("Berapa malam: ");
        int malam = input.nextInt();

        int total = daftarKamar[pilih].harga * malam;

        System.out.println("================================");
        System.out.println("Total bayar: Rp." + total);
        System.out.println("================================");
    }
}
