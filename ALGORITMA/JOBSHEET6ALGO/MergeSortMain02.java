// package JOBSHEET6ALGO;

// import JOBSHEET6ALGO.MergeSort02;

public class MergeSortMain02 {

    public static void main(String[] args) {
        int data[] = {10,40,30,50,70,20,100,90};
        System.out.println("Sorting dengan merge sort");
        MergeSort02 mSort = new MergeSort02();
        System.out.println("data awal");
        mSort.printArray(data);
        mSort.mergeSort(data);
        System.out.println("setelah diurutkan");
        mSort.printArray(data);
    }
}