import java.util.*;
public class Main {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        getList(list);
        ArrayList<Integer> list2 = new ArrayList<>();
        getInts(list2);
        System.out.println("Integer ArrayList\n-----------------");
        GenericMethods.printArrayList(list2);
        ArrayList<Character> list3 = new ArrayList<>();
        getChars(list3);
        System.out.println("Character ArrayList\n-------------------");
        GenericMethods.printArrayList(list3);
        ArrayList<Double> list4 = new ArrayList<>();
        getDoubles(list4);
        System.out.println("Double ArrayList\n----------------");
        GenericMethods.printArrayList(list4);
    }
    public static void getList(ArrayList<String> alist) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a String to add to the list,\nor enter !!! to quit.");
        String entry = input.nextLine();
        while (true) {
            if (entry.equals("!!!")) {
                break;
            }
            else {
                alist.add(entry);
                entry = input.nextLine();
            }
        }
    }
    public static void getInts(ArrayList<Integer> alist) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter an Integer to add to the list,\nor enter !!! to quit.");
        String entry = input.nextLine();
        while (true) {
            if (entry.equals("!!!")) {
                break;
            }
            else {
                alist.add(Integer.parseInt(entry));
                entry = input.nextLine();
            }
        }
    }
    public static void getChars(ArrayList<Character> alist) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a Character to add to the list,\nor enter !!! to quit.");
        String entry = input.nextLine();
        while (true) {
            if (entry.equals("!!!")) {
                break;
            }
            else {
                alist.add(Character.parseChar(entry));
                entry = input.nextLine();
            }
        }
    }
    public static void getDoubles(ArrayList<Double> alist) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a Double to add to the list,\nor enter !!! to quit.");
        String entry = input.nextLine();
        while (true) {
            if (entry.equals("!!!")) {
                break;
            }
            else {
                alist.add(Double.parseDouble(entry));
                entry = input.nextLine();
            }
        }
    }
}
