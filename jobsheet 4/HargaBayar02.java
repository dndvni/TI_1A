import java.util.Scanner;

public class HargaBayar02 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int harga, jumlah, halBuku;
        double dis, total, bayar, jmlDis;
        String merkBuku;

        System.out.println("Masukkan Merk buku yang dibeli: ");
        merkBuku = input.nextLine();
        System.out.println("Masukkan Jumlah Halaman buku yang dibeli: ");
        halBuku = input.nextInt();
        System.out.println("Masukkan harga barang yang dibeli: ");
        harga = input.nextInt();
        System.out.println("Masukkan Jumlah barang yang dibeli: ");
        jumlah = input.nextInt();
        System.out.println("Masukkan Diskon yang didapatkan: ");
        dis = input.nextDouble();

        total=harga*jumlah;
        jmlDis=total*dis;
        bayar=total-jmlDis;

        System.out.println("Diskon yang anda dapatkan ialah:" + jmlDis);
        System.out.println("jumlah yang harus dibayar adalh: " + bayar);

    }
}