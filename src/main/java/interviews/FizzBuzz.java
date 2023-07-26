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

        //ArrayList<Integer> array=new ArrayList<>();
        int[] array=new int[101];
        for (int i=0; i<100;i++){
            array[i]=i+1;
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





