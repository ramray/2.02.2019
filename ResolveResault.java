package ru.geekbrains.java_one.lesson_a.online;
//Написать метод вычисляющий выражение a * (b + (c / d)) и возвращающий результат с плавающей точкой,
// где a, b, c, d – целочисленные входные параметры этого метода;
public class ResolveResault {
    public static void main (String[] args) {
        int a = 2;
        int b = 3;
        float c = 4f;
        int d = 5;
        System.out.print(a * ( b + (c / d)));
    }

}
