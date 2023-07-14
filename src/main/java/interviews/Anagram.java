package interviews;

import java.util.Arrays;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/*Given 2 Strings, check if they are anagrams of each other. Return a boolean
Un Anagrama consiste en formar una palabra reordenando TODAS las letras de otra palabra inicial.
Dos palabras exactamente iguales no son anagrama*/
public class Anagram {
    public static void main(String[] args) {
        //System.out.println(solution("triangle", "integral"));
        //System.out.println(solutionWithSort("triangle", "integral"));
        System.out.println(solutionWithStream("odofi", "fodoe"));
    }

    public static boolean  solution(String a, String b){
        boolean isAnagram=false;
        if (a.length()!=b.length()){
            return isAnagram;
        } else if (a.equals(b)) {
            return isAnagram;
        }else{
            for (int i = 0; i < a.length(); i++) {

                if (a.contains(b.substring(i))){
                    isAnagram=true;
                }else {
                    isAnagram=false;
                }
            }
        }
        return isAnagram;
    }

    public static boolean  solutionWithSort(String a, String b){
        char[] arrayA=a.toLowerCase().toCharArray();
        char[] arrayB=a.toLowerCase().toCharArray();

        Arrays.sort(arrayA);
        Arrays.sort(arrayB);
        return Arrays.equals(arrayA,arrayB);
    }

    public static boolean solutionWithStream(String word1, String word2){
        return Stream.of(word1.toLowerCase().split("")).sorted().collect(Collectors.joining())
                .equals(Stream.of(word2.toLowerCase().split("")).sorted().collect(Collectors.joining()));
    }
}
