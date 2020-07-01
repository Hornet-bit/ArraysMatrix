package by.epamtc.task3.main;

import java.util.Arrays;

public class Task6 {
    public static void main(String[] args) {

        int n = 3;

        int[][] matrix = new int[n][n];

        int x = n / 2;
        int y = matrix.length - 1;
        int value = 1;

        while (value != n * n + 1) {
            matrix[(matrix.length - 1) - y][x] = value;
            value++;

            if (x == matrix.length - 1) {
                x = -1;
            }
            if (y >= matrix.length - 1) {
                y = -1;
            }
            y++;
            x++;
            if (matrix[matrix.length - 1 - y][x] != 0) {
                y--;
            }


        }
        System.out.println(Arrays.deepToString(matrix));

    }
}
