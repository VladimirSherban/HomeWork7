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
        double needToSave = 2_459_000;
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
        int yearCount = 2022;
        int population = 12_000_000;

        while (yearCount < 2032) {
            int fertility = (int) (17 / 1000.0 * population);
            int mortality = (int) (8 / 1000.0 * population);
            population = population + fertility - mortality;
            yearCount++;
        }
        System.out.println("Год " + yearCount + " численность населения состовляет " + population);

    }

    public static void task4() {
        System.out.println("\nЗадача_4");
        int depositAmount = 15_000;
        double monthlyPercentage = 0.07;
        int needToAccumulate = 12_000_000;
        int monthCount = 0;

        while (depositAmount < needToAccumulate) {
            depositAmount = (int) (depositAmount + (depositAmount * monthlyPercentage));
            monthCount++;
            System.out.println("Месяц " + monthCount + " сумма накоплений состовляет: " + depositAmount);
        }
    }

    public static void task5() {
        System.out.println("\nЗадача_5");
        int depositAmount = 15_000;
        double monthlyPercentage = 0.07;
        int needToAccumulate = 12_000_000;
        int monthCount = 0;

        while (depositAmount < needToAccumulate) {
            depositAmount = (int) (depositAmount + (depositAmount * monthlyPercentage));
            monthCount++;
            if (monthCount % 6 == 0) {
                System.out.println("Месяц " + monthCount + " сумма накоплений состовляет: " + depositAmount);
            }
        }
    }

    public static void task6() {
        System.out.println("\nЗадача_6");
        int depositAmount = 15_000;
        double monthlyPercentage = 0.07;
        int monthCount = 0;
        int monthWontToSave = 108;

        while (monthCount < monthWontToSave) {
            depositAmount = (int) (depositAmount + (depositAmount * monthlyPercentage));
            monthCount++;
            if (monthCount % 6 == 0)
                System.out.println("Месяц " + monthCount + " сумма накоплений " + depositAmount);
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