package src.loops;

public class PrimeNumber {
    
    //A Prime Number is a number which is only divisible by 1 and itself.

    public static void main(String[] args) {
        int number = 169;
        boolean isPrime = true;
        
        for(int i = 2; i<number/2; i++) {
            if(number % i == 0) {
                isPrime = false;
                break;
            }
        }

        if(isPrime) {
            System.out.println("Prime Number");
        } else {
            System.out.println("Not a prime number");
        }

    }
}
