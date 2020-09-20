package homeworks.fivesection.arrays;

public class SortingArrays {

    private static boolean condition(int[] array, boolean asc, int j) {
        return asc ? array[j - 1] > array[j] : array[j - 1] < array[j];
    }

    static void bubbleSort(int[] arr, boolean asc) {

        int n = arr.length;
        int temp;

        for (int i = 0; i < n; i++) {
            for (int j = 1; j < (n - i); j++) {
                if (condition(arr, asc, j)) {
                    temp = arr[j - 1];
                    arr[j - 1] = arr[j];
                    arr[j] = temp;
                }
            }
        }
    }

    public static void main(String[] args) {
        int[] arr = {3, 60, 41, 14, 45, 320, 5, 99};
        boolean asc = true;
        boolean desc = false;

        System.out.println("Array Before Bubble Sort");
        for (int value : arr) {
            System.out.print(value + " ");
        }
        System.out.println();

        bubbleSort(arr, asc);

        System.out.println("Array After asc Bubble Sort");
        for (int value : arr) {
            System.out.print(value + " ");
        }
        System.out.println();
        bubbleSort(arr, desc);

        System.out.println("Array After desc Bubble Sort");
        for (int value : arr) {
            System.out.print(value + " ");
        }
    }
}
