package by.epamtc.task3.main;

import java.util.Arrays;

public class Task5 {
    public static void main(String[] args) {


        int[][] firstMatrix = new int[][] {
                {3, -1, 2},
                {2,  0, 1},
                {1,  2, 1}
        };

        int[][] secondMatrix = new int[][] {
                {2, -1, 1},
                {0, -2, 3},
                {3,  0, 1}
        };

        int [][] resultMatrix = multiplyByMatrix(firstMatrix, secondMatrix);
        System.out.println(Arrays.deepToString(resultMatrix));
    }

    public static int [][] multiplyByMatrix(int[][]m1, int [][]m2){
        int columnM1 = m1[0].length;
        int lineM2 = m2.length;
        if (columnM1 != lineM2){
            System.out.println("Умножение данных матриц невозможно");
        }

        int newMatrixLine = m1.length;
        int newMatrixCol = m2[0].length;

        int[][] matrixResult = new int[newMatrixLine][newMatrixCol];

        for(int i = 0; i < newMatrixLine; i++) {         // строки из м1
            for(int j = 0; j < newMatrixCol; j++) {     // колонки из м2
                for(int k = 0; k < columnM1; k++) { // колонки из м1
                    matrixResult[i][j] += m1[i][k] * m2[k][j];
                }
            }
        }
        return matrixResult;
    }
}
