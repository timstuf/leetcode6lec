package com.nix;

public class myPow {
    public double myPow(double x, int n) {
        if (x == 0.0) return x;
        if (n == 0) return 1;
        if (n == 1) return x;
        if(n==-1) return 1.0/x;
        double result = 1.0;
        if (n < 0) {
            x = 1.0/x;
            n*=-1;
        }
        while (n != 0) {

            if (n % 2 == 1) {
                result *= x;
            }
            x *= x;
            n >>>= 1;
        }
        return result;
    }
}
