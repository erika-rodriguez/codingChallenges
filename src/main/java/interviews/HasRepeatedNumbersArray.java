package interviews;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;

/*consigna:
dado un array con numeros, hay que decir si hay o no repetidos
solucion:
con hashset
time complexity: n

se escribe todo a mano (clase, metodo, librerias, el main method, aunque tenés autocompletado porque es codesignal)
        */
public class HasRepeatedNumbersArray {
     public static boolean solution(){
         int[] numbers= {9,8,1, 11, 3, 9};
         List numbersList= Arrays.asList(numbers);
         HashSet<Integer> notRepeated=new HashSet<Integer>(numbersList);
         if (numbers.length==notRepeated.size()){
             return false;
         }
         return true;
     }


}
