package interviews;

import java.util.HashMap;
import java.util.Map;

//Write a function that takes a string, and prints the position of each character of the string.
public class PositionCounter {
    public static void main(String[] args){
        mysolution("argentina");
    }

    public static void mysolution(String input){
        char[] charArray=input.toCharArray();

        for (int i = 0; i < charArray.length; i++) {
            System.out.println("Character "+charArray[i]+" is in position "+i);
        }
    }

    public static void solution(String input){
        char[] chars=input.toCharArray();
        HashMap<Character, String> map=new HashMap<>();

        for (int i = 0; i < chars.length; i++) {
            if (map.containsKey(chars[i])){
                map.put(chars[i],map.get(chars[i])+" "+i);
            }else{
                map.put(chars[i], String.valueOf(i));
            }
        }
        for (Map.Entry entry: map.entrySet()){
            System.out.println("Character: "+entry.getKey()+" is in position "+entry.getValue());
        }
    }
}
