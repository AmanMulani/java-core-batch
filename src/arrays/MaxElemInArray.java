package src.arrays;

public class MaxElemInArray {
    
    public static void main(String[] args) {

        int[] numbers = {1,2,34,5,111,322,1001,1298,29};

        int max = Integer.MIN_VALUE;

        for(int i = 0; i<numbers.length; i++) {
            int number = numbers[i];
            if(number > max) {
                max = number;
            }
        }

        System.out.println("The biggest element is: " + max);
    }
}
