import java.util.Scanner;

public class Kubus02 {
    // variabel sisi kubus
    private double sisi;

    // kontruktor untuk inisialisasi sisi kubus 
    public Kubus02(double sisi) {
        this.sisi = sisi;
    }

    // fungsi untuk menghitung volume kubus
    public double hitungVolume() {
        return Math.pow(sisi, 3);
    }
    
    // fungsi untuk menghitung luas permukaan kubus
    public double hitungLuasPermukaan() {
        return 6 * Math.pow(sisi,2);
    }
    
    public static void main(String[] args) {
        // membuat objek Kubus02 dengan sisi 5
        Kubus02 kubus = new Kubus02(5);

        // menghitung dan menampilkan volume kubus 
        System.out.println("Volume Kubus: " + kubus.hitungVolume());

        // menghitung dan menampilkan luas permukaan kubus
        System.out.println("Luas Permukaan Kubus: " + kubus.hitungLuasPermukaan());
    }
}