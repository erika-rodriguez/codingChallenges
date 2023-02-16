package codeSignal;
/*3rd challenge, level 1
Given the string, check if it is a palindrome.

Example
For inputString = "aabaa", the output should be solution(inputString) = true;
For inputString = "abac", the output should be solution(inputString) = false;
For inputString = "a", the output should be solution(inputString) = true.
* */
public class CheckPalindrome {
    boolean solution(String inputString) {
        String inversa="";
        for (int i = inputString.length(); i >0 ; i--) {
            inversa+=inputString.substring(i-1, i);
        }
        if(inputString.equals(inversa)){
            return true;
        }

        return false;
    }

}
