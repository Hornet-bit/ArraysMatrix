package by.epamtc.task3.main;

public class Task2 {
    public static void main(String[] args) {
        int n = 4;
        int[][] array = new int [n][n];

        for (int i = 0; i < array.length; i++) {

            for (int j = 0; j < array.length; j++) {
                if (i == j){
                    array[i][j] = (i+1)*(i+2);
                }
            }
        }


        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length; j++) {
                System.out.print(array[j][i] + " ");
            }
            System.out.println();
        }
    }
}
