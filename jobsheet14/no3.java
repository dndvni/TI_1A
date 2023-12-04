public class no3 {
    public static void main(String[] args) {
        int n = 5;
        System.out.println("Nilai faktorial dari " + n + " adalah " + faktorialRekursif(n));
    }

    static int faktorialRekursif(int n) {
        if (n == 0 || n == 1) {
            return 1;
        } else {
            return n * faktorialRekursif(n - 1);
        }
    }

    
}
