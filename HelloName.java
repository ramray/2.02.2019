package ru.geekbrains.java_one.lesson_a.online;
//Написать метод, которому в качестве параметра передается строка, обозначающая имя,
// метод должен вернуть приветственное сообщение «Привет, переданное_имя!»; Вывести приветствие в консоль.

import java.util.Scanner;

public class HelloName {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("What's your name? ");
        String name = in.nextLine();
        System.out.print("Hello, " + name);
    }
}