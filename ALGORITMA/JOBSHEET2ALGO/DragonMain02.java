package JOBSHEET2ALGO;

import java.util.Scanner;

public class DragonMain02 {
    public static void main(String[] args) {
        Scanner dr = new Scanner(System.in);
        Dragon02 D1 = new Dragon02();
        char move;
        D1.width = 10;
        D1.height = 10;
        int height = D1.height;
        int width = D1.width;
        System.out.print("Masukkan koordinat X : ");
        D1.x = dr.nextInt();
        int x = D1.x;
        System.out.print("Masukkan koordinat y : ");
        D1.y = dr.nextInt();
        int y = D1.y;
        D1.printPosition();

        while (x > 0 || x < width || y > 0 || y < height) {
            System.out.println("move where ? (L/R/U/D)");
            dr.nextLine();
            move = dr.next(). toUpperCase(). charAt(0);

            switch(move) {
                case 'L' :
                D1.moveLeft();
                D1.printPosition();
                break;

                case 'R' :
                D1.moveRight();
                D1.printPosition();
                break;

                case 'U' :
                D1.moveUp();
                D1.printPosition();
                break;

                case 'D' :
                D1.moveDown();
                D1.printPosition();
                break;
            }
        }
    }
}