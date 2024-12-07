package Laba7;

import java.util.Scanner;

public class Laba_1_5 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int R = scanner.nextInt();
        int C = scanner.nextInt();
        int k = 2; // порядковый номер
        int[][] matrix = new int[R][C]; // создаем матрицу R * C
        for (int i = C - 1; i > -1; i--){ // столбцы
            if (Math.abs(C - i - 1) % 2 == 0){ //условие для стоблцрвчтобы змейка выполнялась
                for (int j = R - 1; j > -1; j--){ // строки, если столбец четный
                    matrix[j][i] = k;
                    k++;
                }
            }else{
                for (int j = 0; j < R; j++){ // строки, если столбец нечетный
                    matrix[j][i] = k;
                    k++;
                }
            }
        }
        for (int i = 0; i < R; i++) { // вывод
            for (int j = 0; j < C; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }
}
