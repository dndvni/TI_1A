public class no2 {
    public static void main(String[] args) {
        int n = 5;
        System.out.println("Nilai faktorial dari " + n + " adalah " + faktorialIteratif(n));
    }

    static int faktorialIteratif(int n) {
        int faktor = 1;
        for (int i = n; i >= 1; i--) {
            faktor = faktor * i;
        }
        return faktor;
    }
}
