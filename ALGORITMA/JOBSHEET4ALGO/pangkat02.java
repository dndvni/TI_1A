package JOBSHEET4ALGO;

public class pangkat02 {
    public int nilai;
    public int pangkat;

public pangkat02(int a, int n) {
    this.nilai = a;
    this.pangkat = n;
}
    int pangkatBF(int a, int n) {
        int hasil = 1;
        for (int i = 0; i <n; i++) {
            hasil = hasil * a;
        }
        return hasil;
    }
    int pangkatDC(int a, int n) {
        if (n == 0) {
            return 1;
        } else {
            if (n%2==1) {
                return (pangkatDC(a, n/2) * pangkatDC(a, n/2)*a);
            } else {
                return (pangkatDC(a, n/2) * pangkatDC(a, n/2));
            }
        }
    }
}