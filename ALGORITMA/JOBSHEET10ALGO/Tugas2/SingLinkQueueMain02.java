package Tugas2;

public class SingLinkQueueMain02 {

    public static void main(String[] args) {
        SingLinkQueue02 SLQ = new SingLinkQueue02();
        
        SLQ.addLast(new Mahasiswa02(111, "Anton"));
        SLQ.addLast(new Mahasiswa02(112, "Prita"));
        SLQ.addLast(new Mahasiswa02(113, "Yusuf"));
        SLQ.addLast(new Mahasiswa02(114, "Doni"));
        SLQ.addLast(new Mahasiswa02(115, "Sari"));

        System.out.println("==============================");

        SLQ.displayQueue();

        System.out.println("==============================");

        System.out.println("Dequeue: " );
        SLQ.Dequeue();
        SLQ.Dequeue();

        System.out.println("==============================");


        SLQ.displayQueue();
    }
}