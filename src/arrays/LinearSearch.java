package src.arrays;

public class LinearSearch {

    /**
     * You are given an array of elements, and a number.
     * Check if the number exists in the array.
     * 
     * For example:
     * arr = [1,2,3,4,5,6]
     * 
     * number = 6
     * O/P: true
     * 
     * number = 8
     * O/P: false
     */
    
    public static void main(String[] args) {
        int[] arr = { 12, 13, 64, 1, 0, 112, 45, 36, 43 };
        int number = 49;

        boolean isNumberPresent = false;

        for(int i = 0; i<arr.length; i++) {
            if(number == arr[i]) {
                isNumberPresent = true;
                break;
            }
        }
        System.out.println(isNumberPresent);
    }
}
