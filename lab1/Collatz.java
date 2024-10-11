/** Class that prints the Collatz sequence starting from a given number.
 *  @author Angel Jimenez
 */
public class Collatz {
    public static void main(String[] args) {
        int n = 5;

        System.out.print(n + " ");
        while (n != 1) {
            n = nextNumber(n);
            System.out.print(n + " ");
        }
    }

    /** Yields the next number in the Collatz sequence given n. */
    public static int nextNumber(int currentNumber) {
        if (currentNumber % 2 == 0)  {
            return currentNumber / 2;
        } else {
            return 3 * currentNumber + 1;
        }
    }

}

