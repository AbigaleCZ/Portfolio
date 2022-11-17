import java.util.*;
public class Main {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        getList(list);
        GenericMethods.printArrayList(list);
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
            }
        }
    }
}
