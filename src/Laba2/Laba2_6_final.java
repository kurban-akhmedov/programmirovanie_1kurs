package Laba2;

import java.util.Scanner;

public class Laba2_6_final {
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        String fruit = scanner.nextLine();
        String month = scanner.nextLine(); // ввод месяца
        double weight = scanner.nextDouble(); // ввод веса
        double price = 0; // инициализируем перемену для цены
        int n = 100; // порядковый номер
        double final_price; // итоговая выводимая цена

        boolean flag_fruit = true;
        boolean flag_month = true; // создаем флаги для вывода INVALID

        switch (fruit)
        {
            case "apple": price = 9.99 * n; break;
            case "plum": price = 10.98 * n; break;
            case "banana": price = 11.49 * n; break;
            case "grapes": price = 15.99 * n; break;
            case "orange": price = 17.99 * n; break;
            case "kiwi": price = 37.99 * n; break;
            case "mango": price = 39.99 * n; break;
            default: flag_fruit = false;
        }

        switch (month)
        {
            case "january": break;
            case "february": break;
            case "march": break;
            case "april": break;
            case "may": break;
            case "june":
                if (fruit.equals("apple")) price *= 1.11;
                if (fruit.equals("plum")) price *= 1.11;
                break;
            case "july":
                if (fruit.equals("apple")) price *= 1.11;
                if (fruit.equals("plum")) price *= 1.11;
                break;
            case "august":
                if (fruit.equals("apple")) price *= 1.11;
                if (fruit.equals("plum")) price *= 1.11;
                break;
            case "september": break;
            case "october": break;
            case "november": break;
            case "december": break;
            default: flag_month = false;
        }

        if (flag_month == false || flag_fruit == false)
        {
            System.out.println("INVALID");
        }

        final_price = price * weight;

        System.out.printf("%.2f", final_price);

    }
}
