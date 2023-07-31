package codeSignal;
/*
15th challenge, level 4
Given a rectangular matrix of characters, add a border of asterisks(*) to it.

Example
For
picture = ["abc",
           "ded"]
the output should be

solution(picture) = ["*****",
                     "*abc*",
                     "*ded*",
                     "*****"]
 */
public class AddBorder {
    public static void main(String[] args) {
        String[] matrix=new String[]{"abc","def"};
        for (String e:solution(matrix)) {
            System.out.println(e);
        }
    }
    public static String[] solution(String[] matrix){
        String[] asterisks=new String[matrix.length+2];
        int repeater=matrix[0].length()+2;
        
        for (int i = 0; i <asterisks.length; i++) {
            if (i==0 || i== asterisks.length-1){
                asterisks[i]="*".repeat(repeater);
            }else{
                asterisks[i]="*"+matrix[i-1]+"*";
            }
        }
        return  asterisks;
    }
}
