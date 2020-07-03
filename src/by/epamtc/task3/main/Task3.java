package by.epamtc.task3.main;

public class Task3 {
    public static void main(String[] args) {

        int n = 10;

        int[][] array = new int[n][n];

        for (int i = 0; i < array.length; i++) {

            for (int j = i; j < array.length - i; j++) {

                array[j][i] = 1;

            }
        }

        for (int i = n - 1; i > n / 2 - 1; i--) {

            for (int j = n - 1 - i; j < array.length - (n - i - 1); j++) {

                array[j][i] = 1;
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
