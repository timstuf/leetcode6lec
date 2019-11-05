package com.nix;

public class PairArifm {
    /*Дан массив A(n) (n – четное). Сформировать массив B(m), элементами которого
являются средние арифметические соседних пар рядом стоящих в массиве A чисел. Например, массив A
состоит из элементов 1, 3, 5, -2, 0, 4, 0, 3. Элементами массива B будут 2; 1,5; 2; 1,5 .*/
    public double[] arifm(int[] array)
    {
        double[] result = new double[array.length/2];
        int j = 0;
        for(int i =0; i<array.length/2; i++)
        {
            result[i] = getArifm(array[j++], array[j++]);
        }
        return result;
    }
    public static double getArifm(int first, int second)
    {
        return (first+second)/2.0;
    }
}
