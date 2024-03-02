package JOBSHEET3ALGO.LatPrak;

import java.util.Scanner;

class Kerucut {
    public int jari2;
    public int miring;
    public double phi = 3.14;

    public double tinggiKerucut() {
        double t = Math.sqrt(miring * miring - jari2 * jari2);
        return t;
    }

    public Kerucut(int r, int s) {
        jari2 = r;
        miring = s;
    }

    public double LPKerucut() {
        return phi * jari2 * miring + phi * jari2 * jari2;
    }

    public double VolKerucut() {
        return ((phi * jari2 * jari2) * tinggiKerucut()) / 3;
    }
}

class Limas {
    public int sisi;
    public int tinggi;

    public double LPLimas() {
        double TStegak = Math.sqrt((0.5 * sisi) * (0.5 * sisi) + tinggi * tinggi);
        double LStegak = (0.5 * sisi * TStegak);
        return (sisi * sisi) + (4 * LStegak);
    }

    public double VolLimas() {
        return ((sisi * sisi) * tinggi) / 3;
    }
}

class Bola {
    public int r;

    public double LPBola() {
        return 4 * 3.14 * (r * r);
    }

    public double VolBola() {
        return Math.PI * (r * r * r) * 4/3;
    }
}

public class BangungRuang {
    public static void main(String[] args) {
        Scanner sc02 = new Scanner(System.in);

        System.out.println("PIlih bangun datar");
        System.out.println("1. Kerucut");
        System.out.println("2. Limas segi empat sama sisi");
        System.out.println("3. Bola");
        System.out.print("Masukkan Angka: ");
        int terpilih = sc02.nextInt();

        switch(terpilih) {
            // Kerucut 
            case 1:
                Kerucut[] ker = new Kerucut[1];

                for (int i = 0; i < ker.length; i++) {
                    System.out.println("Kerucut ke-" + i);
                    System.out.print("jari-jari Kerucut:");
                    int r = sc02.nextInt();
                    System.out.println("Miring Kerucut: ");
                    int s = sc02.nextInt();
                    ker [i] = new Kerucut(r, s);
                }

                for(int i = 0; i < ker.length; i++) {
                    System.out.println("Luas Permukaan Kerucut ke-" + i + ": " + ker[i].LPKerucut() + "cm2");
                    System.out.println("Volumr Kerucut ke-" + i + ": " + ker[i].VolKerucut() + " cm3");
                }
                break;

                // Limas Segi Empat Sama Sisi
                case 2:
                    Limas[] lim = new Limas[1];
                    for (int i = 0; i < lim.length; i++) {

                        System.out.println("Limas ke-" + i);
                        System.out.println("Panjang sisi alas: ");
                        lim[i].sisi = sc02.nextInt();
                        System.out.println("Tinggi limas: ");
                        lim[i].tinggi = sc02.nextInt();
                    }

                    for (int i = 0; i < lim.length; i++) {
                        System.out.println("Luas permukaan limas ke-" + i + ": " + lim[i].LPLimas() + "cm2");
                        System.out.println("Volume limas ke-" + i + ": " + lim[i].VolLimas());
                    }
                    break;

                // Bola
                case 3:
                    Bola[] bal = new Bola[1];
                    for (int i = 0; i < bal.length; i++) {
                        bal[i] = new Bola();

                        System.out.println("Bola ke-" + i);
                        System.out.print("Panjang jari-jari: ");
                        bal[i].r = sc02.nextInt();
                    }

                    for (int i = 0; i < bal.length; i++) {
                        System.out.println("Luas permukaan bola ke-" + i + ": " + bal[i].LPBola() + "cm2");
                        System.out.println("Volume bola ke-" + i + ": " + bal[i].VolBola() + "cm3");
                    }
                    break;
                
                default:
                    System.out.println("Pilih 1 2 3");
                    break;
        }
        sc02.close();
    }
}