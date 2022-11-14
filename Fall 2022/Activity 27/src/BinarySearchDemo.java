import java.util.*;
public class BinarySearchDemo {
    public static int search(ArrayList<Integer> array, int value) {
        int first = 0, last = array.size() - 1, pos = -1;
        boolean found = false;
        while (!found && first <= last) {
            int middle = (first + last) / 2;
            if (array.get(middle) == value) {
                found = true;
                pos = middle;
            }
            else if (array.get(middle) > value) {
                last = middle - 1;
            }
            else {
                first = middle + 1;
            }
        }
        return pos;
    }
}
