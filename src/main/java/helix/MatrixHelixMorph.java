package helix;

import java.util.ArrayList;
import java.util.List;

public class MatrixHelixMorph {

    /**
     * @param inMatrix
     * @return a matrix that is morphed into a helix version of inMatrix
     */
    public static int[][] helix( int[][] inMatrix) {

        int[][] matrix = new int[inMatrix.length][inMatrix.length];

        int topRow = 0;
        int bottomRow = inMatrix.length - 1;
        int left = 0;
        int right = inMatrix.length - 1;
        int count = 1;

        while(left <= right){

            for(int i = left; i <= right; i++){ //goes right
                matrix[topRow][i] = count++;
              //  System.out.println(matrix[topRow][i]);
            }
            topRow++;

            for(int i = topRow; i <= bottomRow; i++){ //goes down
                matrix[i][right] = count++;
              //  System.out.println(matrix[i][right]);
            }
            right--;


            for(int i = right; i >= left; i--){ //goes left
                matrix[bottomRow][i] = count++;
              //  System.out.println(matrix[bottomRow][i]);
            }
            bottomRow--;


            for(int i = bottomRow; i >= topRow; i--){ //goes up
                matrix[i][left] = count++;
              //  System.out.println(matrix[i][left]);
            }
            left++;

            }
        return matrix;
        }
    }
