import java.util.Scanner;
import java.util.Random;

public class Quiz {
    public static void main(String[] args) {

        Random random = new Random();
        Scanner input = new Scanner(System.in);

        char menu = 'Y';
       do {
        int number = random.nextInt(10) + 1;
        boolean success = false;
        do {
            System.out.print("Tebak Angka (1-10): ");
            while (!input.hasNextInt()) {
                input.next();
                System.out.print("Tebak ANgka (1-10): ");
            }
            int answer = input.nextInt();
            input.nextLine();
           
            if (answer < number) {
                System.out.println("Angka yang Anda tebak terlalu kecil. ");
            } else if (answer > number) {
                System.out.println("Angka yang Anda tebak terlalu besar. ");
            } else {
                System.out.println("Tebakan benar!");
                success = true;
            }
        } while (!success);

        System.out.print("Apakah Anda ingin mengulang permainan (Y/y) atau berhenti (lainnya)? ");
        menu = input.nextLine().charAt(0);
       } while (menu == 'Y' || menu == 'y');

       System.out.println("Terima kasih telah bermain!");
       input.close();
         
    }
}