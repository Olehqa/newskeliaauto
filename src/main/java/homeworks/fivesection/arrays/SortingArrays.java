package homeworks.fivesection.arrays;

import static org.apache.commons.lang3.StringUtils.SPACE;

public class SortingArrays {

    static void bubbleSort(int[] arr, boolean asc) {

        int n = arr.length;
        int temp;

        for (int i = 0; i < n; i++) {
            for (int j = 1; j < (n - i); j++) {
                if (asc ? arr[j - 1] > arr[j] : arr[j - 1] < arr[j]) {
                    temp = arr[j - 1];
                    arr[j - 1] = arr[j];
                    arr[j] = temp;
                }
            }
        }
    }

    public static void main(String[] args) {
        int[] arr = {3, 60, 41, 14, 45, 320, 5, 99};

        System.out.println("Array Before Bubble Sort");
        for (int value : arr) {
            System.out.print(value + SPACE);
        }
        System.out.println();

        bubbleSort(arr, true);

        System.out.println("Array After asc Bubble Sort");
        for (int value : arr) {
            System.out.print(value + SPACE);
        }
        System.out.println();
        bubbleSort(arr, false);

        System.out.println("Array After desc Bubble Sort");
        for (int value : arr) {
            System.out.print(value + SPACE);
        }
    }
}