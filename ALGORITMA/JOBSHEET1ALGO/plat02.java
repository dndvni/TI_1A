package JOBSHEET1ALGO;

import java.util.Scanner;

public class plat02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char[] plat = {
            'A', 'B', 'D', 'E', 'F', 'G', 'H', 'L', 'N', 'T',
        };
        char[][] kota = new char[10][12];
        kota[0] = "BANTEN".toCharArray();
        kota[1] = "JAKARTA".toCharArray();
        kota[2] = "BANDUNG".toCharArray();
        kota[3] = "CIREBON".toCharArray();
        kota[4] = "BOGOR".toCharArray();
        kota[5] = "PEKALONGAN".toCharArray();
        kota[6] = "SEMARANG".toCharArray();
        kota[7] = "SURABAYA".toCharArray();
        kota[8] = "MALANG".toCharArray();
        kota[9] = "TEGAL".toCharArray();

        System.err.print("Masukkan Kode Plat : ");
        char kode = sc.next().charAt(0);
        int index = -1;
        for (int i = 0; i < plat.length; i++) {
            if (plat[i] == kode) {
                index = i;
                break;
            }
        }
        if (index != -1) {
            for (char hasil : kota[index]) {
                System.out.print(hasil + " ");
            }
        } else {
            System.out.println("Kode Plat Tidak Valid. ");
        }
    }
}