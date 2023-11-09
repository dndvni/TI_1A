import java.util.Scanner;

public class PersegiAngka {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the value of N (minimum value of N is 3): ");
        int n = scanner.nextInt();
        int J = n;

        if (n < 3) {
            System.out.println("Invalid input. N must be greater than or equal to 3.");
            return;
        }

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= J; j++) {
                if (i == 1 || i == J) {
                System.out.print(n);

                }
                else{
                    if (j == 1 || j == J) {
                System.out.print(n);}
                     else {
                System.out.print(' ');}
                    }
            }
            System.out.println();
        }
    }

}