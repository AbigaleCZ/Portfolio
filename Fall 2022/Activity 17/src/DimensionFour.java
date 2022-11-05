import java.util.*;
public class DimensionFour {
    public static void main(String[] args) {
        Random num = new Random();
        int[][][][] tesseract = new int[3][3][3][3];
        for (int t = 0; t < 3; t++) {
            for (int e = 0; e < 3; e++) {
                for (int s = 0; s < 3; s++) {
                    for (int r = 0; r < 3; r++) {
                        tesseract[t][e][s][r] = num.nextInt(1,81);
                    }
                }
            }
        }
        for (int t = 0; t < 3; t++) {
            for (int e = 0; e < 3; e++) {
                System.out.print("\nBox " + (t+1) + ", Layer " + (e+1) + ":");
                for (int s = 0; s < 3; s++) {
                    System.out.print('\n');
                    for (int r = 0; r < 3; r++) {
                        System.out.printf("%d ", tesseract[t][e][s][r]);
                    }
                }
            }
        }
    }
}
