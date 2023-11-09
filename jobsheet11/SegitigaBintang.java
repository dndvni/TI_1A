import java.util.Scanner;

public class SegitigaBintang {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukkan nilai N (minimal 5): ");
        int N = sc.nextInt();
        int J = N;

        if (N < 5) {
            System.out.println("Nilai N harus minimal 5.");
        } else {
            for (int i = 1; i <= N; i++) {
                // Membuat leading spaces sesuai dengan posisi angka
                for (int j = 1; j <= N + 1 - i; j++){
                    System.out.print("*");
                }
                    System.out.println(" ");

            }
            
        }
    }
}
