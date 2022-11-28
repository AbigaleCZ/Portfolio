import java.lang.reflect.Type;
import java.util.*;
public class GenericMethods {
    public static <E> void printArrayList(ArrayList<E> alist) {
        for (E e : alist) {
            System.out.println(e);
        }
    }
}
