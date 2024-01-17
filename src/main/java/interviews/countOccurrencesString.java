package interviews;

import java.util.HashMap;
import java.util.Map;

//You are given a sentence and your task is to count and print the number of occurrences of each word.
/*
Example: "This this is is a test for me me"
Expected output:
this: 2
is:2
a:1
test:1
for:1
me:2

 */
public class countOccurrencesString {
    public static void main(String[] args) {
        solution("This this is is a test for me me");
    }

    public static void solution(String input){
        String[] array=input.toLowerCase().split(" ");

        HashMap<String, Integer> map=new HashMap<>();

        for(String e:array){
            if(map.containsKey(e)){
                map.put(e,map.get(e)+1);
            }else{
                map.put(e,1);
            }
        }

        for(Map.Entry entry:map.entrySet()){
            System.out.println("key: "+entry.getKey()+" value: "+entry.getValue());
        }
    }
}

