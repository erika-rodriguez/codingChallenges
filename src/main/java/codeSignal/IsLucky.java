package codeSignal;

//11th challenge,level 3
/*Ticket numbers usually consist of an even number of digits.
A ticket number is considered lucky if the sum of the first half of the digits is equal
to the sum of the second half.
Given a ticket number n, determine if it's lucky or not.

Example:
For n = 1230, the output should be
solution(n) = true;
For n = 239017, the output should be
solution(n) = false.*/
public class IsLucky {
    public static void main(String[] args) {
        solution(134008);
        solution(1280);
    }
    static boolean solution(int n) {
        //convert int to string
        String number= String.valueOf(n);

        //split the string in two
        String firstHalf=number.substring(0,number.length()/2);
        String lastHalf=number.substring(number.length()/2,number.length());

        //accumulates the sum of the substrings, converting them to Integer
        int sumFirstHalf=0;
        int sumLastHalf=0;

        for (int i = 0; i < lastHalf.length(); i++) {
            sumFirstHalf+=Integer.valueOf(firstHalf.substring(i,i+1));
            sumLastHalf+=Integer.valueOf(lastHalf.substring(i,i+1));
        }

        if (sumFirstHalf==sumLastHalf){
            System.out.println("is lucky");
            return true;
        }

        return false;

    }

    /*Best solution
    boolean solution(int n) {

        String strNumber = String.valueOf(n);
        int counter = 0;

        for (int i = 0; i < strNumber.length(); i++) {

            if (i > ((strNumber.length() / 2) - 1)) {
                counter -= strNumber.charAt(i);
            } else {
                counter += strNumber.charAt(i);
            }
        }
        return counter == 0;
    }*/
}
