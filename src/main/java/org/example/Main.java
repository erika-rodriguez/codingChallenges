package org.example;

public class Main {
    public static void main(String[] args) {
//        fizzBuzz();
//        System.out.println(isAnagram("saco","saco"));
//        fibonacci();
        Challenge6 c6=new Challenge6();
        c6.invertirPalabra("matematicas");

    }
/* Reto #0
EL FAMOSO "FIZZ BUZZ"
Dificultad: FÁCIL
Enunciado: Escribe un programa que muestre por consola (con un print) los números de 1 a 100 (ambos incluidos y con un salto de línea entre cada impresión), sustituyendo los siguientes:
 - Múltiplos de 3 por la palabra "fizz".
 - Múltiplos de 5 por la palabra "buzz".
 - Múltiplos de 3 y de 5 a la vez por la palabra "fizzbuzz".*/
    public static void fizzBuzz(){
        for (int i = 1; i < 101; i++) {
            if (i%3==0 && i%5==0){
                System.out.println("FizzBuzz");
            } else if (i%3==0) {
                System.out.println("Fizz");
                
            } else if (i%5==0) {
                System.out.println("Buzz");
            }else{
                System.out.println(i);
            }
        }
    }

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

/*Reto #2
LA SUCESIÓN DE FIBONACCI
Dificultad: DIFÍCIL
Enunciado: Escribe un programa que imprima los 50 primeros números de la sucesión de Fibonacci empezando en 0.
La serie Fibonacci se compone por una sucesión de números en la que el siguiente siempre es la suma de los dos anteriores.
0, 1, 1, 2, 3, 5, 8, 13...*/
    public static void fibonacci(){
        int num0=0;
        int num1=1;
        int sum=0;

        for (int i = 0; i < 50; i++) {
            System.out.println(sum);
            sum=num0+num1;
            num1=num0;
            num0 = sum;
        }
    }
}