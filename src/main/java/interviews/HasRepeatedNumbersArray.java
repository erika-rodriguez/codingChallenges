package interviews;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

/*consigna:
dado un array con numeros, hay que decir si hay o no repetidos
solucion:
con hashset
time complexity: n

se escribe todo a mano (clase, metodo, librerias, el main method, aunque tenés autocompletado porque es codesignal)
        */
public class HasRepeatedNumbersArray {
    public static void main(String[] args) {
        int[] a={9,8,1, 11, 2, 8};
        solution(a);
        functionalSolution(a);
    }
     public static boolean solution(int[] a){
         List numbersList= Arrays.asList(a);
         HashSet<Integer> notRepeated=new HashSet<Integer>(numbersList);
         if (a.length==notRepeated.size()){
             return false;
         }
         return true;
     }

    public static boolean solutionWithSet(int[] a){
        HashSet<Integer> set= new HashSet<>();
        for(int e:a){ //fills the set
            if(set.contains(e)){
                return true;//has repeated numbers
            }
            else{
                set.add(e);
            }
        }

        return false;

    }

     public static boolean functionalSolution(int[] a){
        //List<Integer> list=Arrays.asList(a);
        Set<Integer> noRepeated= Arrays.stream(a).boxed().collect(Collectors.toSet());
        if (a.length==noRepeated.size()){
            return false;
        }
        return true;
     }


}
