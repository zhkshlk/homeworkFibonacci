package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("введите число: ");
        int textNumber = sc.nextInt();
        for (int i = 1; i <= textNumber; i++) {
            System.out.print(i);
        }
        System.out.println();

        for (int i = 1; i < textNumber; i++) {
            System.out.print(i * i);
        }
        System.out.println();


        for (int i = 0; i < textNumber; i++) {
            System.out.print(fibonacci(i));
        }

    }

    public static int fibonacci (int n) {
        if (n <= 1) {
            return n;
        }
        return fibonacci(n - 1) + fibonacci(n - 2);
    }
}