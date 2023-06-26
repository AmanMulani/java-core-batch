package src.loops;

public class Factorial {

    /**
     * Factorial: It is the product of 1 to n.
     * Example:
     * I/P: 5
     * O/P: 1*2*3*4*5 = 120
     */
    public static void main(String[] args) {
        int number = 10;
        int factorial = 1;
        for(int i = 1; i<=number; i++) {
            factorial = factorial * i;
        }
        System.out.println("The factorial of number is:" + factorial);
    }
}
