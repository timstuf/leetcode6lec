package com.nix;

import java.util.Arrays;

public class MatchingArrays {
    /*Определить номера тех строк целочисленной матрицы A[N, K], которые совпадают с массивом
D[K]. Если таких строк нет, выдать соответствующее сообщение.*/
    public static int match(int[][] array, int[] match)
    {
        if(array == null || match == null) throw new NullPointerException();
        if(array.length==0 || match.length==0) throw new IllegalStateException();
        int count = 0;
        for(int i = 0; i<array.length; i++)
        {
            if(Arrays.equals(array[i], match)) count++;
        }
        return count;
    }
}
