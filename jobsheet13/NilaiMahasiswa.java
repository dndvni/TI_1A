import java.util.Scanner;

public class NilaiMahasiswa {
    private static final int JUMLAH_MAHASISWA = 5;
    private static final int JUMLAH_MINGGU = 7;

    private static int[][] nilaiMahasiswa = new int[JUMLAH_MAHASISWA][JUMLAH_MINGGU];

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Memasukkan nilai mahasiswa
        inputNilaiMahasiswa(scanner);

        // Menampilkan seluruh nilai mahasiswa mulai dari minggu pertama sampai ketujuh
        System.out.println("Nilai mahasiswa mulai dari minggu pertama sampai ketujuh:");
        for (int i = 0; i < JUMLAH_MAHASISWA; i++) {
            System.out.print("Mahasiswa " + (i + 1) + ": ");
            for (int j = 0; j < JUMLAH_MINGGU; j++) {
                System.out.print(nilaiMahasiswa[i][j] + " ");
            }
            System.out.println();
        }

        // Mencari pada hari keberapakah terdapat nilai tertinggi dibanding hari lain dari keseluruhan mahasiswa
        int hariTertinggi = cariHariTertinggi();
        System.out.println("Pada hari ke-" + hariTertinggi + " terdapat nilai tertinggi dibanding hari lain dari keseluruhan mahasiswa.");

        // Menampilkan mahasiswa yang memiliki nilai tertinggi (tampilkan pula keterangan nilai dari minggu ke-)
        Mahasiswa mahasiswaTertinggi = cariMahasiswaTertinggi();
        System.out.println("Mahasiswa yang memiliki nilai tertinggi adalah Mahasiswa " + mahasiswaTertinggi.getNomor() + ", dengan nilai tertinggi di minggu ke-" + mahasiswaTertinggi.getMingguTertinggi());
    }

    private static void inputNilaiMahasiswa(Scanner scanner) {
        System.out.println("Masukkan nilai mahasiswa:");
        for (int i = 0; i < JUMLAH_MAHASISWA; i++) {
            System.out.print("Mahasiswa " + (i + 1) + ": ");
            for (int j = 0; j < JUMLAH_MINGGU; j++) {
                nilaiMahasiswa[i][j] = scanner.nextInt();
            }
            System.out.println();
        }
    }

    private static int cariHariTertinggi() {
        int hariTertinggi = 0;
        int nilaiTertinggi = nilaiMahasiswa[0][0];

        for (int i = 0; i < JUMLAH_MINGGU; i++) {
            int nilaiHari = 0;
            for (int j = 0; j < JUMLAH_MAHASISWA; j++) {
                nilaiHari += nilaiMahasiswa[j][i];
            }

            if (nilaiHari > nilaiTertinggi) {
                nilaiTertinggi = nilaiHari;
                hariTertinggi = i + 1;
            }
        }

        return hariTertinggi;
    }

    private static Mahasiswa cariMahasiswaTertinggi() {
        Mahasiswa mahasiswaTertinggi = null;
        int nilaiTertinggi = nilaiMahasiswa[0][0];
        int mingguTertinggi = 0;

        for (int i = 0; i < JUMLAH_MAHASISWA; i++) {
            for (int j = 0; j < JUMLAH_MINGGU; j++) {
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
        this.mingguTertinggi = mingguTertinggi;
    }

    public int getNomor() {
        return nomor;
    }

    public int getMingguTertinggi() {
        return mingguTertinggi;
    }
}
