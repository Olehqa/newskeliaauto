package homeworks.fivesection.arrays;

import java.util.ArrayList;

import static homeworks.fivesection.arrays.SortingArrays.bubbleSort;

public class SortArrayList {
    public static void main(String[] args) {


        ArrayList<Integer> numbersToSort = new ArrayList<>();
        numbersToSort.add(18);
        numbersToSort.add(10);
        numbersToSort.add(100);
        numbersToSort.add(56);
        numbersToSort.add(5);
        numbersToSort.add(333);
        numbersToSort.add(61);
        numbersToSort.add(2);

        System.out.println("Array before the bubble sort");
        for (int i : numbersToSort) {
            System.out.print(i + " ");
        }
        System.out.println(" ");

        bubbleSortList(numbersToSort, true);
        System.out.println(" ");
        System.out.println("Array after sorting - true");



        bubbleSortList(numbersToSort, false);
        System.out.println(" ");

        System.out.println("Array after sorting - false");


//        System.out.println("Array after desc bubble sort");
//        for (int i : numbersToSort) {
//            System.out.print(i + " ");
//        }
    }

    private static void bubbleSortList(ArrayList<Integer> numbersToSort, boolean asc) {
        int[] arr = new int[numbersToSort.size()];
        for (int i = 0; i < numbersToSort.size(); i++) {
            arr[i] = numbersToSort.get(i);
        }

        bubbleSort(arr, asc);
        ArrayList<Integer> intList = new ArrayList<>(arr.length);
        for (int i : arr) {
            intList.add(i);
            System.out.print(i + " ");
        }
    }
}