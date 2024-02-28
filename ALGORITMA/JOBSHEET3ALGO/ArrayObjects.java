package JOBSHEET3ALGO;
// import java.util.Scanner;

public class ArrayObjects {

    public static void main(String[] args) {
        // Scanner sc = new Scanner(System.in);
        PersegiPanjang[][] ppArray = new PersegiPanjang[3][2];

        for(int i = 0; i <ppArray.length; i++){
            for(int j = 0; j<ppArray[i].length; j++) {
                ppArray[i][j] = new PersegiPanjang();
                if(j==1) {
                    ppArray[i][j].persegiPj = 5*(i+j+1);
                } else {
                    ppArray[i][j].persegiPj = 4*(i+1);
                }
            }
        }

        for(int i = 0; i < 3; i++) {
           System.out.println("Persegi Panjang ke-" + (i + 1));
           for(int j = 0; j <ppArray[0].length; j++) {
            System.out.print("Panjang: " + ppArray[i][j].persegiPj);j++;
            System.out.println(", lebar: " + ppArray[i][j].persegiPj);
           }
        }
    }
}