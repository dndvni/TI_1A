// package JOBSHEET7ALGO;
import java.util.Scanner;


public class Utama02 {
    public static void main(String[] args) {
        Scanner sc02 = new Scanner(System.in);
        System.out.print("Masukkan Kapasitas Gudang :");
        int kapasitas = sc02.nextInt();
        Gudang02 gudang = new Gudang02(kapasitas);

        // Gudang02 gudang = new Gudang02(7);

        while (true) {
            System.out.println("\nMenu:");
            System.out.println("1. Tambah Barang");
            System.out.println("2. Ambil Barang");
            System.out.println("3. cari Barang");
            System.out.println("4. Tampilkan Tumpukan Barang");
            System.out.println("5. Tampilkan Barang Teratas");
            System.out.println("6. Tampilkan Barang Terbawah");
            System.out.println("7. Keluar");
            System.out.print("Pilih Operasi: ");
            int pilihan = sc02.nextInt();

            switch (pilihan) {
                case 1 :
                System.out.print("Masukkan kode barang: ");
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
                System.out.print("Masukkan Kode Barang: ");
                int kodeBarang = sc02.nextInt();
                System.out.print("Masukkan Nama Barang: ");
                sc02.nextLine(); // Membersihkan newline character dari buffer
                String namaBarang = sc02.nextLine();
                Barang02 barangDitemukan = gudang.cariBarang(kodeBarang, namaBarang);
                if (barangDitemukan != null) {
                    System.out.println("Barang Dengan Kode " + kodeBarang + " Telah Ditemukan. Kode: " + barangDitemukan.kode + "nama " + barangDitemukan.nama);
                } else {
                     System.out.println("Barang Dengan Kode " + kodeBarang + " dan Nama " + namaBarang + " Tidak Ditemukan.");
                }
                break;

                case 4:
                gudang.lihatBarangTeratas();
                break;

                case 5:
                gudang.lihatBarangTeratas();
                break;

                case 6:
                gudang.lihatBarangTerbawah();
                default :
                System.out.println("Pilihan tidak valid. Silahkan coba lagi.");
            }
        }
    }
}