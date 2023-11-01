import java.util.Scanner;

public class Bioskop02 {
    public static void main(String[] args){

        String[][] penonton = new String[4][2];

        System.out.println(penonton.length);

        for (int i = 0; i < penonton.length; i++) {
            System.out.println("Panjang baris ke-" + (i+1) + ": " + penonton[i].length);
        }

       System.out.println(penonton.length);

       for (String[] barisPenonton : penonton) {
        System.out.println("Panjang baris: " + barisPenonton.length);
       }

        System.out.println(penonton.length);
        System.out.println(penonton[0].length);
        System.out.println(penonton[1].length);
        System.out.println(penonton[2].length);
        System.out.println(penonton[3].length);
    }
}