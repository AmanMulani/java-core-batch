package src.loops;

public class PrimeNumber {
    
    //A Prime Number is a number which is only divisible by 1 and itself.

    public static void main(String[] args) {
        int number = 17;
        boolean isPrimeNumber = isPrime(number);

        if(isPrimeNumber) {
            System.out.println("Prime Number");
        } else {
            System.out.println("Not a prime number");
        }

    }

    public static boolean isPrime(int number) {
        boolean isPrimeFlag = true;
        for(int i = 2; i<number/2; i++) {
            if(number % i == 0) {
                isPrimeFlag = false;
                break;
            }
        }

        if(isPrimeFlag) {
            return true;
        } else {
            return false;
        }
    }
}
