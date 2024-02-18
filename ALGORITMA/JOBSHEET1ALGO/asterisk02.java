package JOBSHEET1ALGO;

import java.util.Scanner;
public

class asterisk02 {

    public static void main(String[] args) {
        System.out.print("Masukkan NIM Anda : ");
        String nim = new Scanner(System.in).nextLine();

        String lastTwoDigits = nim.substring(nim.length() - 2);
        int n = Integer.parseInt(lastTwoDigits);

        if (n < 10) {
            n += 10;
        }
        System.out.println("=========================");
        System.out.println("n : " + n);

        for (int i = 1; i <= n; i++) {
            if (i % 2 == 0) {
                if (i != 6 || i !=10) {
                    System.out.print(i + " ");
                }
            } else {
                System.out.printf("* ");
            }
            System.out.println();
        }
    }
}