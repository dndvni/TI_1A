//package JOBSHEET5ALGO;
//import java.util.Scanner;

//import JOBSHEET5ALGO.DaftarMahasiswaBerprestasi02;
//import JOBSHEET5ALGO.mahasiswa02;

public class mainMhs02 {

    public static void main(String[] args) {
        DaftarMahasiswaBerprestasi02 list = new DaftarMahasiswaBerprestasi02();

        mahasiswa02 m1 = new mahasiswa02("Nusa",2017,25,3);
        mahasiswa02 m2 = new mahasiswa02("Rara", 2012, 19, 4);
        mahasiswa02 m3 = new mahasiswa02("Dompu", 2018, 19, 3.5);
        mahasiswa02 m4 = new mahasiswa02("Abdul", 2017, 23, 2);
        mahasiswa02 m5 = new mahasiswa02("Ummi", 2019, 21, 3.75);

        list.tambah(m1);
        list.tambah(m2);
        list.tambah(m3);
        list.tambah(m4);
        list.tambah(m5);

        System.out.println("Data mahasiswa sebelum sorting = ");
        list.tampil();

        System.out.println("Data mahasiswa setelah sorting desc berdasarkan ipk");
        list.bubbleSort();
        list.tampil();
        
    }
}