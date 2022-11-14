public class GCD {
    public int findGCDForLoop(int n1, int n2) {
        int sm, gcd = 0;
        if (n1 < n2) {
            sm = n1;
        }
        else {
            sm = n2;
        }
        for (int i = 1; i <= sm; i++) {
            if (n1 % i == 0 && n2 % i == 0) {
                gcd = i;
            }
        }
        return gcd;
    }
    public int findGCDWhileLoop(int n1, int n2) {
        while (n1 != n2) {
            if (n1 < n2) {
                n2 -= n1;
            }
            else {
                n1 -= n2;
            }
        }
        return n1;
    }
    public int findGCDRecursive(int n1, int n2) {
        if (n1 < n2) {
            int rm = n2 % n1;
            n1 = n2;
            n2 = rm;
        }
        else {
            int rm = n1 % n2;
            n1 = n2;
            n2 = rm;
        }
        if (n2 == 0) {
            return n1;
        }
        return findGCDRecursive(n1, n2);
    }
}
