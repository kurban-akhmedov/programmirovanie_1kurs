package Laba1;


import java.util.Scanner;

public class Laba2_6_final {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in); // созданм обьект класса Scanner и указываем консоль как входной поток
        String str = scanner.nextLine();
        int replace_index = scanner.nextInt(); // считываем индекс заменяемого символа
        scanner.nextLine(); // пропускаем символ перехода строки
        String symbol = scanner.nextLine(); // считываем символ на который будем заменять
        char symbol_replace = symbol.charAt(0);
        char replace_index_final = str.charAt(replace_index); // получаем заменяемый символ

       // String replace_symbol_final = "" + replace_index_final; // преобразуем символ в строку
        String strNew = str.replace(replace_index_final, symbol_replace).toUpperCase(); // окончательно преобразуем строку
        System.out.println(strNew);
    }
}
