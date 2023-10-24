import java.util.Scanner;

public class WhileKelipatan02 {
    public static void main(String[] args) {
        Scanner input02 = new Scanner(System.in);
        int kelipatan = 0, jumlah = 0, counter = 0, totalKelipatan = 0;

        System.out.print("Masukkan bilangan kelipatan (1-9): ");
        kelipatan = input02.nextInt();

        int i = 1; // Inisialisasi variabel i

        while (i <= 50) {
            if (i % kelipatan == 0) {
                jumlah += 1;
                counter++;
                totalKelipatan += i; // Menambahkan bilangan kelipatan ke totalKelipatan 
            }
            i++; // Peningkatan nilai i
        }
        double rataRata = (double) totalKelipatan / counter; // Menghitung rata rata

        System.out.printf("Banyaknya bilangan kelipatan %d dari 1 sampai 50 adalah %d\n", kelipatan, counter);
        System.out.printf("Total bilangan kelipatan %d dari 1 sampai 50 adalah %d\n", kelipatan, jumlah);
        System.out.printf("rata rata bilangan kelipatan %d dari 1 sampai 50 adalah %.2f\n", kelipatan, rataRata);
    }
}