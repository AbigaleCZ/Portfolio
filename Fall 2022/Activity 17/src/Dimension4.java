import java.util.*;
public class Dimension4 {
    public static void main(String[] args) {
        int[][][][] tesseract = {{
                    {
                            {num(), num(), num()},
                            {num(), num(), num()},
                            {num(), num(), num()}
                    },
                    {
                            {num(), num(), num()},
                            {num(), num(), num()},
                            {num(), num(), num()}
                    },
                    {
                            {num(), num(), num()},
                            {num(), num(), num()},
                            {num(), num(), num()}
                    }
                },
                {
                    {
                            {num(), num(), num()},
                            {num(), num(), num()},
                            {num(), num(), num()}
                    },
                    {
                            {num(), num(), num()},
                            {num(), num(), num()},
                            {num(), num(), num()}
                    },
                    {
                            {num(), num(), num()},
                            {num(), num(), num()},
                            {num(), num(), num()}
                    },
                },
                {
                        {
                                {num(), num(), num()},
                                {num(), num(), num()},
                                {num(), num(), num()}
                        },
                        {
                                {num(), num(), num()},
                                {num(), num(), num()},
                                {num(), num(), num()}
                        },
                        {
                                {num(), num(), num()},
                                {num(), num(), num()},
                                {num(), num(), num()}
                        }
                }};
        int box = 0, layer = 0;
        for (int[][][] t : tesseract) {
            box++;
            layer = 0;
            System.out.println("Box " + box);
            for (int[][] e : t) {
                layer++;
                System.out.println("Layer " + layer);
                for (int[] s : e) {
                    System.out.println(Arrays.toString(s));
                }
            }
        }
    }
    public static int num() {
        Random number = new Random();
        return number.nextInt(1, 81);
    }
}
