package com.epam.langSyntax;

public class DigitsSumCalculator {
    public void calculateSum(int number) {
        int acc = number % 10;
        number /= 10;
        acc += number % 10;
        number /= 10;
        acc += number % 10;
        number /= 10;
        acc += number;
        System.out.println(acc);
    }
}
