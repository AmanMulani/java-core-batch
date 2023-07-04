package src.arrays;

public class SimpleArray {
    public static void main(String[] args) {

        String[] fruits = {"Apple", "Pineapple", "Custard Apple", "Green Apple"};
        for(int i = 0; i<fruits.length; i++) {
            System.out.println(fruits[i]);   
        }

        int[] prices = {1123,534,21343,1354,1234,1245,1264,67563};
        int sum = 0;
        for(int i = 0; i<prices.length; i++) {
            sum += prices[i];
        }
        System.out.println(sum);
    }    
}





