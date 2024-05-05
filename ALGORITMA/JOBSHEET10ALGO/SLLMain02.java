package JOBSHEET10ALGO;

public class SLLMain02 {
    public static void main(String[] args) {

        SingleLinkedList02 singLL = new SingleLinkedList02();
        singLL.print();
        singLL.addFirst(new Mahasiswa02(111, "Anton"));
        singLL.print();
        singLL.addLast(new Mahasiswa02(112, "Prita"));
        singLL.print();
        singLL.insertAfter(112, new Mahasiswa02(113, "Yusuf"));
        singLL.print();
        singLL.insertAfter(113, new Mahasiswa02(114, "Doni"));
        singLL.print();
        singLL.insertAt(4, new Mahasiswa02(115, "Sari"));
        singLL.print();


        
       
    }
}