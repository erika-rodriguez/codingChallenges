package codeSignal;
/*
21st challenge, level 5
An IP address is a numerical label assigned to each device (e.g., computer, printer) participating in a computer network that uses the Internet Protocol for communication. There are two versions of the Internet protocol, and thus two versions of addresses. One of them is the IPv4 address.

Given a string, find out if it satisfies the IPv4 address naming rules.

Example
For inputString = "172.16.254.1", the output should be
solution(inputString) = true;

For inputString = "172.316.254.1", the output should be
solution(inputString) = false.
316 is not in range [0, 255].

For inputString = ".254.255.0", the output should be
solution(inputString) = false.
There is no first number.
 */

import java.util.Arrays;

public class IsIPv4Address {
    public static void main(String[] args) {
        System.out.println(solution("172.16.254.1"));;
    }

    public static boolean solution(String ip){
        String[] array= ip.split("\\.");
        if (array.length!=4){
            return false;
        }
        System.out.println(Arrays.toString(array));
        try{
            for (int i = 0; i < array.length; i++) {
                if(array[i]==""||Integer.parseInt(array[i])<0 || Integer.parseInt(array[i])>255||(array[i].length() > 1 && array[i].charAt(0) == '0')){
                    return false;
                }
            }

        }catch (NumberFormatException ex){
            return false;
        }
        return true;
    }
}
/*Solution using regular expressions
In this code, we define a regular expression pattern ipv4Pattern that matches valid IPv4 addresses.
The pattern checks for four groups of digits separated by periods, with each group ranging from 0 to 255.
The Pattern and Matcher classes from the java.util.regex package are used to apply the regular expression
and check if the input string matches the pattern. If it matches, the string is considered a valid IPv4 address.

public static boolean isValidIPv4(String input) {
        if (input == null || input.isEmpty()) {
            return false;
        }

        // Define the IPv4 regex pattern
        String ipv4Pattern = "^(25[0-5]|2[0-4][0-9]|[01]?[0-9][0-9]?)\\." +
                             "(25[0-5]|2[0-4][0-9]|[01]?[0-9][0-9]?)\\." +
                             "(25[0-5]|2[0-4][0-9]|[01]?[0-9][0-9]?)\\." +
                             "(25[0-5]|2[0-4][0-9]|[01]?[0-9][0-9]?)$";

        // Create a Pattern object
        Pattern pattern = Pattern.compile(ipv4Pattern);

        // Create a Matcher object
        Matcher matcher = pattern.matcher(input);

        // Check if the input matches the pattern
        return matcher.matches();
    }
 */
