package codeSignal;
/*Ratiorg got statues of different sizes as a present from CodeMaster for his birthday,
each statue having a non-negative integer size. Since he likes to make things perfect,
he wants to arrange them from smallest to largest so that each statue will be bigger than
the previous one exactly by 1.
He may need some additional statues to be able to accomplish that.
Help him figure out the minimum number of additional statues needed.*/

import java.util.Arrays;

public class ArrayConsecutive {
    //1. sort the array
    //2. find the minimum and maximum number
    //3. calculate the difference+1 which equals the expected total numbers
    //4. calculate the missing numbers with the expected amount of numbers and the actual amount
    int solution(int[] statues) {
        Arrays.sort(statues);
        int min=statues[0];
        int max=statues[statues.length-1];
        int diff=max-min+1;
        int missing=diff-statues.length;

        return missing;

        /*another way using functional programming
        Arrays.sort(statues);
        int min=Arrays.stream(statues).max().getAsInt();
        int max=Arrays.stream(statues).min().getAsInt();
        return max-min+1-statues.length;*/
    }
}
