package JOBSHEET4ALGO;
import java.util.Scanner;

public class Mainpangkat02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Masukkan jumlah elemen yang akan dihitung: ");
        int elemen = sc.nextInt();

        pangkat02[] png = new pangkat02[elemen];
        for (int i=0; i<png.length; i++) {
            System.out.println("Masukkan nilai yang hendak dipangkatkan: ");
            int a = sc.nextInt();
            System.out.println("Masukkan nilai pangkat: ");
            int n = sc.nextInt();
            png[i] = new pangkat02(a, n);
        }

        System.out.println("HASIL PANGKAT BRUTE FORCE");
        for (int i = 0; i < png.length; i++) {
            System.out.println("Hasil dari " + png[i].nilai + "pangkat" + png[i].pangkat + " adalah " + png[i].pangkatBF(png[i].nilai, png[i].pangkat));
        }

        System.out.println("HASIL PANGKAT DIVIDE AND CONQUER");
        for (int i = 0; i < png.length; i++) {
            System.out.println("Hasil dari " + png[i].nilai + "pangkat" + png[i].pangkat + " adalah " + png[i].pangkatDC(png[i].nilai, png[i].pangkat));
        }
    }
}