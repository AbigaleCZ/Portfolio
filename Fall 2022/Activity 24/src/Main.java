public class Main {
    public static void main(String[] args) {
        Sorting sorter = new Sorting();
        int[] array = sorter.getArray();
        System.out.print(array[0]);
        for (int i = 1; i < array.length; i++) {
            System.out.print(", " + array[i]);
        }
        int[] array2 = sorter.sortArray(array);
        System.out.print("\n" + array2[0]);
        for (int i = 1; i < array2.length; i++) {
            System.out.print(", " + array2[i]);
        }
    }
}
