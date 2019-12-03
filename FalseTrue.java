package ru.geekbrains.java_one.lesson_a.online;

import java.io.InputStream;
import java.util.Scanner;

//Написать метод, принимающий на вход два целых числа, и проверяющий что их сумма лежит в пределах
// от 10 до 20(включительно), если да – вернуть true, в противном случае – false;
public class FalseTrue {
    public static void main (String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Input a number 1: ");
        int a = in.nextInt();
        System.out.print("Input a number 2: ");
        int b = in.nextInt();
        int c = a + b;

        if (c > 10 && c <= 20){
            System.out.print("True");
        } else {
            System.out.print("False");
        }
        }
    }

