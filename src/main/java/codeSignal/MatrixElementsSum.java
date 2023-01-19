package codeSignal;


import java.util.ArrayList;
import java.util.List;

/*After becoming famous, the CodeBots decided to move into a new building together.
Each of the rooms has a different cost, and some of them are free, but there's a rumour
that all the free rooms are haunted! Since the CodeBots are quite superstitious,
they refuse to stay in any of the free rooms, or any of the rooms below any of the free rooms.

Given matrix, a rectangular matrix of integers, where each value represents the cost
of the room, your task is to return the total sum of all rooms that are suitable for
the CodeBots (ie: add up all the values that don't appear below a 0).

Example
For
matrix = [[0, 1, 1, 2],
          [0, 5, 0, 0],
          [2, 0, 3, 3]]
        the output should be
        solution(matrix) = 9.*/
public class MatrixElementsSum {

    int solution(int[][] matrix) {
        int sum = 0;
        List<Integer> canceledJ = new ArrayList<Integer>();

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                if (matrix[i][j] == 0 || canceledJ.contains(j)) {//if the element is 0, blocks that column, if it is already blocked then sum+=0
                    canceledJ.add(j);
                } else {
                    sum += matrix[i][j];
                }
            }
        }
        return sum;
    }

    /*Best solution:
    int solution(int[][] matrix) {
    int s = 0;
    for (int c = 0; c < matrix[0].length; ++c)
        for (int r = 0; r < matrix.length; ++r) {
            if (matrix[r][c] > 0)
                s+=matrix[r][c];
            else break;
        }
    return s;
}*/
}
