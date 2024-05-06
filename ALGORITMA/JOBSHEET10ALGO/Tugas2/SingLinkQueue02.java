package Tugas2;

public class SingLinkQueue02 {
    Node02 front, rear;

    boolean isEmpty() {
        return front == null;
    }

    void print() {
        if (isEmpty()) {
            System.out.println("Queue Kosong");
        } else {
            Node02 tmp = front;
            System.out.print("Antrian Queue: \t");
            while (tmp != null) {
                System.out.println(tmp.data + "\t");
                tmp = tmp.next;
            }
            System.out.println();
        }
    }

    void addLast(Mahasiswa02 data) {
        Node02 nd02 = new Node02(data, null);
        if(isEmpty()) {
            front = nd02;
            rear = nd02;
        } else {
            rear.next = nd02;
            rear = nd02;
        }
    }

    void Enqueue(Mahasiswa02 data) {
        Node02 nd02 = new Node02(data, null);
        if (isEmpty()) {
            front = nd02;
            rear = nd02;
        } else {
            rear.next = nd02;
            rear = nd02;
        }
    }

    void Dequeue() {
        if (isEmpty()) {
            System.out.println("Antrian Sedang Kosong");
            return;
        } if (front == rear) {
            front = rear = null;
        } else {
            front = front.next;
        }
    }

    void displayQueue() {
        if (isEmpty()) {
            System.out.println("Antrian Sedang Kosong");
            return;
        }

        Node02 temp = front;
        System.out.println("Antrian Layanan Unit Mahasiswa:");
        while (temp != null) {
            System.out.println("NIM: " + temp.data.nim + " " + "Nama: " + temp.data.nama + " ");
            temp = temp.next;
        }
    }


}