package codeSignal;
/*
19th challenge, level 5
Call two arms equally strong if the heaviest weights they each are able to lift are equal.
Call two people equally strong if their strongest arms are equally strong (the strongest arm can be both the right and the left), and so are their weakest arms.
Given your and your friend's arms' lifting capabilities find out if you two are equally strong.

Example
For yourLeft = 10, yourRight = 15, friendsLeft = 15, and friendsRight = 10, the output should be
solution(yourLeft, yourRight, friendsLeft, friendsRight) = true;
For yourLeft = 15, yourRight = 10, friendsLeft = 15, and friendsRight = 10, the output should be
solution(yourLeft, yourRight, friendsLeft, friendsRight) = true;
For yourLeft = 15, yourRight = 10, friendsLeft = 15, and friendsRight = 9, the output should be
solution(yourLeft, yourRight, friendsLeft, friendsRight) = false.
 */
public class AreEquallyStrong {
    public static void main(String[] args) {
        System.out.println(solution(15,10,15,9));
    }

    public static boolean solution(int yourLeft, int yourRight, int friendsLeft, int friendsRight) {
        return ((yourLeft==friendsLeft||yourLeft==friendsRight) && (yourRight==friendsLeft||yourRight==friendsRight));
    }
}
