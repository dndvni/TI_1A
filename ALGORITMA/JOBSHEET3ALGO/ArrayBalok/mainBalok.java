package JOBSHEET3ALGO.ArrayBalok;

public class mainBalok {
    public static void main(String[] args) {
        Balok[] blArray = new Balok[3]; // Konstruktor 1
        Balok[] balok = new Balok[3]; // Konstruktor 2

        blArray[0] = new Balok(100, 30, 12);
        blArray[1] = new Balok(120, 40, 15);
        blArray[2] = new Balok(210, 50, 25);

        balok[0] = new Balok(3, "merah" ,2);
        balok[1] = new Balok(6, "hijau" ,4);
        balok[2] = new Balok(2, "biru" ,5);

        for(int i = 0; i < 3; i++) {
            System.out.println("Volume balok ke-" + i + ": " + blArray[i].hitungVolume());
            System.out.println("panjang: " + balok[i].panjang);
            System.out.println("warna: " + balok[i].warna);
            System.out.println("banyak: " + balok[i].jumlah);
        }
    }
}