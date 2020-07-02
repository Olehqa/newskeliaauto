package homeworks.fivesection.arrays;

import java.util.ArrayList;

public class SortArrayList {
    public static void main(String[] args) {
        boolean asc = true;
        boolean desc = false;

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

        bubbleSort(numbersToSort, asc);

        System.out.println("");

        System.out.println("Array after asc bubble sort");
        for (int i : numbersToSort) {
            System.out.print(i + " ");
        }

        bubbleSort(numbersToSort, desc);

        System.out.println("");

        System.out.println("Array after desc bubble sort");
        for (int i : numbersToSort) {
            System.out.print(i + " ");
        }
    }

    private static boolean condition(ArrayList<Integer> array, boolean ascDesc, int j) {
        if (ascDesc) {
            return array.get(j - 1) > array.get(j);
        } else {
            return array.get(j - 1) < array.get(j);
        }
    }

    private static void bubbleSort(ArrayList<Integer> numbersToSort, boolean ascDesc) {
        int temp;
        for (int i = 0; i < numbersToSort.size() - 1; i++) {
            for (int j = 1; j < (numbersToSort.size() - i); j++) {
                if (condition(numbersToSort, ascDesc, j)) {
                    temp = numbersToSort.get(j - 1);
                    numbersToSort.set(j - 1, numbersToSort.get(j));
                    numbersToSort.set(j, temp);
                }
            }
        }
    }
}