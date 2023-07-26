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
       System.out.println(solutionWithStack("[{("));
        //System.out.println(isValidParentheses("[(])"));
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
/*
In this solution, the isValidParentheses function takes a string s as input and iterates over each character in the string.
If the character is an opening parenthesis ('('), it is pushed onto the stack.
If the character is a closing parenthesis (')'), it checks if the stack is empty or if the top of the stack contains a corresponding opening parenthesis.
If not, the parentheses order is invalid, and the function returns false. If the closing parenthesis matches with the opening parenthesis, it is popped from the stack.

Finally, the function checks if the stack is empty after processing all characters. If the stack is empty, it means that all parentheses had proper opening and closing pairs, and the function returns true. Otherwise, it returns false.

You can call the isValidParentheses function with your parentheses strings to check if the order of parentheses is valid or not.
 */
    public static boolean isValidParentheses(String s) {
        Stack<Character> stack = new Stack<>();

        for (char ch : s.toCharArray()) {
            if (ch == '(') {
                stack.push(ch);
            } else if (ch == ')') {
                if (stack.isEmpty() || stack.peek() != '(') {
                    return false;
                }
                stack.pop();
            }
        }

        return stack.isEmpty();
    }
}
