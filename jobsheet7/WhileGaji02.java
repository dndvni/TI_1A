import java.util.Scanner;

public class WhileGaji02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int jumlahKaryawan, jumlahJamLembur;
        double totalGajiLembur =0;
        String jabatan;

        System.out.print("Masukkan jumlah karyawan: ");
        jumlahKaryawan = sc.nextInt();

        int i = 0;

        while (i < jumlahKaryawan) {
            System.out.println("Pilihan jabatan - Direktur, Manajer, Karyawan ");
            System.out.print("Masukkan jabatan karyawan ke-" + (i + 1) + ": ");
            jabatan = sc.next();

            // validasi input untuk posisi pekerjaan
            if (!(jabatan.equalsIgnoreCase("direktur") || jabatan.equalsIgnoreCase("manajer") || jabatan.equalsIgnoreCase("karyawan"))) {
                System.out.println("Jabatan tidak valid. Pilih dari opsi yang tersedia.");
                continue; // lewati iterasi saat ini
            }

            System.out.print("Masukkan jumlah jam lembur: ");
            jumlahJamLembur = sc.nextInt();

            double gajiLembur = 0;

            if (jabatan.equalsIgnoreCase("manajer")) {
                gajiLembur = jumlahJamLembur * 100000;
            } else if (jabatan.equalsIgnoreCase("karyawan")) {
                gajiLembur = jumlahJamLembur * 75000;
            }
            totalGajiLembur += gajiLembur;
            i++;
        } 
        System.out.println("Total gaji lembur " + totalGajiLembur);
    }
}