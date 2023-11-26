public class Perocobaan5No3 {
    // metode dengan tipe data varargs dan tipe data lain
    public static void tampilkanInfo(String judul, int tahun, String... aktor) {
        System.out.println("Film: "+ judul);
        System.out.println("Tahun: "+ tahun);

        if (aktor.length > 0) {
            System.out.print("Aktor: ");
            for (String aktorNama : aktor) {
                System.out.print(aktorNama + " ");
            }
            System.out.println();
        } else {
            System.out.println("Aktor: Todak ada informasi aktor");
        }
    }
    public static void main(String[] args) {
        // contoh pemanggilan metode dengan tipe data varargs dan tipe data lain
        tampilkanInfo("Inception", 2010, "Leonardo Dicaprio", "Ellen Page", "Tom Hardy");
        tampilkanInfo("The Shawshank Redemption", 1994);
    }
}