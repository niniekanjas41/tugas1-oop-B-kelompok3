import java.util.Scanner;

public class Hotel {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("=============================================");
        System.out.println("           SISTEM RESERVASI HOTEL            ");
        System.out.println("=============================================");
        System.out.println("                  Kelompok 3                 ");
        System.out.println("1. Ni Putu Niniek Anjaswari      (2505551170)");
        System.out.println("2. Ngurah Made Arya Mahardi Nata (2505551160)");
        System.out.println("=============================================\n");

        Kamar[] daftarKamar = {
            new Kamar(101, "Standard", 200000),
            new Kamar(102, "Deluxe", 400000)
        };

        Pelanggan pelanggan = null;
        Reservasi reservasi = null;

        int pilihan = -1;

        do {
            System.out.println("\n=========== MENU ===========");
            System.out.println("1. Lihat Kamar");
            System.out.println("2. Reservasi");
            System.out.println("3. Check-in");
            System.out.println("4. Check-out");
            System.out.println("0. Keluar");
            System.out.println("============================");
            System.out.print("Pilih menu: ");

            if (!input.hasNextInt()) {
                System.out.println("Input harus angka!");
                input.next();
                continue;
            }

            pilihan = input.nextInt();
            input.nextLine();

            switch (pilihan) {
                case 1:
                    System.out.println("\n======= DAFTAR KAMAR =======");
                    System.out.printf("%-5s %-10s %-10s %-10s%n", "No", "Nomor", "Tipe", "Harga");

                    for (int i = 0; i < daftarKamar.length; i++) {
                        System.out.printf("%-5d %-10d %-10s Rp%-10d%n",
                            (i + 1),
                            daftarKamar[i].getNomor(),
                            daftarKamar[i].getTipe(),
                            daftarKamar[i].getHarga()
                        );
                    }
                    System.out.println("============================");

                    System.out.print("Tekan Enter untuk lanjut...");
                    input.nextLine();
                    break;

                case 2:
                    System.out.print("Nama: ");
                    String nama = input.nextLine();

                    System.out.print("No HP: ");
                    String noHP = input.nextLine();

                    pelanggan = new Pelanggan(nama, noHP);

                    int pilihKamar;
                    while (true) {
                        System.out.print("Pilih kamar (1/2): ");
                        if (input.hasNextInt()) {
                            pilihKamar = input.nextInt();
                            if (pilihKamar >= 1 && pilihKamar <= daftarKamar.length) {
                                pilihKamar -= 1;
                                break;
                            } else {
                                System.out.println("Pilihan tidak tersedia!");
                            }
                        } else {
                            System.out.println("Harus angka!");
                            input.next();
                        }
                    }

                    int malam;
                    while (true) {
                        System.out.print("Berapa malam: ");
                        if (input.hasNextInt()) {
                            malam = input.nextInt();
                            if (malam > 0) {
                                break;
                            } else {
                                System.out.println("Minimal 1 malam!");
                            }
                        } else {
                            System.out.println("Harus angka!");
                            input.next();
                        }
                    }

                    reservasi = new Reservasi(pelanggan, daftarKamar[pilihKamar], malam);
                    System.out.println("Reservasi berhasil!");

                    input.nextLine(); // bersihin buffer
                    System.out.print("Tekan Enter untuk lanjut...");
                    input.nextLine();
                    break;

                case 3:
                    if (reservasi != null) {
                        reservasi.checkIn();
                    } else {
                        System.out.println("Belum ada reservasi!");
                    }

                    System.out.print("Tekan Enter untuk lanjut...");
                    input.nextLine();
                    break;

                case 4:
                    if (reservasi != null) {
                        reservasi.checkOut();
                        reservasi.tampilkanDetail();
                    } else {
                        System.out.println("Belum ada reservasi!");
                    }

                    System.out.print("Tekan Enter untuk lanjut...");
                    input.nextLine();
                    break;

                case 0:
                    System.out.println("Terima kasih!");
                    break;

                default:
                    System.out.println("Pilihan tidak valid!");
            }

        } while (pilihan != 0);

        input.close();
    }
}
