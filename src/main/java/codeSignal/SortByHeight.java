package codeSignal;

import java.util.ArrayList;
import java.util.List;
/*
12th challenge, level 3
Some people are standing in a row in a park.
There are trees between them which cannot be moved.
Your task is to rearrange the people by their heights in
a non-descending order without moving the trees. People can be very tall!

Example
For a = [-1, 150, 190, 170, -1, -1, 160, 180], the output should be
solution(a) = [-1, 150, 160, 170, -1, -1, 180, 190].
* */
public class SortByHeight {
    public static void main(String[] args) {
        int[] a= {-1, 150, 190, 170, -1, -1, 160, 180};
        solution(a);
    }

    static int[] solution(int[] a) {
        //convert array into list
        List<Integer> original= new ArrayList<>();
        for (Integer e:a
             ) {
            original.add(e);
        }
        System.out.println("original"+original.toString());
        List<Integer> numbers=new ArrayList<>();

        //extract only numbers >0 from the original list into numbersList
        for (int i = 0; i < original.size(); i++) {
            if (original.get(i)>0){
                numbers.add(original.get(i));
            }
        }
        numbers=numbers.stream().sorted().toList();
        System.out.println("ordered numbers"+numbers.toString());

        //inserts the sorted numbers into the original list where get(i)!=-1
        for (int i = 0; i < numbers.size(); i++) {
            if (original.get(i)!=-1){
                    //original.add(original.stream().map(e->e.equals(-1))., numbers.get(i));
            }
        }
        System.out.println("original modified"+original.toString());

        //sort the numbers list
        numbers.stream().sorted().toList();

        return a;
    }
    int[] solved(int[] a) {
    int temp;

        for (int i = 0; i < a.length; i++) {
        for (int j = i + 1; j < a.length; j++) {
            if ((a[i] == - 1) || (a[j] == - 1)) {
                continue;
            }
            if (a[i] > a[j]) {
                temp = a[i];//saves the greater
                a[i] = a[j];//replace it by the lowest
                a[j] = temp;//saves the greater in the second position
            }
        }
    }
        return a;
}
}
