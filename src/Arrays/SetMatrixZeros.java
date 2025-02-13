package Arrays;

import java.security.KeyStore;
import java.util.HashMap;
import java.util.Map;

//if element in matrix is 0 then you will have to set its entire column and row to 0
//and then return the matrix
public class SetMatrixZeros {

    public static void main(String[] args) {
        int[][] matrix = {
                {1, 1, 1},
                {1, 0, 1},
                {1, 1, 1}
        };
//        int[][] matrix = {
//                {0,1,2,0},
//                {3,4,5,2},
//                {1,3,1,5}
//        };
        System.out.println(matrix.length);
        System.out.println(matrix);
        var map = new HashMap<Integer,Integer>();
        for (int row = 0; row < matrix.length; row++) {
            for (int col = 0; col < matrix[row].length; col++) {
                if (matrix[row][col] == 0){
                    map.put(row,col);
//                    setValuesZero(matrix, row, col);
                }
            }
        }
        System.out.println(map);
        for (Map.Entry entry : map.entrySet()){
            setValuesZero(matrix,(Integer) entry.getKey(),(Integer) entry.getValue());
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

    private static void setValuesZero(int[][] matrix, int row, int col) {
        for (int i = 0; i < matrix[row].length; i++) {
            matrix[row][i] = 0;
        }
        for (int j = 0; j < matrix.length; j++) {
            matrix[j][col] = 0;
        }
    }
}
