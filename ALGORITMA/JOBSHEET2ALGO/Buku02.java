package JOBSHEET2ALGO;

public class Buku02{
    
          // Atribut Buku 
    String judul, pengarang;
    int halaman, stok, harga, total, jumlahBeli;
    double hargaDiskon, bayar;

            // Konstruktor
            public Buku02(String jud, String pg, int hal, int stok, int har) {
                this.judul = jud;
                this.pengarang = pg;
                this.halaman = hal;
                this.stok = stok;
                this.harga = har;
            }
    
    

        // Method Buku
    void tampilInformasi() {
        System.out.println("Judul: " + judul);
        System.out.println("Pengarang: " + pengarang);
        System.out.println("Jumlah Halaman: " + halaman);
        System.out.println("Sisa stok: " + stok);
        System.out.println("Harga: Rp. " + harga);
    }

    // Menampilkan Hasil
    void tampilHasil(){
        System.out.println("Judul: " + judul);
        System.out.println("Pengarang: " + pengarang);
        System.out.println("Halaman: " + halaman);
        System.out.println("Stok: " + stok);
        System.out.println("Harga: Rp. " + harga);
    }

    // public void terjual(int jml) {
        // if (stok > 0 && stok >= jml) {
            // stok -= jml;
            // System.out.println(jml + " buku telah terjual.");
        // } else {
            // System.out.println("Stok sudah habis. Tidak bisa melakukan pembelian.");
        // }
    // }

    public void terjual(int jml) {
        if(jml < stok) {
            stok -= jml;
        } else if (stok == 0) {
            System.out.println("Buku Telah Terjual");
        } else if (jml > stok) {
            System.out.println("Stok telah habis. Tidak bisa melakukan pembelian");
        }
    }

    int hitungTotal(int jml) {
        jumlahBeli = jml;
        total = harga *jml;
        return total;
    }

    double hitungDiskon() {
        if (total > 15000) {
            hargaDiskon = total * 0.12;
        } else if (total > 75000 && total < 150000) {
            hargaDiskon = total * 0.5;
        } else if (total < 75000) {
            hargaDiskon = total * 0;
        }
        return hargaDiskon;
    }

    double hitungTotalBayar() {
        bayar = total - hargaDiskon;
        return bayar;
    }

    void restock(int jml) {
        stok += jml;
    }

    int gantiHarga(int hrg) {
        harga = hrg;
        return harga;
    }

    public Buku02() {

    }

    public static void main(String[] args) {
        // dalam metode lain
        Buku02 buku = new Buku02("Judul Buku", "Pengarang", 120, 70, 40);
        buku.judul = "Judul Buku";
        buku.pengarang = "Pengarang";
        buku.halaman = 120;
        buku. stok = 70;
        buku.harga = 40;

        buku.tampilInformasi();
        // buku.terjual(81);
        // buku.restock(10);
        buku.gantiHarga(30);
        System.out.println("Harga Buku Telah di Ubah");
        buku.terjual(81);
        buku.restock(10);

        buku.tampilInformasi();
    }

}