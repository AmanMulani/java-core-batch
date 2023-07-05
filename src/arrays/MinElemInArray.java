package src.arrays;

public class MinElemInArray {
    public static void main(String[] args) {

        int[] numbers = {1,2,34,5,111,322,1001,1298,29};

        int min = Integer.MAX_VALUE;

        for(int i = 0; i<numbers.length; i++) {
            int number = numbers[i];
            if(number < min) {
                min = number;
            }
        }

        System.out.println("The smallest element is: " + min);
    }
}
