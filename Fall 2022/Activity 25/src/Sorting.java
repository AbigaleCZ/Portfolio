import java.util.*;
public class Sorting {
    Scanner input = new Scanner(System.in);
    public int[] getArray() {
        int[] arr = new int[5];
        int n = 0;
        for (int i = 0; i < arr.length; i++) {
            System.out.println("Enter a number for position " + n + " of the array:");
            arr[i] = input.nextInt();
            n++;
        }
        return arr;
    }
    public void sortArray(int[] a) {
        quickSort(a, 0, a.length - 1);
    }
    private void quickSort(int[] a, int start, int end) {
        int pivot;
        if (start < end) {
            pivot = split(a, start, end);
            quickSort(a, start, pivot - 1);
            quickSort(a, pivot + 1, end);
        }
    }
    private int split(int[] a, int start, int end) {
        int pivot, endLeft, mid;
        mid = (start + end) / 2;
        swap(a, start, mid);
        pivot = a[start];
        endLeft = start;
        for (int scan = start + 1; scan <= end; scan++) {
            if (a[scan] < pivot) {
                endLeft++;
                swap(a, endLeft, scan);
            }
        }
        swap(a, start, endLeft);
        return endLeft;
    }
    private void swap(int[] a, int x, int y) {
        int temp = a[x];
        a[x] = a[y];
        a[y] = temp;
    }
}
