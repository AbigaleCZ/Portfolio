import java.util.*;
public class PalindromeCheck {
    private static int ind = 0;
    private static boolean pal = true;
    private static char[] inv = {' ', '.', ',', '!', '?', '"', '=', '+', '-', '_', '@', '#', '>', '<', '$', ';', ':', '%', '^', ')', '(', '*', '&'};
    public static boolean check(String s) {
        char[] arr = s.toLowerCase().toCharArray();
        ArrayList<Character> alc = new ArrayList<Character>();
        for (int i = 0; i < inv.length/2; i++) {
            for (int v = 0; v < inv.length; v++) {
                if (arr[i] != inv[v]) {
                    alc.add(arr[i]);
                }
            }
        }
        if (pal && ind <= (alc.size()-1)/2) {
            if (alc.get(ind) != alc.get(alc.size() - 1 - ind)) {
                pal = false;
            }
            ind++;
            check(s);
        }
        return pal;
    }
}
