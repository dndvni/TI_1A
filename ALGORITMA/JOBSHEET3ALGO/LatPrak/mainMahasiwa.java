package JOBSHEET3ALGO.LatPrak;

import java.util.Scanner;

public class mainMahasiwa {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Scanner aku = new Scanner(System.in);
        System.out.print("Masukkan jumlaj mahasiswa: ");
        int n = sc.nextInt();
        mahasiswa[] mhs = new mahasiswa[n];

        for(int i = 0; i<mhs.length; i++) {
            mhs[i] = new mahasiswa();
            System.out.println("\nMasukkkan data mahasiswa ke-" + (i+1));
            System.out.print("Masukkan nama: ");
            mhs[i].nama = aku.nextLine();
            System.out.print("Masukkan NIM: ");
            mhs[i].nim = sc.nextInt();
            System.out.print("Masukkan jenis kelamin: ");
            mhs[i].jKelamin = sc.next().charAt(0);
            System.out.print("Masukkan IPK: ");
            mhs[i].IPK = sc.nextDouble();
        }

        for(int i = 0; i <mhs.length; i ++) {
            System.out.println("\nData Mahasiswa ke-" + (i + 1));
            System.out.println("nama\t: " + mhs[i].nama);
            System.out.println("NIM\t: " + mhs[i].nim);
            System.out.println("Jenis Kelamin : " + mhs[i].IPK);
        }
    }
}