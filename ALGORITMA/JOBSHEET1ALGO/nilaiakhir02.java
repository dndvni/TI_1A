package JOBSHEET1ALGO;

import java.util.Scanner;

public class nilaiakhir02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double tugas, kuis, uts, uas, hasil;
        System.out.println("========================================");
        System.out.println("     PROGRAM MENGHITUNG NILAI AKHIR     ");
        System.out.println("========================================");
        System.out.print(" Masukkan Nilai TUgas : ");
        tugas = sc.nextDouble();
        System.out.print(" Masukkan Nilai Kuis : ");
        kuis = sc.nextDouble();
        System.out.print(" Masukkan Nilai UTS : ");
        uts = sc.nextDouble();
        System.out.print(" Masukkan Nilai UAS : ");
        uas = sc.nextDouble();
        System.out.println("========================================");
        System.out.println("========================================");
        if (tugas < 0 || kuis < 0 || uts < 0 || uas < 0 ||
                tugas > 100 || kuis > 100 || uts > 100 || uas > 100) {
            System.out.println("    NILAI TIDAK VALID !    ");
            System.out.println("========================================");
            System.out.println("========================================");
        } else {
            System.out.print(" Nilai Akhir : ");
            hasil = (0.2 * tugas + 0.2 * kuis + 0.3 * uts + 0.4 * uas);
            System.out.println(hasil);
            System.out.print(" Nilai Huruf : ");
            System.out.println(NilaiHuruf(hasil));
            System.out.println("========================================");
            System.out.println("========================================");
            if (NilaiHuruf(hasil) == "D" || NilaiHuruf(hasil) == "E") {
                System.out.println("    TIDAK LULUS    ");
            } else {
                System.out.println("    LULUS     ");
            }
        }
    }

    static String NilaiHuruf(double a) {
        String huruf = "";
        if (a >= 80 && a <= 100) {
            huruf = "A";
        } else if (a >= 73 && a < 80) {
            huruf = "B+";
        } else if (a >= 65 && a < 73) {
            huruf = "B";
        } else if (a >= 60 && a < 65) {
            huruf = "C+";
        } else if (a >= 50 && a < 60) {
            huruf = "C";
        } else if (a >= 39 && a < 50) {
            huruf = "D";
        } else if (a < 39) {
            huruf = "E";
        } else {
            huruf = null;
        }
        return huruf;
    }

}