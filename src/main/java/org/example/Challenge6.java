package org.example;
/*Reto #6
INVIRTIENDO CADENAS
Dificultad: FÁCIL
Enunciado: Crea un programa que invierta el orden de una cadena de texto sin usar funciones propias del lenguaje que lo hagan de forma automática.
- Si le pasamos "Hola mundo" nos retornaría "odnum aloH"*/
public class Challenge6 {

    public void invertirPalabra(String word){
        String invertida="";
        for (int i = word.length(); i >0 ; i--) {
           invertida=invertida+word.substring(i-1,i);
        }
        System.out.println(invertida);
    }

}
