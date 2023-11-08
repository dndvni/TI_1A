import java.util.Scanner;

public class NestedLoop_NIM {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int [][] array2D = new int[5][7];

        for (int i = 0; i < array2D.length; i++) {
            System.out.println("Kota ke-" + i);
            for (int j = 0; j < array2D[0].length; j++) {
                System.out.print("Hari ke-" + (j + 1) + ": ");
                array2D[i][j] = sc.nextInt();
            }
            System.out.println();
        }
        // for (int i = 0; i < array2D.length; i++) {
            // System.out.print("Kota ke-" + i);
            // for (int j = 0; j < array2D[0].length; j++) {
                // System.out.print(array2D[i][j] + " ");
            // }
            // System.out.println();
        //}
    
    // output data menggunakan foreach
    for (int i = 0; i < array2D.length; i++) {
        System.out.print("Kota ke-" + i + ": ");
        for (int value : array2D[i]) {
            System.out.print(value + " ");
        }
        System.out.println();
    }
    }
}