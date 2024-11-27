package Laba3;

import java.util.Scanner;

public class Laba1_6 {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int number;
        int n = 100; // порядковый номер
        do{
            number = in.nextInt();
            if (((number >= 1*n && number <= 5*n) || (number >= 11*n && n<= 15*n))){ // если число попало в один из промежутков
                System.out.println("Correct_number_" + number);
            }else System.out.println("Not_yet");
        }while(!((number >= 1*n && number <= 5*n) || (number >= 11*n && n<= 15*n))); // пока число не попадает в 1 из промежутков


    }
}
// 4 - 5
// 5 - 5