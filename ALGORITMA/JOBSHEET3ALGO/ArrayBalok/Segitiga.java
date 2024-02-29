package JOBSHEET3ALGO.ArrayBalok;

public class Segitiga {

    public int alas;
    public int tinggi;

    public Segitiga(int a, int t) {
        alas = a;
        tinggi = t;
    }

    public int hitungLuas() {
        return alas/2*tinggi;
    }

    public double hitungKeliling() {
        double miring = Math.sqrt(Math.pow(alas/2,2) + Math.pow(tinggi,2));
        return alas +2*miring;
    }
}