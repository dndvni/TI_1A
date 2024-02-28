package JOBSHEET3ALGO.ArrayBalok;

public class Balok {
    public int panjang;
    public int lebar;
    public int tinggi;
    public String warna;
    public int jumlah;

    public Balok(int p, int l, int t) {
        panjang = p;
        lebar = l;
        tinggi = t;
    }

    public int hitungVolume() {
        return panjang*lebar*tinggi;
    }

    public Balok(int b, String c, int jml) {
        panjang = b;
        warna = c;
        jumlah = jml;
    }

    public void tampil(){

    }
}