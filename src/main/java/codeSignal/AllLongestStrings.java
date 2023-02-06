package codeSignal;

import java.util.ArrayList;
import java.util.List;

//9th challenge,level 3
public class AllLongestStrings {
    String[] solution(String[] inputArray) {
        int longest = 0;

        //finds the longest string
        for (int i = 0; i < inputArray.length; i++) {
            if (inputArray[i].length() > longest) {
                longest = inputArray[i].length();
            }
        }

        //counts how many longest there are, and add those words into a list
        List<String> words = new ArrayList<>();
        for (int i = 0; i < inputArray.length; i++) {
            if (inputArray[i].length() == longest) {
                words.add(inputArray[i]);
            }
        }

        //turns that list into array
        String[] output = new String[words.size()];
        words.toArray(output);
        return output;
    }
/*    Best solution
    List<String> words = Arrays.stream(inputArray).toList();
    Optional<String> maxLength = words.stream().max(Comparator.comparing(String::length));

    return words.stream().filter(w -> w.length() == maxLength.get().length()).toArray(String[]::new);*/
}

