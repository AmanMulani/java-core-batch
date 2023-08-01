package src.collections;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.Set;

//Write a program that continuously takes a word input from the user till
//a duplicate word is entered.
public class ExitOnRepeatedWord {


    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Set<String> names = new HashSet<>();
        while(true) {
            String word = br.readLine();
            if(names.contains(word)) {
                System.out.println("Duplicate Word. Ending the program!!");
                break;
            } else {
                names.add(word);
            }
        }
    }
    
}
