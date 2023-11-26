import java.util.Scanner;

public class UcapanTerimaKasih_02 {
    public static String PenerimaUcapan(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Tuliskan nama orang yang ingin anda beri ucapan: ");
        String namaOrang = sc.nextLine();
        sc.close();
        return namaOrang;
    }
    public static void UcapanTerimaKasih(){
        String nama = PenerimaUcapan();
        System.out.println("Thank you "+nama+" for being the best teacher in teh world.\n"+
        "You inspired in me a love for learning and made me feel like I could ask you anything.");

        // memanggil metode baru dan memberikan parameter pesan tambahan 
        UcapanTambahan("I appreciate your dedication and guidance. ");
    }
    public static void UcapanTambahan(String tambahan) {
        System.out.println(tambahan);
    }

    public static void main(String[] args) {
        UcapanTerimaKasih();
    }
}