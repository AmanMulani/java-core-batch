package src.miscellaneous;
import java.io.*;

public class ConsoleInputBufferedReader {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Enter you name");
        String name = br.readLine();
        System.out.println("Enter your roll number");
        int rollNumber = Integer.parseInt(br.readLine());
        System.out.println("Enter your height in inches");
        double height = Double.parseDouble(br.readLine());
        System.out.println("Are you vegetarian");
        boolean isVegetarian = Boolean.parseBoolean(br.readLine());

        System.out.println("Name: " + name);
        System.out.println("Roll number: " + rollNumber);
        System.out.println("Height: " + height);
        System.out.println("Vegetarian: " + isVegetarian);
    }
}
