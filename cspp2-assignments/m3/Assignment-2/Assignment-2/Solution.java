/**
 * { item_description }.
 */
import java.util.Scanner;
/**
    Do not modify this main function.
    */
public final class Solution {
    /**
     * Constructs the object.
     */
    private Solution() {
        /**
         * { item_description }.
         */
    }
    /** Fill the main function to print the number of 7's between 1 to n.
     */
    /**
     * {prints the count value which increaseas
     * every time when we find the requires
     * number}.
     *
     * @param      args  The arguments
     */
    public static void main(final String[] args) {
        /**
         * {to print total number of given 
         * number upto range}.
         */
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int count = 0;
        final int sev = 7;
        final int ten = 10;
        for (int i = sev; i <= n; i++) {
            int y = i;
            while (y > 0) {
                int x = y % ten;
                if (x == sev) {
                    count = count + 1;
                }
                y = y / ten;
            }


        }
        System.out.println(count);



    }
}


