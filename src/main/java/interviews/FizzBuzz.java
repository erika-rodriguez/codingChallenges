package interviews;
/*
input: array 1, 2, 3, 4, 5.. 99, 100; And int 3, 5
If you can divide a number from array without remain you should replace that number with word
3 - Fizz
5 - Buzz
3 and 5 - FizzBuzz
 */
public class FizzBuzz {
    public static void main(String[] args) {

        //create an array
        int[] array=new int[100];
        for (int i=1; i<101;i++){
            array[i-1]=i;
            //System.out.println(array[i-1]);
        }
        solution(array);
    }

    public static void solution(int[] numbers){
        for(int e:numbers){
            if (e%3==0 && e%5==0){
                System.out.println( "FizzBuzz");
            }else if(e%3==0){
                System.out.println("Fizz");
            } else if (e%5==0) {
                System.out.println("Buzz");

            }else {
                System.out.println(e);
            }
        }
    }
}





