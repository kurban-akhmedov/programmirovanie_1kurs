package Laba1;

import java.util.Scanner;

public class Laba1_6 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in); // создаем обьект класса Scanner, входной поток - консоль
        int n = 2; //
        int a = scanner.nextInt(); // считываем число при помощи метода nextInt
        int b = scanner.nextInt();
        double result_1 = (Math.pow(a, 2) + Math.pow(b, 3)) / n; // используем метод pow для возведения в степень
        double result_2 = (n + 2) / (Math.sqrt(a * b)); // методом sqrt извлекаем корень
        double result_final = result_1 - result_2;
        String result_final_format = String.format("%.2f", result_final); // форматируем результат в виде строки
        System.out.printf(result_final_format);


    }
}
