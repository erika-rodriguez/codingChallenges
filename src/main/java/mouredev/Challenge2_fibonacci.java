package mouredev;

public class Challenge2_fibonacci {
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
