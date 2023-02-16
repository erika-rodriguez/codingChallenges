package interviews;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

/*
* retornar los indices de los numeros que sumados juntos son igual al target

* Write a function that takes an array of numbers (integers for the tests) and a target number.
 * It should find two different items in the array that, when added together, give the target value.
 * The indexes of these items should then be in a tuple / list (depending on your language)
 * like so: (index1, index2).
 * The input will always be valid (numbers will be an array of length 2 or greater, and all of the items will be numbers;
 *  target will always be the sum of two different items from that array).* */
public class TwoSum {
    public static void main(String[] args) {
        int[] a={2,5,9,1, 11, 7, 15};
        solution(a, 20);
        //solutionWithMap(a, 20);
    }

    public static int[]  solution(int[] a, int target){
        List<Integer> list= Arrays.stream(a).boxed().toList();
        //if the  numbers are adjacent
        for (int i = 0; i < list.size()-1; i++) {
            if (target== (list.get(i)+list.get(i+1))){
                int index1=i;
                int index2=i+1;
                System.out.println(index1+" "+index2);
                return new int[]{index1, index2};
            }
        }
        return null;
    }

    public static int[] solutionWithMap(int[] a, int target){
        HashMap<Integer, Integer> map=new HashMap<>();
        for (int i = 0; i < a.length; i++) {
            if (map.containsKey(target-a[i])){//si contiene al otro valor
                return new int[]{
                        map.get(target-a[i]), i };
            }
            map.put(a[i],i);
        }
        return new int[]{};
    }
}
