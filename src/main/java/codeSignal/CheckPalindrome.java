package codeSignal;

import java.nio.channels.InterruptedByTimeoutException;
import java.util.HashMap;

/*3rd challenge, level 1
Given the string, check if it is a palindrome.

Example
For inputString = "aabaa", the output should be solution(inputString) = true;
For inputString = "abac", the output should be solution(inputString) = false;
For inputString = "a", the output should be solution(inputString) = true.
* */
public class CheckPalindrome {
    public static void main(String[] args) {
        //System.out.println( solutionStringBuilder("madam"));
        System.out.println(solutionWithHash("aabbcd"));
    }
    boolean solution(String inputString) {
        String inversa="";
        for (int i = inputString.length(); i >0 ; i--) {
            inversa+=inputString.substring(i-1, i);
        }
        return inputString.equals(inversa);
    }

    public static boolean solutionStringBuilder(String input){
        StringBuilder reverse = new StringBuilder(input).reverse();
        return input.equals(reverse.toString());
    }

    public static boolean solutionWithHash(String input){
         char[] array=input.toCharArray();
        HashMap<Character, Integer> charFrequency=new HashMap<>();

        // Count the frequency of each character in the string
        for (char e:input.toCharArray()) { //transform string input in array
            charFrequency.put(e, charFrequency.getOrDefault(e,0)+1); //if that char is not in the map, then frequency is 0, else +1
        }

        // Count the number of characters with odd frequency
        int oddCounter=0;
        for (int counter: charFrequency.values()){
            if (counter%2!=0){
                oddCounter++;
            }
        }

        for(int i=0; i<input.length(); i++){
            if (array[i]==' '){
                continue;
            }
        }
        return oddCounter<=1;  // For a palindrome, at most one character can have an odd frequency
    }
}
