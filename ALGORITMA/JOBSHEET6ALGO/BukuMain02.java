// package JOBSHEET6ALGO;

import java.util.Scanner;

public class BukuMain02 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        Scanner s1 = new Scanner(System.in);

        pencarianBuku02 data = new pencarianBuku02();
        int jumBuku = 5;

        System.out.println("=======================================");
        System.out.println("Masukkan data Buku secara urut dari Kode Buku Terkecil : ");
        for (int i = 0; i < jumBuku; i++){
            System.out.println("=======================================");
            System.out.print("Kode Buku     \t: ");
            int kodeBuku = s.nextInt();
            System.out.print("Judul Buku    \t: ");
            String judul = s1.nextLine();
            System.out.print("Tahun Terbit  \t: ");
            int tahunTerbit = s.nextInt();
            System.out.print("pengarang     \t: ");
            String pengarang = s1.nextLine();
            System.out.print("Stok          \t: ");
            int stok = s.nextInt();

            Buku02 m = new Buku02(kodeBuku, judul, tahunTerbit, pengarang, stok);
            data.tambahBuku(m);
        }

        System.out.println("=======================================");
        // System.out.println("Data keseluruhan Mahasiswa : ");

        System.out.println("=======================================");
        System.out.println("Data keselutruhan Buku : ");
        data.tampilDataBuku();

        System.out.println("=======================================");
        System.out.println("=======================================");
        System.out.println("Pencarian Data : ");
        System.out.println("Kode Buku : ");
        int cari = s.nextInt();
        System.out.println("menggunakan sequential Search");
        int posisi = data.FindSeqSearch(cari);
        data.tampilPosisi(cari, posisi);

        System.out.println("=======================================");
        System.out.println("menggunakan binary search");
        posisi = data.FindBinarySearch(cari, 0, jumBuku -1);
        data.tampilPosisi(cari, posisi);
        data.TampilData(cari, posisi);

        System.out.println("=======================================");
        System.out.println("=======================================");
        data.TampilData(cari, posisi);

        Buku02 dataBuku02 = data.FindBuku(cari);
        dataBuku02.tampilDataBuku();
    }
}