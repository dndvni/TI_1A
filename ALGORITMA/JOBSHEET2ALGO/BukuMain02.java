package JOBSHEET2ALGO;

import java.util.Scanner;

public class BukuMain02 {
    public static void main(String[] args){

        //Konstruktor Berparameter
       Buku02 bk1 = new Buku02("Today Ends Tomorrow Comes", "Denanda Pratiwi", 198, 13, 71000);

       bk1.tampilInformasi();
       bk1.terjual(5);
       bk1.gantiHarga(60000);
       bk1.tampilInformasi();

       // Konstruktor berparameter
       Buku02 bk2 = new Buku02("Self Reward", "Maheera Ayesha", 160, 29, 59000);
       bk2.terjual(11);
       bk2.tampilInformasi();
    }
}