package stringArrayList;
import java.util.*;
public class StringArrayList {
    ArrayList<String> list = new ArrayList<String>();
    Scanner input = new Scanner(System.in);
    public void addString() {
        System.out.println("Please enter the item you'd like to add to the list:");
        String str = input.nextLine();
        list.add(str);
    }
    public void removeString() {
        System.out.println("Which item, between 0 and " + (list.size() - 1) + ", wouold you like to remove?");
        int ind = input.nextInt();
        System.out.println("Item " + ind + ", " + list.get(ind) + ", has been removed.");
        list.remove(ind);
    }
    public void viewString() {
        System.out.println("Choose a number between 0 and " + (list.size() - 1) + " to view a list item:");
        int ind = input.nextInt();
        System.out.println("The item corresponding to " + ind + " is " + list.get(ind) + ".");
    }
    public void countStrings() {
        System.out.println("This list has " + list.size() + " items.");
    }
    public void forList() {
        System.out.println("The items in the list are:");
        for (int i = 0; i < list.size(); i++) {
            System.out.println(i + ": " + list.get(i));
        }
    }
    public void eachList() {
        System.out.println("The items in this list are:");
        int p = 0;
        for (String i : list) {
            System.out.println(p + ": " + i);
            p++;
        }
    }
}
