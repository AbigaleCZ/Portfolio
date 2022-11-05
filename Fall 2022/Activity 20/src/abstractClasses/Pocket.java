package abstractClasses;
import java.util.*;
public abstract class Pocket {
    protected ArrayList<String> items = new ArrayList<String>();
    protected ArrayList<String> blanks = new ArrayList<String>();
    protected int index = -1;
    public abstract void addItem();
    public abstract void removeItem();
    public abstract void viewPocket();
}