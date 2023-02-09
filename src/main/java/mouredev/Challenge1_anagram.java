package mouredev;

public class Challenge1_anagram {
    /*Reto #1
¿ES UN ANAGRAMA?
Dificultad: MEDIA
Enunciado: Escribe una función que reciba dos palabras (String) y retorne verdadero o falso (Boolean) según sean o no anagramas.
Un Anagrama consiste en formar una palabra reordenando TODAS las letras de otra palabra inicial.
NO hace falta comprobar que ambas palabras existan.
Dos palabras exactamente iguales no son anagrama.*/
    public static boolean isAnagram(String word1, String word2){
        boolean isAnagram=false;
        if (word1.length()!=word2.length()){
            isAnagram=false;
        } else if (word1.equals(word2)) {
            isAnagram=false;
        } else {
            for (int i = 0; i < word1.length(); i++) {
                if (word2.contains(word1.substring(i))){
                    isAnagram=true;
                }else {
                    isAnagram=false;
                }
            }
        }
        return isAnagram;
    }
}
