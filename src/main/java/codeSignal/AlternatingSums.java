package codeSignal;

import java.util.Arrays;

/*
14th challenge, level 4
Several people are standing in a row and need to be divided into two teams.
The first person goes into team 1, the second goes into team 2, the third goes into team 1 again, the fourth into team 2, and so on.
You are given an array of positive integers - the weights of the people.
Return an array of two integers, where the first element is the total weight of team 1,
and the second element is the total weight of team 2 after the division is complete.

Example
For a = [50, 60, 60, 45, 70], the output should be
solution(a) = [180, 105].
 */
public class AlternatingSums {
    public static void main(String[] args) {
        int[] array=new int[] {50, 60, 60, 45, 70};
        for (int i = 0; i < solution(array).length; i++) {
            System.out.println(solution(array)[i]);
        }
    }
    public static int[] solution(int[] numbers){
        int firstTeam=0;
        int secondTeam=0;

        for(int i=0; i< numbers.length; i++){
            if(i%2==0){
                firstTeam+=numbers[i];
            }else{
                secondTeam+=numbers[i];
            }
        }
        return new int[]{firstTeam, secondTeam};
    }
}
