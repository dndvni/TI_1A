package jobsheet5;

import java.util.Scanner;

public class PemilihanPercobaan02 {
    public static void main(String[] args) {
        Scanner input02 = new Scanner(System.in);

        System.out.print("Masukkan Angka: ");
        int angka = input02.nextInt();

        if (angka % 2 == 0) {
            System.out.println("Angka "+angka+" bilangan genap");
        }
        else {
            System.out.println("Angka "+angka+" bilangan ganjil");
        }
        }
    }
