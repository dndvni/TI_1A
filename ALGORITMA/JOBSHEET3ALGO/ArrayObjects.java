package JOBSHEET3ALGO;
import java.util.Scanner;

public class ArrayObjects {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Masukkan banyak persegi panjang yang ingin di hitung: ");
        int n = sc.nextInt();
        PersegiPanjang[] ppArray = new PersegiPanjang[n];

        for(int i = 0; i <ppArray.length; i++) {
            ppArray[i] = new PersegiPanjang();
            System.out.println("Persegi Panjang ke-" + i);
            System.out.print("Masukkan panjang: ");
            ppArray[i].panjang = sc.nextInt();
            System.out.print("Masukkan lebar: ");
            ppArray[i].lebar = sc.nextInt();
        }

        for(int i = 0; i <ppArray.length; i++) {
            System.out.println("Persegi Panjang kei" + i);
            System.out.println("Panjang: " + ppArray[i].panjang + ", lebar: " + ppArray[i].lebar);
        }
    }
}