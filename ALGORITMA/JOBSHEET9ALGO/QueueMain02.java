package JOBSHEET9ALGO;
import java.util.Scanner;

import JOBSHEET9ALGO.Queue02;

public class QueueMain02 {
    public static void main(String[] args) {
        Scanner sc02 = new Scanner(System.in);

        System.out.print("Masukkan kapasitas queue: ");
        int n = sc02.nextInt();

        Queue02 Q = new Queue02(n);

        int pilih;
        do {
            Queue02.menu();
            pilih = sc02.nextInt();
            switch(pilih) {
                case 1:
                    System.out.println("Masukkkan data baru: ");
                    int dataMasuk = sc02.nextInt();
                    Q.Enqueue(dataMasuk);
                    break;
                
                case 2:
                    int dataKeluar = Q.Dequeue();
                    if (dataKeluar != 0) {
                        System.out.println("Data yang dikeluarkan: " + dataKeluar);
                        break;
                    }
                
                case 3:
                    Q.print();
                    break;

                case 4:
                    Q.peek();
                    break;

                case 5:
                    Q.clear();
                    break;
            }
        } while (pilih == 1 || pilih == 2 || pilih == 3 || pilih == 4 || pilih == 5);
    }
}