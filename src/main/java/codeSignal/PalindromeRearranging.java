package codeSignal;

import java.util.LinkedHashMap;

/*
18th challenge, level 4
Given a string, find out if its characters can be rearranged to form a palindrome(A string that doesn't change when reversed, it reads the same backward and forward).

Example
For inputString = "aabb", the output should be
solution(inputString) = true.
We can rearrange "aabb" to make "abba", which is a palindrome.
 */
public class PalindromeRearranging {
    public static void main(String[] args) {
        System.out.println(solution("aabbbc"));
    }
    public static boolean solution(String input) {
        char[] inputArray = input.toCharArray();
        LinkedHashMap<Character, Integer> map = new LinkedHashMap<>();

        //count the frequency of each character in the string
        for (char e:inputArray) {
            map.put(e, map.getOrDefault(e,0)+1);
        }

        //count the number of characters with odd frequency
        int oddCounter=0;
        for (int c : map.values()) {
            if (c % 2 != 0) {//impar
                oddCounter++;
            }
        }

        //for a palindrome, at most one character can have an odd frequency
        return oddCounter<=1;
    }
}

//other solution
//boolean solution(String inputString) {
//    int map = 0;
//    for(int i=0; i<inputString.length(); i++) {
//        map ^= 1 << (inputString.charAt(i) - 'a');
//    }
//    return map == 0 || (map & -map) == map;
//}