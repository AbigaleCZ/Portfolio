import java.util.*;
public class Sorting {
    Scanner input = new Scanner(System.in);
    public int[] getArray() {
        int[] arr = new int[5];
        for (int i = 0; i < 5; i++) {
            System.out.println("Enter an integer to put\nin slot " + (i + 1) + " of the array:");
            int num = input.nextInt();
            arr[i] = num;
        }
        return arr;
    }
    public int[] sortArray(int[] a) {
        int lastPos, index, temp;
        for (lastPos = a.length - 1; lastPos >= 0; lastPos--) {
            for (index = 0; index <= lastPos - 1; index++) {
                if (a[index] > a[index + 1]) {
                    temp = a[index];
                    a[index] = a[index + 1];
                    a[index + 1] = temp;
                }
            }
        }
        return a;
    }
}