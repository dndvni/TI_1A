public class no4 {
    public static void main(String[] args) {
        int n = 5;

        // Memanggil fungsi faktorialRekursif
        System.out.println("Faktorial Rekursif dari " + n + " adalah " + faktorialRekursif(n));

        // Memanggil fungsi faktorialIteratif
        System.out.println("Faktorial Iteratif dari " + n + " adalah " + faktorialIteratif(n));
    }

    static int faktorialRekursif(int n) {
        if (n == 0 || n == 1) {
            return 1;
        } else {
            return n * faktorialRekursif(n - 1);
        }
    }

    static int faktorialIteratif(int n) {
        int faktor = 1;
        for (int i = n; i >= 1; i--) {
            faktor = faktor * i;
        }
        return faktor;
    }
}
