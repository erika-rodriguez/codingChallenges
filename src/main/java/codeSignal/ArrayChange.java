package codeSignal;

import java.util.Arrays;

/*
17th challenge, level 4
You are given an array of integers. On each move you are allowed to increase exactly one of its element by one.
Find the minimal number of moves required to obtain a strictly increasing sequence from the input.

Example
For inputArray = [1, 1, 1], the output should be
solution(inputArray) = 3. to obtain [1, 2, 3]
Example
For inputArray = [2, 1, 10, 1], the output should be
solution(inputArray) = 12. to obtain [2, 3, 10, 11]


 */
public class ArrayChange {
    public static void main(String[] args) {
        solution(new int[]{2, 1, 10, 1});
    }
    public static int solution(int[] array){
        int moves=0;
        for (int i = 0; i < array.length-1; i++) {
            if(array[i]>=(array[i+1])){ //if not ascendant
                moves+=(array[i]-array[i+1])+1;
                array[i+1]+=(array[i]-array[i+1])+1;
                System.out.println("array: "+Arrays.toString(array));
            }
        }
        System.out.println("moves: "+moves);
        return moves;
    }
}
