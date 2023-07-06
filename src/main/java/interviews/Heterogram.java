package interviews;

import java.util.HashSet;
import java.util.Set;

/*
A string is a Heterogram if no letter of the alphabet occurs more than once in it.
An example of this is given as follows −
String = the big dwarf only jumps
This string is a Heterogram as each alphabet in the string occurred only once.

Write a function that takes a String as parameter, checks if it is Heterogram and returns a boolean
 */
public class Heterogram {
    public static void main(String[] args){
        System.out.println(solution("the big dwarf only jumpss"));
    }
    public static boolean solution(String input){
        char[] charArray=input.replace(" ","").toCharArray();
        Set<Character> setNoRepeat=new HashSet<>();

        //fill the set
        for (int i=0; i< charArray.length;i++){
            setNoRepeat.add(charArray[i]);
        }
        return charArray.length == setNoRepeat.size();
    }
}
