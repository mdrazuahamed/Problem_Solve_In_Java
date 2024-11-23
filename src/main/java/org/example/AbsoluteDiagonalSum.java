package org.example;

public class AbsoluteDiagonalSum {
    public static void main(String[] args) {
        AbsoluteDiagonalSum absSum = new AbsoluteDiagonalSum();
        int[][] matrix = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };
        absSum.findAbsolute(matrix, 3);
    }
    public void findAbsolute(int[][] array, int size) {
        int diagonalSum1 = 0;
        int diagonalSum2 = 0;
        for(int i = 0; i<size; i++){
            for(int j = 0 ; j<size;j++ ) {
                if(i==j)
                    diagonalSum1 += array[i][j];
                if (i == size-j-1) {
                    diagonalSum2 += array[i][j] ;
                    System.out.println(array[i][j]);
                }
            }
        }
        System.out.println("diagonalSum1= "+diagonalSum1);
        System.out.println("diagonalSum2= "+diagonalSum2);
        System.out.println(Math.abs(diagonalSum1-diagonalSum2));
    }
}
