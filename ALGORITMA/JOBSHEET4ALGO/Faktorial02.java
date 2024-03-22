package JOBSHEET4ALGO;

public class Faktorial02 {

    public int nilai;

    int faktorialBF(int n){
        // int fakto = 1; // digunakan menyimpan hasil faktorial
        // for (int i = 1; i <= n; i++) {
            // fakto = fakto * 1;
        // }
        // return fakto;
        if (n == 0|| n == 1) {
            return 1;
        } else {
            return n * faktorialBF(n-1);
        }
    }

    int faktorialDC(int n) {
        if (n==1) {
            return 1;
        } else {
            int fakto = n * faktorialDC(n-1);
            return fakto;
        }
    }
}