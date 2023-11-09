package org.example;

public class Main {
    public static void main(String[] args) {
        System.out.println("Задача 1");
        int i;
        for (i = 1; i <= 10; i++) {
            System.out.println(i);
        }
        System.out.println("Задача 2");
        for (i = 10; i > 0; i--) {
            System.out.println(i);
        }
        System.out.println("Задача 3");
        for (i = 0; i < 17; i = i + 2) {
            System.out.println(i);
        }
        System.out.println("Задача 4");
        for (i = 10; i >= -10; i--) {
            System.out.println(i);
        }
        System.out.println("Задача 5");
        for (i = 1904; i < 2096; i = i + 4) {
            System.out.println(i + " год является високосным");
        }
        System.out.println("Задача 6");
        for (i = 7; i <= 98; i = i + 7) {
            System.out.println(i);
        }
        System.out.println("Задача 7");
        for (i = 1; i <= 512; i = i * 2) {
            System.out.println(i);
        }
        System.out.println("Задача 8");
        int savings = 0;
        for (i = 1; i < 12; i++) {
            savings = savings + 29000;
            System.out.println("Месяц " + i + " сумма накоплений равна " + savings + " рублей");
        }
        System.out.println("Задача 9");
        float savingsPrecent = 29000;
        float total = 0;
        for (i = 1; i <= 12; i++) {
            savingsPrecent = savingsPrecent + savingsPrecent / 100;
            total = total + savingsPrecent;
            System.out.println("Месяц " + i + " сумма накоплений равна " + savingsPrecent + " рублей");

        }
        System.out.println("Задача 10");
        int result;
        for (i = 1; i <= 10; i++) {
            result = 2 * i;
            System.out.println("2 * " + i + " = " + result);

        }

    }
}




/*








Задача 9
Перепишите решение задачи выше при условии, что деньги вы откладывать будете не «в банку», а в банк под проценты — 12% годовых. Выведите сумму накоплений за каждый месяц в консоль в формате: «Месяц …, сумма накоплений равна … рублей».
 */




