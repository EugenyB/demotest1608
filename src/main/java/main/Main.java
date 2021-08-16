package main;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

    }

    public int sum(int[] a) {
        return Arrays.stream(a).sum();
    }

    public int gcd(int a, int b) {
        while (a != b) {
            if (a > b) a -= b;
            else b -= a;
        }
        return a;
    }
}
