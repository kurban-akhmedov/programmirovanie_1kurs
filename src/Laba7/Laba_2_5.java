package Laba7;

import java.util.Arrays;
import java.util.Scanner;

public class Laba_2_5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[][] matrix = new int[n][n];
        int green = 0;
        int white;
        int grey;
        int yellow;
        int k = 1;
        int number = 1;
        for (int i = 0; i < n; i++) { // заполнения массива значениями
            for (int j = 0; j < n; j++) {
                matrix[i][j] = k;
                k++;
            }
            k = 1;
            k += number;
            number++;
        }
        for (int i = 0; i < n / 2; i++) {
            for (int j = 0; j < n / 2; j++) {
                green += matrix[i][j];
            }
        }
        white = green * 2;
        grey = green * 2;
        yellow = green * 3;
        System.out.println(green);
        System.out.println(white);
        System.out.println(grey);
        System.out.println(yellow);
    }
}