package JOBSHEET1ALGO;

import java.util.Scanner;

public class tokoBunga02 {

    public static void main(String[] args) {
        int bunga[][] = {
            {10, 5, 15, 7},
            {6, 11, 9, 12},
            {2, 10, 10, 5},
            {5, 7, 12, 9},
            {75000, 50000, 60000, 10000}
        };
        String namaBunga[] = {"Aglonema", "Keladi", "Alocasia", "Mawar"};
        int counter = 0;
        bunga[3][0] -= 1;
        bunga[3][1] -= 2;
        bunga[3][3] -= 5;
        for(int i = 0; i < 4; i++){
            for(int j = 0; j < 4; j++){
                System.out.println("Stok " + namaBunga[j] + " : " + bunga[i][j]);
                counter += bunga[i][j] * bunga[4][j];
            }
            System.out.println("Total Penghasilan RoyalGarden" + i + " = Rp" + counter);
            System.out.println();
            counter = 0;
    }
    }
}