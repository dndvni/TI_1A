package JOBSHEET1ALGO;

import java.util.Scanner;

public class ipk02 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double[][] nilai = new double[9][2];
        String[] nilaiHuruf = new String[9];
        String[] matkul = { "Agama", "Aljabar Linear", "Desain Antarmuka", "Praktikum Algoritma Dan Struktur Data",
                            "Praktikum Basis Data", "Rekayasa Perangkat Lunak", "Sistem Operasi", "Algoritma Dan Struktur Data",
                            "Basis Data" };
        double counter = 0;

        System.out.println("==============================================================================================");
        System.out.println("                                PROGRAM MENGHITUNG IP SEMESTER                                ");
        System.out.println("==============================================================================================");
        for (int i = 0; i < matkul.length; i++) {
            System.out.printf("Masukkan Nilai Angka Untuk Mata Kuliah %-40s : ", matkul[i]);
            nilai[i][0] = sc.nextFloat();
            nilaiHuruf[i] = NilaiHuruf(nilai[i][0]);
            nilai[i][1] = NilaiSetara(nilaiHuruf[i]);
            if (i == 7) {
                counter += (nilai[i][1] * 3);   
            } else {
                counter += (nilai[i][1] * 2);
            }
        System.out.println("==============================================================================================");
        System.out.println("                                     HASIL KONVERSI NILAI                                     ");
        System.out.println("==============================================================================================");
        System.out.printf("%-40s%-15s%-15s%-15s%n", "Mata Kuliah", "Nilai Angka", "Nilai Huruf", "Bobot Nilai" );
        }
        System.out.println("----------------------------------------------------------------------------------------------");
        for (int i = 0; i <matkul.length; i++) {
            System.out.printf("%-44s%-16s%-14s%-15s%n", matkul[i], nilai[i][0], nilaiHuruf[i], nilai[i][1]);
        }
        System.out.println("==============================================================================================");
        System.out.printf("IP : %.2f", (counter / 19));
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
        } else {
            huruf = null;
        }
        return huruf;
    }

    static double NilaiSetara(String a) {
        double nilaisetara = 0;
        switch (a) {
            case "A":
                nilaisetara = 4;
            case "B+":
                nilaisetara = 3.5;
            case "B":
                nilaisetara = 3;
            case "C+":
                nilaisetara = 2.5;
            case "C":
                nilaisetara = 2;
            case "D":
                nilaisetara = 1;
                break;
            case "E":
                nilaisetara = 0;
                break;

            default:
                break;
        }
        return nilaisetara;
    }
}