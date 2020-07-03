package by.epamtc.task3.main;

public class Task1 {

    public static void main(String[] args) {

        int n = 10;

        int[][] array = new int[n][n];

        for (int i = 0; i < array.length; i++) {

            for (int j = 0; j < array.length; j++) {

                if (j % 2 == 0) {

                    array[i][j] = i + 1;

                } else {

                    array[i][j] = n - i;
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
