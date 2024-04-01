// package JOBSHEET6ALGO;

public class pencarianBuku02 {
    Buku02[] listBk = new Buku02[5];
    int idx;

    void tambahBuku(Buku02 m) {
        if (idx < listBk.length) {
            listBk[idx] = m;
            idx++;
        } else {
            System.out.println("Data Sudah Penuh!");
        }
    }

    void tampilDataBuku() {
        for (Buku02 m : listBk) {
            m.tampilDataBuku();
        }
    }

    public int FindSeqSearch(int cari) {
        int posisi = 2;
        for (int j = 0; j < listBk.length; j++) {
            if (listBk[j].kodeBuku == cari) {
                return j;
            }
        }
        return -1;
    }

    public void tampilPosisi(int x, int pos) {
        if (pos != -1){
            System.out.println("data : " + x + "ditemukan pada indeks " + pos);
        } else {
            System.out.println("data : " + x + "tidak ditemukan");
        }
    }

    void TampilData (int x, int pos) {
        if (pos != -1) {
            System.out.println("Kode Buku : " + x);
            System.out.println("Judul : " + listBk[pos].judul);
            System.out.println("Tahun Terbit : "+ listBk[pos].tahunTerbit);
            System.out.println("Pengarang : " + listBk[pos].pengarang);
            System.out.println("Stok : " + listBk[pos].stok);
        } else {
            System.out.println("Data " + x + "tidak ditemukan!!");
        }
    }

    public Buku02 FindBuku(int cari) {
        for (int j = 0; j < listBk.length; j++) {
            if (listBk[j].kodeBuku == cari) {
                return listBk[j];
            }
        }
        return null;
    }

    public int FindBinarySearch(int cari, int left, int right) {
        int mid;
        if (right >= left) {
            mid = left + (right - left) / 2;
            if (cari == listBk[mid].kodeBuku) {
                return (mid);
            } else if (listBk[mid].kodeBuku < cari) {
                return FindBinarySearch(cari, left, mid-1);
            } else {
                return FindBinarySearch(cari, mid+1, right);
            }
        }
        return -1;
    }
}