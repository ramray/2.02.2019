package ru.geekbrains.java_one.lesson_a.online;
//Написать метод, которому в качестве параметра передается целое число, метод должен проверить положительное ли число
// передали, или отрицательное. Замечание: ноль считаем положительным числом. Результат работы метода вывести в консоль
import java.util.Scanner;

public class PositivNum {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Input a number: ");
        int a = in.nextInt();
        if (a > 0 || a == 0) {
            System.out.print("Num a positive");
        }  else
            System.out.print("Num a negative");
        }
    }
