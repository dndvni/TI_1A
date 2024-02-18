package JOBSHEET1ALGO;

import java.util.Scanner;

public class rumus02 {
    static Scanner sc = new Scanner(System.in);

    static double Kecepatan(double s, double t) {
        double v;
        v = s / t;
        return v;
    }

    static double Jarak(double v, double t) {
        double s;
        s = v * t;
        return s;
    }

    static double Waktu(double s, double v) {
        double t;
        t = s / v;
        return t;
    }

    static void Menu() {
        int input, s, t, v;
        System.out.println("================================================================");
        System.out.println("           RUMUS PENGHITUNG KECEPATAN, JARAK, DAN WAKTU         ");
        System.out.println("================================================================");
        System.out.println("                1. Hitung Kecepatan");
        System.out.println("                2. Hitung Jarak");
        System.out.println("                3. Hitung Waktu");
        System.out.println("                4. Keluar");
        System.out.println("================================================================");
        System.out.print("      Input Anda : ");
        input = sc.nextInt();
        switch (input) {
            case 1:
                System.out.print("          Masukkan Jarak Yang Ditempuh : ");
                s = sc.nextInt();
                System.out.print("          Masukkan Waktu Yang Dibutuhkan : ");
                t = sc.nextInt();
                System.out.println("================================================================");
                System.out.println("          Hasil : " + Kecepatan(s, t));
                break;

            case 2:
                System.out.print("          Masukkan Kecepatan Yang Dipunya : ");
                v = sc.nextInt();
                System.out.print("          Masukkan Waktu Yang Dibutuhkan : ");
                t = sc.nextInt();
                System.out.println("================================================================");
                System.out.println("          Hasil : " + Jarak(v, t));
                break;

            case 3:
                System.out.print("          Masukkan Jarak Yang Ditempuh : ");
                s = sc.nextInt();
                System.out.print("          Masukkan Kecepatan Yang Dipunya : ");
                v = sc.nextInt();
                System.out.println("================================================================");
                System.out.println("          Hasil : " + Kecepatan(s, v));
                break;
                
            case 4:
                System.out.println("================================================================");
                System.out.println("                    Selamat Tinggal !");
                System.out.println("================================================================");
                System.exit(0);
                break;
            default:
                System.out.println("          Masukkan Input Yang Valid ! (1, 2, 3 Atau 4)");
        }
    }
    public static void main(String[] args) {
        boolean aktif = true;
        while (aktif) {
            Menu();
        }
    }
}