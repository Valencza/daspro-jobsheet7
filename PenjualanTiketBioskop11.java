import java.util.Scanner;

public class PenjualanTiketBioskop11 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int totalTiket = 0;
        double totalPenjualan = 0;
        final double hargaTiket = 50000;
        int jumlahTiket;

        char lanjut = 'y';

        do {
            System.out.print("Masukkan jumlah tiket yang dibeli: ");
            jumlahTiket = input.nextInt();

            if (jumlahTiket < 0) {
                System.out.println("Jumlah tiket tidak valid! Coba lagi.\n");
                continue;
            }

            double totalHarga = jumlahTiket * hargaTiket;
            double diskon = 0;

            if (jumlahTiket > 10) {
                diskon = 0.15 * totalHarga;
            } else if (jumlahTiket > 4) {
                diskon = 0.10 * totalHarga;
            }

            totalHarga -= diskon;

            totalTiket += jumlahTiket;
            totalPenjualan += totalHarga;

            System.out.printf("Total harga untuk pelanggan ini: Rp %.0f%n", totalHarga);

            System.out.print("Apakah ada pelanggan lain? (y/n): ");
            lanjut = input.next().charAt(0);

        } while (lanjut == 'y' || lanjut == 'Y');

        System.out.println("\n=== Rekap Penjualan Hari Ini ===");
        System.out.println("Total tiket terjual : " + totalTiket);
        System.out.printf("Total pendapatan    : Rp %.0f%n", totalPenjualan);
    }
}
