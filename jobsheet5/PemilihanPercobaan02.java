package jobsheet5;

import java.util.Scanner;

public class PemilihanPercobaan02 {
    public static void main(String[] args) {
        Scanner input02 = new Scanner(System.in);

        System.out.print("Masukkan Angka: ");
        int angka = input02.nextInt();

        String result = (angka % 2 == 0 ) ? "Angka" +angka+ "bilangan genap" : "Angka"+angka+"bilangan ganjil";
        System.out.println(result);
        
        }
    }
