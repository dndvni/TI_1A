// package JOBSHEET7ALGO;

public class Gudang02 {
    Barang02[] tumpukan;
    int size;
    int top;

    public Gudang02(int kapasitas) {
        size = kapasitas;
        tumpukan = new Barang02[size];
        top = -1;
    }

    public boolean cekKosong() {
        if (top == -1) {
            return true;
        } else {
            return false;
        }
    }

    public boolean cekPenuh() {
        if (top == size - 1) {
            return true;
        } else {
            return false;
        }
    }

    public void tambahBarang(Barang02 brg) {
        if (! cekPenuh()) {
            top++ ;
            tumpukan[top] = brg;
            System.out.println("Barang" + brg.nama + " berhasil ditambahkan ke Gudang");
        } else {
            System.out.println("Gagal! Tumpukan barang di Gudang sudah penuh");
        }
    }

    public Barang02 ambilBarang() {
        if (! cekKosong()) {
            Barang02 delete = tumpukan[top];
            top--;
            System.out.println("Barang " + delete.nama + " diambli dari gudang.");
            return delete;
        } else {
            System.out.println("Tumpukan barang kosong.");
            return null;
        }
    }

    public Barang02 lihatBarangTeratas() {
        if ( top == - 1) {
            Barang02 barangTeratas = tumpukan[top];
            System.out.println("Barang teratas: " + barangTeratas.nama);
            return barangTeratas;
        } else {
            System.out.println("Tumpukan barang kosong.");
            return null;
        }
    } 

    public void tampilkanBarang() {
        if (! cekKosong()) {
          System.out.println("Rincian tumpukan barang di gudang:");
          for (int i = top; i >= 0; i--) {
            for (int j = 0; j <= top; j++) {
              System.out.printf("Kode %d: %s (kategori %s)\n", tumpukan[j].kode, tumpukan[j].nama, tumpukan[j].kategori);
            }
          }
        } else {
          System.out.println("Tumpukan Barang Kosong.");
        }
      }
      
}