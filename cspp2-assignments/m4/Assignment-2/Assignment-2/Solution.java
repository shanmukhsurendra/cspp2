/**
 * { item_description }.
 */
import java.util.Scanner;
/**
 * Class for solution.
 */
public final class Solution {
    /**
     * {solution class}.
     */
    private Solution() {
        /**
         * { item_description }.
         */
    }
    /**
     * {reads two input arrays and returns 
     * the addition of two arrays}.
     *
     * @param      args  The arguments
     */
    public static void main(final String[] args) {
        /**
         * {using for loops reads input
         * and using fortloops returns the 
         * array of addittion of two matrix}.
         */
        Scanner sc = new Scanner(System.in);
        int a1srowa = sc.nextInt();
        int a1colms = sc.nextInt();
        int[][] a1 = new int[a1srowa][a1colms];
        for (int i = 0; i < a1srowa; i++) {
            for (int j = 0; j < a1colms; j++) {
                a1[i][j] = sc.nextInt();
            }
        }
        int a2srowa = sc.nextInt();
        int a2colms = sc.nextInt();
        int[][] a2 = new int[a2srowa][a2colms];
        for (int i = 0; i < a2srowa; i++) {
            for (int j = 0; j < a2colms; j++) {
                a2[i][j] = sc.nextInt();
            }
        }
        int[][] sum = new int[a1srowa][a1colms];
        if (a1.length == a2.length) {
            for (int x = 0; x < a1srowa; x++) {
                for (int y = 0; y < a1colms; y++) {
                    sum[x][y] = a1[x][y] + a2[x][y];
                }
            }
            for (int i = 0; i < a2srowa; i++) {
                for (int j = 0; j < a2colms; j++) {
                    if (j == a2colms - 1) {
                        System.out.print(sum[i][j]);
                    } else {
                        System.out.print(sum[i][j] + " ");
                    }
                }
                System.out.println();
            }

        } else {
            System.out.println("not possible");
        }
    }
}

