package interviews;
/*
 **
 * // "Hello world" count letters
 * * // h - 1
 * * // e - 1
 * * // l - 3 ...
 */

import java.util.HashMap;
import java.util.Map;

public class CountLetters {
    public static void main(String[] args){
            solution(null);


    }
    public static void solution(String input) {
        try {
            char[] chars = input.replace(" ", "").toCharArray();
            HashMap<Character, Integer> map = new HashMap<>();

            for (char e : chars) {
                if (map.containsKey(e)) {
                    map.put(e, map.get(e) + 1);
                } else {
                    map.put(e, 1);
                }
            }

            for (Map.Entry entry : map.entrySet()) {
                System.out.println("Letter:" + entry.getKey() + " Repeated:" + entry.getValue());
            }
        }catch (NullPointerException ex){
            System.out.println(ex.getMessage());
        }
    }
}
