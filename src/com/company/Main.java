package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.println("Задача: вывести N-ое число Фибоначчи");
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите номер N:");
        int number = scanner.nextInt();
        int n1 = 0;
        int n2 = 1;
            for (int i = 2; i <= number; ++i) {
                n2 = n2 + n1;
                n1 = n2 - n1;
            }
        System.out.print(n1 + " - искомое число");
        }

    }
