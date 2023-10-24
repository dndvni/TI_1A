import java.util.Scanner;

public class ForKelipatan02 {
    public static void main(String[] args) {
        Scanner input02 = new Scanner(System.in);
        int kelipatan, jumlah = 0, counter = 0, totalKelipatan = 0;

        System.out.print("Masukkan bilangan kelipatan (1-9) : ");
        kelipatan = input02.nextInt();

        for (int i = 1; i <= 50; i++) { 
            if (i % kelipatan == 0) {
                jumlah += i;
                counter++;
                totalKelipatan += i; // Menambahkan bilangan kelipatan ke totalKelipatan 
            }
        }
        double rataRata = (double) totalKelipatan / counter; // Menghitung rata rata

        System.out.printf("Banyaknya bilangan kelipatan %d dari 1 sampai 50 adalah %d\n", kelipatan, counter);
        System.out.printf("Total bilanngan kelipatan %d dari 1 sampai 50 adalah %d\n", kelipatan, jumlah);
        System.out.printf("rata rata bilangan kelipatan %d dari 1 sampai 50 adalah %.2f\n", kelipatan, rataRata);
    
    }
}