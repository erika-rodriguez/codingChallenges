package org.example;
/*Given an array of integers, find the pair of adjacent elements
        that has the largest product and return that product.*/
public class LargestProduct {
    public int solution(int[] inputArray) {
        int major=inputArray[0]*inputArray[1];

        for (int i = 0; i < inputArray.length-1; i++) {
            int num1=inputArray[i];
            int num2=inputArray[i+1];
            int multiplication=num1*num2;

            if(multiplication>major){
                major=multiplication;
            }
        }
        return major;
    }
}
