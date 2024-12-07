package Laba6;
import java.util.Arrays;
import java.util.Scanner;

public class Laba_2_6
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        String[] one = scanner.nextLine().split(" "); // первый массив
        String[] two = scanner.nextLine().split(" "); // второй массив
        int lenght = one.length + two.length; // длина двух массивов
        String[] str = new String[lenght]; // сумма двух массивов для перебора
        String[] uniq = new String[lenght];
        for (int i = 0; i < one.length; i++) str[i] = one[i];
        for (int i = one.length; i < one.length + two.length; i++) str[i] = two[i - one.length]; // в первых двух циклах заполняем массив
        for (int i = 0; i < str.length - 1; i++){ // сортируем массив пузырьком
            for (int j = 0; j < str.length - 1; j++){
                if (str[j].length() > str[j+1].length()){
                    String temp = str[j];
                    str[j] = str[j + 1];
                    str[j + 1] = temp;
                }
            }
        }
        for (int i = 1; i < str.length; i++){ // заменяем повторы на zero
            if (str[i - 1].equals(str[i])){
                uniq[i - 1] = "zero";
            }else{
                uniq[i - 1] = str[i - 1];
            }
        }
        uniq[uniq.length - 1] = str[str.length - 1];
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < uniq.length; i++){ // убираем zero
            if (uniq[i].equals("zero")) continue;
            result.append(uniq[i]);
            result.append(" ");
        }
        System.out.println(result);
    }
}
