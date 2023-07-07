package interviews;
/**
 * 3. Given this input: "3[asd]" you have to generate an output string:
 * Write a solution for each case
 * # Q1
 * ## input => "3[asd]"  // pass
 * ## output => "asdasdasd"
 * # Q2
 * ## input => "3[a]4[b]"
 * ## output => "aaabbbb"
 * # Q3
 * ## input => "3[a2[b]]"
 * ## interim output => "3[abb]"
 * ## output => "abbabbabb"
 *
 *input=> 3[a2[d]f]f[f]
 */
public class RepeatString {
    public static void main (String[] args){
        System.out.println(solutionQ1("3[asd]"));
    }

    //solution Q1
    public static String solutionQ1(String input){
        char[] charArray=input.toCharArray();
        int openIndex=input.indexOf("[");
        int repeater=Character.getNumericValue(charArray[openIndex-1]);
        int closeIndex=input.indexOf("]");

        String sequence=input.substring(openIndex+1,closeIndex);

        return sequence.repeat(repeater);
    }
}
