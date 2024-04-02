public class Main {
    public static void main(String[] args) {
        //Задача 1
        for (int i = 1; i <= 10; i++) {
            System.out.println(i);
        }
        System.out.println();
        //Задача 2
        for (int i = 10; i >= 1; i--) {
            System.out.println(i);
        }
        System.out.println();
        //Задача 3
        for (int i = 0; i <= 17; i++) {
            if (i % 2 == 1) {
                continue;
            }
            System.out.println(i);
        }
        System.out.println();
        //Задача 4
        for (int i = 10; i >= -10; i--) {
            System.out.println(i);
        }
        //Задача 5
        for (int i = 1904; i <= 2096; i = i + 4) {
            System.out.println(i + " год является високосным");
        }
        System.out.println();
        //Задача 6
        for (int i = 7; i <= 98; i = i + 7) {
            System.out.println(i);
        }
        System.out.println();
        //Задача 7
        for (int i = 1; i <= 512; ) {
            System.out.println(i);
            i = i * 2;
        }
        System.out.println();
        //Задача 8
        int savings = 29000;
        for (int i = 1; i <= 12; i++) {
            System.out.println("Месяц " + i + ", сумма накоплений равна " + savings + " рублей");
            savings = savings + 29000;
        }
        System.out.println();
        //Задача 9
        double depAmount = 29000;
        double sav = 0;
        for (int i = 1; i <= 12; i++) {
            sav = sav + sav / 100;
            sav = sav + depAmount;
            System.out.println("Месяц " + i + ", сумма накоплений равна " + String.format("%.2f", sav) + " рублей");
        }
        System.out.println();
        //Задача 10
        byte multiTable = 2;
        for (int i = 1; i <= 10; i++) {
            byte result = (byte) (multiTable * i);
            System.out.println("2 * " + i + " = " + result);
        }
    }
}