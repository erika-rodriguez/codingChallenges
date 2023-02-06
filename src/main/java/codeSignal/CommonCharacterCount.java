package codeSignal;


//10th challenge,level 3
/*
Given two strings, find the number of common characters between them.

Example
For s1 = "aabcc" and s2 = "adcaa", the output should be
solution(s1, s2) = 3.
Strings have 3 common characters - 2 "a"s and 1 "c".*/
public class CommonCharacterCount {
    static int solution(String s1, String s2) {
        int count = 0;

        for (int i = 0; i < s1.length(); i++) {
            if(s2.contains(s1.substring(i, i+1))){
                count++;
                s2=s2.replaceFirst(s1.substring(i, i+1), "0");
            }
        }
        return count;
    }


    /*better solution:
        int solution(String s1, String s2) {
        int counter = 0;
        for(int i = 0; i < s1.length(); i++){
            if(s2.contains(String.valueOf(s1.charAt(i)))){
                counter++;
                s2 = s2.replaceFirst(String.valueOf(s1.charAt(i)), "");
            }
        }
        return counter;
        }*/
}
