package src.collections;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

//Given a string, find the count of each letter present in the string.
public class CountFrequencyOfLetters {
    
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String input = br.readLine();
        Map<Character, Integer> freqMap = new HashMap<>();

        char[] inputChars = input.toLowerCase().toCharArray();

        for(char currChar : inputChars) {
            if(currChar == ' ') {
                continue;
            }
            if(freqMap.containsKey(currChar)) {
                freqMap.replace(currChar, freqMap.get(currChar) + 1);
            } else {
                freqMap.put(currChar, 1);
            }
        }

        System.out.println(freqMap.toString());
    }
}
