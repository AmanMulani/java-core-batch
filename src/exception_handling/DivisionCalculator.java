package src.exception_handling;
import java.io.*;


//Steps involved in exception handling:
//1. Identify places where exception can occur.
//2. Put that block of code in try block
//3. Write the logic to handle exception if it occurs.

public class DivisionCalculator {

    public static void main(String[] args) throws IOException{

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Press cntrl + c to exit the program");
        System.out.println("===================================");
        while(true) {
            System.out.println("Enter number 1: ");
            int a = Integer.parseInt(br.readLine());

            System.out.println("Enter number 2: ");
            int b = Integer.parseInt(br.readLine());

            try {
                System.out.println("The answer is: " + divide(a, b));
            } catch (Exception e) {
                System.out.println("Error in dividing the numbers");
                System.out.println("The error is: " + e.toString());
            }

            System.out.println("===================================");
        }

    }

    public static int divide(int a, int b) throws Exception {
        return a/b;
    }
    
}
