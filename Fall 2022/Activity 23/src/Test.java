public class Test {
    public static void main(String[] args) {
        int n = 5;
        long cTime = 0, pTime, eTime;
        cTime = System.currentTimeMillis();
        // BigO.printOnce("I'm a line.");
        // BigO.printNTimes(n);
        BigO.printNSquaredTimes(n);
        pTime = cTime;
        cTime = System.currentTimeMillis();
        eTime = (cTime - pTime);
        System.out.println("That took " + eTime + " millisecond(s).");
    }
}
