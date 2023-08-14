package codeSignal;
/*
20th challenge, level 5
 */
public class ArrayMaximalAdjacentDifference {
    public static void main(String[] args) {
        System.out.println(solution(new int[]{2, 4, 1, 0}));
    }

    public static int solution(int[] numbers){
        int difference=0;
        for (int i = 0; i < numbers.length-1; i++) {
            if (Math.abs(numbers[i]-numbers[i+1])>difference){
                difference=Math.abs(numbers[i]-numbers[i+1]);
            }
        }
        return difference;

        /*OTHER SOLUTION
        int solution(int[] inputArray) {
        int max=0;
        for( int i = 1 ; i < inputArray.length ; i++ ){
        max = Math.max(max,Math.abs(inputArray[i] - inputArray[i-1]));
        }
        return max;
        }
         */
    }
}
