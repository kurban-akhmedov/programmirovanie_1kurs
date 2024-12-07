package Laba6;

import java.util.Arrays;
import java.util.Scanner;

public class Laba_1_6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] numbers_input = scanner.nextLine().split(" "); // считываем числа в строку
        int[] numbers = new int[numbers_input.length]; // создаем массив числового типа
        int summa = 0;
        try {
            for (int i = 0; i < numbers.length; i++) {
                numbers[i] = Integer.parseInt(numbers_input[i]); // заполняем массив
                summa += Integer.parseInt(numbers_input[i]);
            }
        } catch (Exception ex) {
            System.out.println("Please, try again");
        }
        int[] numbers_prime = new int[numbers.length]; // массив для хранения нужных чисел
        for (int n = 1; n < numbers.length - 1; n++){
            if (numbers[n] > numbers[n-1] && numbers[n] > numbers[n+1]){
                numbers_prime[n - 1] = numbers[n];
            }
        }
        String final_numbers = Arrays.toString(numbers_prime)
                .replace("[", "")
                .replace(",", "")
                .replace("0", "")
                .replace("]", "");
        System.out.println(Math.abs(summa));
        System.out.println(numbers.length);
        System.out.println(final_numbers);

    }
}