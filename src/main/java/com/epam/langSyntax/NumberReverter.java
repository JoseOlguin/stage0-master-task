package com.epam.langSyntax;

public class NumberReverter {
    public void revert(int number) {
        int u = (number % 10) * 100;
        int d = ((number / 10) % 10) * 10;
        int c = number / 100;
        System.out.println(u + d + c);
    }
}
