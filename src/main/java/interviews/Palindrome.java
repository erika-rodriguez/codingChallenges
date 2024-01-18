package interviews;
/*
A palindrome is a word, phrase, number, or other sequence of characters which reads the same backward or forward.

Given a string , print Yes if it is a palindrome, print No otherwise.
 */
public class Palindrome {
    public static void main(String[] args) {
        System.out.println(solution("Ma dam"));
    }
    public static boolean solution(String input){
        StringBuilder reverse=new StringBuilder(input.replace(" ","").toLowerCase()).reverse();

        return (reverse.toString()).equals(input.replace(" ","").toLowerCase());
    }
}
