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
        return inputString.equals(inversa);
    }

    public static boolean solutionStringBuilder(String input){
        StringBuilder reverse = new StringBuilder();
        for (int i=input.length();i>0;i--){
            reverse.append(input.charAt(i-1));
            System.out.println(reverse);
        }

        if (input.equals(reverse.toString())){
            return  true;
        }else {
            return false;
        }
    }
}
