package Laba1;

import java.util.Scanner;

public class Laba1_6_test {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in); // создаем обьект класса Scanner, входной поток - консоль
        int n = 100; //
        int a = scanner.nextInt(); // считываем число при помощи метода nextInt
        int b = scanner.nextInt();
        double result_1 = (Math.pow(a, 2) + Math.pow(b, 3)) / n; // используем метод pow для возведения в степень
        double result_2 = (n + 2) / (Math.sqrt(a * b)); // методом sqrt извлекаем корень
        double result_final = result_1 - result_2;
       // String result_final_format = String.format("%.2f", result_final); // форматируем результат в виде строки
        double result_final_format = Math.ceil(result_final * 100) / 100;
        System.out.printf("%.2f", result_final_format);



    }
}
