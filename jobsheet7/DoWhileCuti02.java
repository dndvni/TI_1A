import java.util.Scanner;

public class DoWhileCuti02 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int jatahCuti, jumlahHari;
        String konfirmasi;

        System.out.print("Jatah cuti: ");
        jatahCuti = sc.nextInt();
        sc.nextLine(); // mengonsumsi karrakter newline 

        do {
            System.out.print("Apakah anda ingin mengambil cuti (y/t)? ");
            konfirmasi = sc.nextLine();

            if (konfirmasi.equalsIgnoreCase("t")) {
                System.out.print("Jumlah hari");
                jumlahHari = sc.nextInt();
                sc.nextLine(); // mengonsumsi karakter newlina

                if (jumlahHari <= jatahCuti){
                    jatahCuti-= jumlahHari;
                    System.out.println("Sisa jatah cuti: " + jatahCuti);
                } else {
                    System.out.println("Sisa jatah cuti anda tidak mencukupi. anda memiliki " + jatahCuti + "hari cuti");
                }
            }
        } while (true); // program akan terus berjalan
    }
}