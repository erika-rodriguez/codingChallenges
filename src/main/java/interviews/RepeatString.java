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
 *# Q4
 *## input=> 3[a2[d]f]f[f]
 *## interim output => 3[addf]f[f]
 * ## output => addfaddfaddfff
 */
public class RepeatString {
    public static void main (String[] args){
        solutionQ4("3[a2[d]f]f[f]");
    }

    //solution Q1
    public static String solutionQ1(String input){
        char[] charArray=input.toCharArray();
        int openIndex=input.indexOf("[");
        int repeater=Character.getNumericValue(charArray[openIndex-1]);
        int closeIndex=input.indexOf("]");

        String sequenceToRepeat=input.substring(openIndex+1,closeIndex);

        return sequenceToRepeat.repeat(repeater);
    }

    //solution Q2
    public static void solutionQ2(String input){
        while (input.contains("[")){
            int openIndex=input.indexOf("[");
            int closeIndex=input.indexOf("]");
            int repeater=Character.getNumericValue(input.charAt(openIndex-1));

            String sequenceToRepeat=input.substring(openIndex+1,closeIndex);
            input=input.replace(input.substring(openIndex-1,closeIndex+1),sequenceToRepeat.repeat(repeater));
        }
        System.out.println(input);
    }

    //solution Q3
    public static void solutionQ3(String input){

        while(input.contains("[")){
            int openIndex=input.lastIndexOf("[");
            int closeIndex=input.indexOf("]",openIndex);
            int repeater=Character.getNumericValue(input.charAt(openIndex-1));

            String sequenceToRepeat=input.substring(openIndex+1,closeIndex);

            //replace the sequence to repeat by the solved string
            input=input.replace(input.substring(openIndex-1,closeIndex+1),sequenceToRepeat.repeat(repeater));

            System.out.println(input);
        }
    }

    //solution Q4
    public static void solutionQ4(String input){
        //3[a2[d]f]f[f]
        while (input.contains("[")){
            int openIndex=input.lastIndexOf("[");
            int closeIndex=input.indexOf("]",openIndex);//Returns the index within this string of the first occurrence of the specified substring, starting at the specified index.
            try{
                int repeater=  Integer.parseInt(input,openIndex-1);
                System.out.println("repeater"+repeater);
                String sequence=input.substring(openIndex+1,closeIndex);

                input=input.replace(input.substring(openIndex-1,closeIndex+1), sequence.repeat(repeater));

                System.out.println(input);

            }catch(NumberFormatException e){
                continue;
            }




        }
    }

}
