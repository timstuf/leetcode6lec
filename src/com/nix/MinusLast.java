package com.nix;

public class MinusLast {
    /*Пусть дана действительная матрица размером n × m. Требуется преобразовать матрицу:
поэлементно вычесть последнюю строку из всех строк, кроме последней.*/

    public int[][] minusLast(int[][] matrix)
    {
        if(matrix==null) throw new NullPointerException();
        if(matrix.length==0) throw new IllegalStateException();
        if(matrix[0].length==0) throw new IllegalStateException();
        int[][] result = new int[matrix.length][matrix[0].length];
        for(int i =0; i<matrix.length; i++)
        {
            for(int j = 0; j<matrix[0].length; j++)
            {
               if(i==matrix.length-1) result[i][j] = matrix[matrix.length-1][j];
               else result[i][j] = matrix[i][j] - matrix[matrix.length-1][j];
            }
        }
        return result;
    }
}
