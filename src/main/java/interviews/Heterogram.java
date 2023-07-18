package interviews;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
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

        System.out.println(solution2("tte bii ddd oo jumm"));
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
    public static boolean solution2(String input){
        char[] chars=input.replace(" ","").toCharArray();
        HashMap<Character, Integer> map=new HashMap<>();


        for(char e:chars){
            if(map.containsKey(e)){
                return false;
            }else {
                map.put(e,1);
            }
        }

        for (Map.Entry entry:map.entrySet()) {
            System.out.println("key:"+entry.getKey()+" Value:"+entry.getValue());
        }


        return  true;
    }
}
