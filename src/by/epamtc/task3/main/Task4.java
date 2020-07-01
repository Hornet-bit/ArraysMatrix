package by.epamtc.task3.main;

import java.util.Arrays;

public class Task4 {
    public static void main(String[] args) {
        int size = 6;
        int [] array = new int[size];

        for (int i = 0; i < array.length; i++){
            array[i] = i+1;
        }

        System.out.println(Arrays.toString(array));


        int [][] matrix = new int[size][size] ;

        for (int i = 0; i < matrix.length; i++) {

            for (int j = 0; j < matrix.length; j++) {

                matrix[j][i] = (int)Math.pow(array[i], i+1);

            }
        }


        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }
}
