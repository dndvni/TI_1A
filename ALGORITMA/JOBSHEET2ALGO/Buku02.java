package JOBSHEET2ALGO;

public class Buku02{
    
          // Atribut Buku 
    String judul, pengarang;
    int halaman, stok, harga;

    // Method Buku
    void tampilInformasi() {
        System.out.println("Judul: " + judul);
        System.out.println("Pengarang: " + pengarang);
        System.out.println("Jumlah Halaman: " + halaman);
        System.out.println("Sisa stok: " + stok);
        System.out.println("Harga: " + harga);
    }

    void terjual(int jml) {
        if (stok > 0) {
            stok -= jml;
            System.out.println(jml + " buku telah terjual.");
        } else {
            System.out.println("Stok sudah habis. Tidak bisa melakukan pembelian.");
        }
    }

    void restock(int jml) {
        stok += jml;
    }

    void gantiHarga(int hrg) {
        harga = hrg;
    }

    
  
}