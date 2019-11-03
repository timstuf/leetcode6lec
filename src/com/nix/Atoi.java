package com.nix;

public class Atoi {
    public int myAtoi(String str) {
        int length = str.length();
        int result = 0;
        boolean wasANumber = false, isPositive = true, isBigger = false;
        if (str.charAt(0) != ' ' && str.charAt(0) != '+' && str.charAt(0) != '-' && !Character.isDigit(str.charAt(0)))
            return 0;
        for (int i = 0; i < length; i++) {
            int character = str.charAt(i);
            if (!wasANumber) {
                if (character == ' ') continue;
                else if (character == '+') {
                    wasANumber = true;
                    isPositive = true;
                    continue;
                } else if (character == '-') {
                    wasANumber = true;
                    isPositive = false;
                    continue;
                } else if (Character.isDigit(character)) {
                    wasANumber = true;
                    int digit = Character.getNumericValue(character);
                    result += digit;
                    continue;
                } else break;
            } else {
                if (!Character.isDigit(character)) break;
                else {
                    int digit = Character.getNumericValue(character);
                    if (result > (Integer.MAX_VALUE - digit) / 10) {
                        isBigger = true;
                        break;
                    }
                    result *= 10;
                    result += digit;
                }
            }
        }
        if (isBigger && isPositive) return Integer.MAX_VALUE;
        if (isBigger && !isPositive) return Integer.MIN_VALUE;
        if (!isPositive) result *= -1;
        return result;
    }
}
