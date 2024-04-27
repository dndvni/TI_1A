package JOBSHEET9ALGO;
import java.util.Scanner;

import JOBSHEET9ALGO.Nasabah02;

import JOBSHEET9ALGO.Queue02;

public class QueueMain02 {
    public static void menu() {
        System.out.println("Pilih Menu:");
        System.out.println("1. Antrian Baru");
        System.out.println("2. Antrian Keluar");
        System.out.println("3. Cek Antrian Terdepan");
        System.out.println("4. Cek Semua Antrian");
        System.out.println("5. Cek Antrian Belakang");
        System.out.println("--------------------");
    }
    public static void main(String[] args) {
        Scanner sc02 = new Scanner(System.in);

        System.out.print("Masukkan kapasitas queue: ");
        int jumlah = sc02.nextInt();

        Queue02 antri = new Queue02(jumlah);

        int pilih;
        do {
            menu();
            pilih = sc02.nextInt();
            switch(pilih) {
                case 1:
                    System.out.println("No Rekening: ");
                    String norek = sc02.next();
                    System.out.println("Nama: ");
                    String nama = sc02.next();
                    System.out.println("Alamat: ");
                    String alamat = sc02.next();
                    System.out.println("Umur:");
                    int umur = sc02.nextInt();
                    System.out.println("Saldo: ");
                    double saldo = sc02.nextDouble();
                    Nasabah02 nb = new Nasabah02(norek, nama, alamat, umur, saldo);
                    sc02.nextLine();
                    antri.Enqueue(nb);
                    break;
                
                case 2:
                    Nasabah02 data = antri.Dequeue();
                    if (!"".equals(data.norek) && !"".equals(data.nama) && !"".equals(data.alamat)
                        && data.umur !=0 && data.saldo !=0) {
                        System.out.println("Antrian yang keluar: " + data.norek + " " + data.nama + " " 
                            + data.alamat + " " + data.umur + " " + data.saldo);
                        break;
                    }
                
                case 3:
                    antri.peek();
                    break;

                case 4:
                    antri.print();
                    break; 

                case 5: 
                    antri.peekRear();
                
                default :
                    break;
                
            }
        } while (pilih == 1 || pilih == 2 || pilih == 3 || pilih == 4);
    }
}