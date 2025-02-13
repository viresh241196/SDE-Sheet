package Arrays;

import java.util.Arrays;

public class SetMatrixZeros2 {

    public static void main(String[] args) {
        int[][] matrix = {
                {0, 1, 2, 0},
                {3, 4, 5, 2},
                {1, 3, 1, 5}
        };
        int rows = matrix.length;
        int cols = matrix[0].length;

        boolean[] rowArray = new boolean[rows];
        boolean[] colArray = new boolean[cols];

        for (int row = 0; row < rows; row++) {
            for (int col = 0; col < cols; col++) {
                if (matrix[row][col] == 0) {
                    rowArray[row] = true;
                    colArray[col] = true;
                }
            }
        }
        for (int i = 0; i < rows; i++) {
            if (rowArray[i]) {
                Arrays.fill(matrix[i], 0);
            }
        }
        for (int j = 0; j < cols; j++) {
            if (colArray[j]) {
                for (int z = 0; z < rows; z++) {
                    matrix[z][j] = 0;
                }
            }
        }
        print(matrix);

    }

    private static void print(int[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j]);
            }
            System.out.println("");
        }
    }
}
