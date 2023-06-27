package src.loops;

/*
 * You are given a number, find the sum of the digits in the given number.
 * 
 * I/P: 231
 * O/P: 2+3+1 = 6
 * 
 * I/P: 10021
 * O/P: 1 + 0 + 0 + 2 + 1 = 4
 * 
 */

public class SumOfDigits {

    public static void main(String[] args) {
        int number = 1211;
        int sum = 0;

        while(number != 0) {
            int digit = number%10;
            sum += digit;
            number = number/10;
        }

        System.out.println("The sum is: " + sum);
    }
}
