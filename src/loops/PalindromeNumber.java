package src.loops;

/*
 *
 * A palindrome number is the number which is same as the reverse of it.
 * 
 * I/P: 101
 * O/P: Palindrome
 * 
 * I/P: 745
 * O/P: Not Palindrome.
 * 
 * I/P: 999
 * O/P: Palindrome
 * 
 */

public class PalindromeNumber {

    public static void main(String[] args) {

        int number = 1000001;
        int numberCopy = number;
        int reverse = 0;

        while(numberCopy != 0) {
            int lastDigit = numberCopy%10;
            reverse = (reverse * 10) + lastDigit;
            numberCopy = numberCopy/10;
        }

        if(reverse == number) {
            System.out.println("Palindrome Number");
        } else {
            System.out.println("Not a Palindrome Number");
        }
    }
    
}
