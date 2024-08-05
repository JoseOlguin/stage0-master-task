package com.epam.loops;

public class HalfPyramid {
    public void printHalfPyramid(int cathetusLength) {
        for (int x = 1; x <= cathetusLength; x++) {
            for (int y = 1; y <= cathetusLength; y++) {
                System.out.print(x + y > cathetusLength ? '*' : ' ');
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        new HalfPyramid().printHalfPyramid(8);
    }
}
