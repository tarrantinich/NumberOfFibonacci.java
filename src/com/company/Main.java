package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.println("Задача: вывести N-ое число Фибоначчи");
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите номер N:");
        int number = scanner.nextInt();
        int[] fibonacciNumbers = new int[number + 1];
        fibonacciNumbers[0] = 1;
        fibonacciNumbers[1] = 1;
        for (int i = 2; i < fibonacciNumbers.length; i++) {
            fibonacciNumbers[i] = fibonacciNumbers[i - 1] + fibonacciNumbers[i - 2];
        }
        System.out.println(fibonacciNumbers[number] + " - искомое число");
    }
}