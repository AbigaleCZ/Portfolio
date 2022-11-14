public class Main {
    public static void main(String[] args) {
        Sorting sort = new Sorting();
        int[] array = sort.getArray();
        System.out.print("Unsorted array:");
        for (int i : array) {
            System.out.print(" " + i);
        }
        sort.sortArray(array);
        System.out.print("\nSorted array:");
        for (int i : array) {
            System.out.print(" " + i);
        }
    }
}
