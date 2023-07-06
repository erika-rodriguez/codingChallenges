package interviews;
//Write a function that takes a string of parentheses, and determines if the order of the parentheses is valid.
// The function should return true if the string is valid, and false if it's invalid
// // Examples
// // "()"              =>  true
// // ")(()))"          =>  false
// // "("               =>  false
// // "(())((()())())"  =>  true
// ------------------------------------
// []{}() => true
// [({})] => true
// [(]) => false

import java.util.Stack;

public class Parentheses {
    public static void main (String [] args){
        System.out.println(solutionWithStack("[(])"));
    }
    //Using Stack, last in-first out
    public static boolean solutionWithStack(String input){
        Stack<Character> stack= new Stack<>();
        for (char e:input.toCharArray()) {
            if (e=='('||e=='['||e=='{'){ //si hay uno que abre, agregarlo al stack
                stack.push(e);
            } else if (e==')'||e==']'||e=='}') { //si hay uno que cierra pero no habia uno abriendo , retorna falso
                if (stack.isEmpty()){
                    return false;
                }
                char top=stack.pop(); //gets the last one in stack
                if ( (e==')'&& top!='(') || (e==']'&& top!='[') || (e=='}'&& top!='{')){
                    return false;
                }
            }
        }
        return stack.isEmpty();
    }
}
