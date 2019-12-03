package ru.geekbrains.java_one.lesson_a.online;
//Написать метод, который определяет является ли год високосным. Каждый 4-й год является високосным,
//кроме каждого 100-го, при этом каждый 400-й – високосный. Для проверки работы вывести результаты работы метода в консоль

import java.util.Scanner;

public class LeapYear {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Input a year: ");
        int year = in.nextInt();
        if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) {
            System.out.print("This year Leap");
        } else {
                System.out.print("This year not Leap");
            }
        }
    }

