package codeSignal;
/*
13th challenge,level 3
Write a function that reverses characters in (possibly nested) parentheses in the input string.
Input strings will always be well-formed with matching ()s.

For inputString = "(bar)", the output should be
solution(inputString) = "rab";
For inputString = "foo(bar)baz", the output should be
solution(inputString) = "foorabbaz";
For inputString = "foo(bar)baz(blim)", the output should be
solution(inputString) = "foorabbazmilb";
For inputString = "foo(bar(baz))blim", the output should be
solution(inputString) = "foobazrabblim".
Because "foo(bar(baz))blim" becomes "foo(barzab)blim" and then "foobazrabblim".
 */
public class ReverseInParentheses {
    public static void main(String[] args) {
        solution("foo(bar(baz))blim");
    }
    public static void solution(String input){
        while(input.contains("(")){
            int openIndex=input.lastIndexOf('(');
            int closeIndex=input.indexOf(')',openIndex);

            StringBuilder sequenceReverted= new StringBuilder(input.substring(openIndex + 1, closeIndex)).reverse();
            System.out.println(sequenceReverted);

            input=input.replace(input.substring(openIndex,closeIndex+1),sequenceReverted.toString());
            System.out.println(input);
        }
    }

}
