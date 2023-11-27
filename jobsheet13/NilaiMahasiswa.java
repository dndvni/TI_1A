import java.util.Scanner;

public class NilaiMahasiswa {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input jumlah mahasiswa
        System.out.print("Masukkan jumlah mahasiswa: ");
        int jumlahMahasiswa = scanner.nextInt();

        // Input jumlah tugas
        System.out.print("Masukkan jumlah tugas: ");
        int jumlahTugas = scanner.nextInt();

        // Inisialisasi array nilai mahasiswa
        int[][] nilaiMahasiswa = new int[jumlahMahasiswa][jumlahTugas];

        // Memasukkan nilai mahasiswa
        inputNilaiMahasiswa(scanner, nilaiMahasiswa);

        // Menampilkan seluruh nilai mahasiswa
        System.out.println("Nilai mahasiswa:");
        for (int i = 0; i < jumlahMahasiswa; i++) {
            System.out.print("Mahasiswa " + (i + 1) + ": ");
            for (int j = 0; j < jumlahTugas; j++) {
                System.out.print(nilaiMahasiswa[i][j] + " ");
            }
            System.out.println();
        }

        // Mencari pada hari keberapakah terdapat nilai tertinggi dibanding hari lain dari keseluruhan mahasiswa
        int hariTertinggi = cariHariTertinggi(nilaiMahasiswa);
        System.out.println("Pada hari ke-" + hariTertinggi + " terdapat nilai tertinggi dibanding hari lain dari keseluruhan mahasiswa.");

        // Menampilkan mahasiswa yang memiliki nilai tertinggi (tampilkan pula keterangan nilai dari minggu ke-)
        Mahasiswa mahasiswaTertinggi = cariMahasiswaTertinggi(nilaiMahasiswa);
        System.out.println("Mahasiswa yang memiliki nilai tertinggi adalah Mahasiswa " + mahasiswaTertinggi.getNomor() + ", dengan nilai tertinggi di minggu ke-" + mahasiswaTertinggi.getMingguTertinggi());
    }

    private static void inputNilaiMahasiswa(Scanner scanner, int[][] nilaiMahasiswa) {
        System.out.println("Masukkan nilai mahasiswa:");
        for (int i = 0; i < jumlahMahasiswa; i++) {
            System.out.print("Mahasiswa " + (i + 1) + ": ");
            for (int j = 0; j < jumlahTugas; j++) {
                nilaiMahasiswa[i][j] = scanner.nextInt();
            }
            System.out.println();
        }
    }

    private static int cariHariTertinggi(int[][] nilaiMahasiswa) {
        int hariTertinggi = 0;
        int nilaiTertinggi = nilaiMahasiswa[0][0];

        for (int i = 0; i < jumlahTugas; i++) {
            int nilaiHari = 0;
            for (int j = 0; j < jumlahMahasiswa; j++) {
                nilaiHari += nilaiMahasiswa[j][i];
            }

            if (nilaiHari > nilaiTertinggi) {
                nilaiTertinggi = nilaiHari;
                hariTertinggi = i + 1;
            }
        }

        return hariTertinggi;
    }

    private static Mahasiswa cariMahasiswaTertinggi(int[][] nilaiMahasiswa) {
        Mahasiswa mahasiswaTertinggi = null;
        int nilaiTertinggi = nilaiMahasiswa[0][0];
        int mingguTertinggi = 0;

        for (int i = 0; i < jumlahMahasiswa; i++) {
            for (int j = 0; j < jumlahTugas; j++) {
                if (nilaiMahasiswa[i][j] > nilaiTertinggi) {
                    nilaiTertinggi = nilaiMahasiswa[i][j];
                    mingguTertinggi = j + 1;
                    mahasiswaTertinggi = new Mahasiswa(i + 1, mingguTertinggi);
                }
            }
        }

        return mahasiswaTertinggi;
    }
}

class Mahasiswa {
    private int nomor;
    private int mingguTertinggi;

    public Mahasiswa(int nomor, int mingguTertinggi) {
        this.nomor = nomor;
        this.ming
