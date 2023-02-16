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
        int[] a={9,8,1, 11, 3, 9, 2, 46, 23, 8, 33};
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

     public static boolean functionalSolution(int[] a){
        Set<Integer> noRepeated= Arrays.stream(a).boxed().collect(Collectors.toSet());
        if (a.length==noRepeated.size()){
            return false;
        }
        return true;
     }


}
