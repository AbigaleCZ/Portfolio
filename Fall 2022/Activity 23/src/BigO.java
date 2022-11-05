public class BigO {
    public static void printOnce(String s) {
        System.out.println(s);
    }
    public static void printNTimes(int n) {
        for (int i = 0; i < n; i++) {
            System.out.println("I am being printed. Please help.");
        }
    }
    public static void printNSquaredTimes(int n) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.println("Why didn't you help me? Now I'm being printed more.");
            }
        }
    }
}
