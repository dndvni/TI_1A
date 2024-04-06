// package JOBSHEET7ALGO;
import java.util.Scanner;


public class Utama02 {
    public static void main(String[] args) {
        Scanner sc02 = new Scanner(System.in);
        System.out.print("Masukkan Kapasitas GUdang : ");
        int kapasitas = sc02.nextInt();
        Gudang02 gudang = new Gudang02(kapasitas);
        // Gudang02 gudang = new Gudang02(7);

        while (true) {
            System.out.println("\nMenu:");
            System.out.println("1. Tambah Barang");
            System.out.println("2. Ambil Barang");
            System.out.println("3. Tampilkan Tumpukan Barang");
            System.out.println("4. Tampilkan Barang Teratas");
            System.out.println("5. Keluar");
            System.out.print("Pilih Operasi: ");
            int pilihan = sc02.nextInt();

            switch (pilihan) {
                case 1 :
                System.out.println("Masukkan kode barang: ");
                int kode = sc02.nextInt();
                sc02.nextLine();
                System.out.print("Masukkan nama barang: ");
                String nama = sc02.nextLine();
                System.out.print("Masukkan nama kategori: ");
                String kategori = sc02.nextLine();
                Barang02 barangBaru = new Barang02(kode, nama, kategori);
                gudang.tambahBarang(barangBaru);
                break;

                case 2 :
                gudang.ambilBarang();
                break;

                case 3:
                gudang.tampilkanBarang();
                break;

                case 4:
                break;

                default :
                System.out.println("Pilihan tidak valid. Silahkan coba lagi.");
            }
        }
    }
}