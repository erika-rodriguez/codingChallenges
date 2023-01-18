package mouredev;

public class Challenge3 {
/*    Reto #3
¿ES UN NÚMERO PRIMO?
Dificultad: MEDIA
Enunciado: Escribe un programa que se encargue de comprobar si un número es o no primo.
Hecho esto, imprime los números primos entre 1 y 100.*/
    public boolean numeroPrimo(int n){
        if (n==0|n==1|n==4 ){//el 0,1,4 no son primos
            return false;
        }
        for (int i = 2; i < n/2; i++) {
            if (n%i==0){//si es divisible por cualquier numero entre i=2 su mitad, no es primo
                return false;
            }
        }
        return true;
    }

    public void printPrimos(){
        for (int i = 0; i < 100; i++) {
            if (numeroPrimo(i)){
                System.out.println(i);
            }
        }
    }
}
