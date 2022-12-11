package com.Skypro;

public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
        task5();
        task6();
        task7();
        task8();
    }

    public static void task1() {
        System.out.println("\nЗадача_1");
        int cashSavings = 15_000;
        double total = 0;
        double percent = 0.01;
        double needToSave = 2_469_000;
        int monthCounter = 0;
        while (total < needToSave) {
            total = (total + cashSavings) * (1 + percent);
            monthCounter++;
        }
        System.out.println("Месяц " + monthCounter + " сумма накоплений равна " + total);
    }

    public static void task2() {
        int a = 1;
        int i = 10;
        System.out.println("\nЗадача_2");
        while (a <= 10) {
            System.out.print(a + " ");
            a++;
        }
        System.out.println();
        for (; i >= 1; ) {
            System.out.print(i + " ");
            i--;
        }
    }

    public static void task3() {
        System.out.println("\nЗадача_3");
        int yearCounter = 2022;
        double population = 12_000_000;
        while (yearCounter < 2032) {
            int fertility = (int) (17 / 1000.0 * population);
            int mortality = (int) (8 / 1000.0 * population);
            population = population + fertility - mortality;
            yearCounter++;
        }
        System.out.println("Год " + yearCounter + " численность населения состовляет " + population);

    }

    public static void task4() {
        System.out.println("\nЗадача_4");
        double depositAmount = 15_000;
        double monthlyPercentage = 0.07;
        int needToAccumulate = 12_000_000;
        int monthCounter = 0;

        while (depositAmount < needToAccumulate) {
            depositAmount = depositAmount + (depositAmount * monthlyPercentage);
            monthCounter++;
            System.out.println("Месяц " + monthCounter + " сумма накоплений состовляет: " + depositAmount);
        }
    }

    public static void task5() {
        System.out.println("\nЗадача_5");
        double depositAmount = 15_000;
        double monthlyPercentage = 0.07;
        int needToAccumulate = 12_000_000;
        int monthCounter = 0;

        while (depositAmount < needToAccumulate) {
            depositAmount = depositAmount + (depositAmount * monthlyPercentage);
            monthCounter++;
            if (monthCounter % 6 == 0)
                System.out.println("Месяц " + monthCounter + " сумма накоплений состовляет: " + depositAmount);
        }
    }

    public static void task6() {
        System.out.println("\nЗадача_6");
        double depositAmount = 15_000;
        double monthlyPercentage = 0.07;
        int monthCounter = 0;
        int monthWontToSave = 108;

        while (monthCounter < monthWontToSave) {
            depositAmount = depositAmount + (depositAmount * monthlyPercentage);
            monthCounter++;
            if (monthCounter % 6 == 0)
                System.out.println("Месяц " + monthCounter + " сумма накоплений " + depositAmount);
        }
    }

    public static void task7() {
        System.out.println("\nЗадача_7");
        int friday = 2;
        int dayInMonth = 31;
        while (friday < dayInMonth) {
            System.out.println("Сегодня пятница " + friday + " число." + " Необхоимо подготовить отчет");
            friday = friday + 7;

        }
    }

    public static void task8() {
        System.out.println("\nЗадача_8");
        int pastYears = 1822;
        int futureYear = 2122;

        while (pastYears < futureYear) {
            if (pastYears % 79 == 0) {
                System.out.println("Год появления кометы " + pastYears);
            }
            pastYears++;
        }
    }
}