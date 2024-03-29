package codeSignal;

import java.util.Arrays;

/*
16th challenge, level 4
Two arrays are called similar if one can be obtained from another by swapping at most one pair of elements in one of the arrays.
Given two arrays a and b, check whether they are similar.

Example

For a = [1, 2, 3] and b = [1, 2, 3], the output should be
solution(a, b) = true.
The arrays are equal, no need to swap any elements.

For a = [1, 2, 3] and b = [2, 1, 3], the output should be
solution(a, b) = true.
We can obtain b from a by swapping 2 and 1 in b.

For a = [1, 2, 2] and b = [2, 1, 1], the output should be
solution(a, b) = false.
Any swap of any two elements either in a or in b won't make a and b equal.
 */
public class AreSimilar {
    public static void main(String[] args) {
        int[] a=new int[] {832, 998, 148, 570, 533, 561, 894, 147, 455, 279};
        int[] b=new int[] {832, 570, 148, 998, 533, 561, 455, 147, 894, 279};
        System.out.println(solution(a,b));
    }
    public static boolean solution(int[] a, int[] b){
        System.out.println("a: "+Arrays.toString(a));
        System.out.println("b: "+Arrays.toString(b));

        int counter=0;
        for (int i = 0; i < a.length; i++) {
            if (a[i]!=b[i]){
                counter++;
            }
        }
        if (counter>2){
            return false;
        }

        Arrays.sort(a);
        Arrays.sort(b);
        System.out.println("a: "+Arrays.toString(a));
        System.out.println("b: "+Arrays.toString(b));

        return Arrays.equals(a, b);
    }
}
