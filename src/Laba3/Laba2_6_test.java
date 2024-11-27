package Laba3;

import java.util.Arrays;
import java.util.Scanner;
// наименьшее положительное, входные данные 2 -100 99
public class Laba2_6_test {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int number = 0;
        boolean flag = true; // создаем флаг
        int n = in.nextInt(); // вводим длину массива
        int[] array = new int[n]; // создаем массив с длиной n
        for (int i = 0; i < array.length; i++) { // присваиваем элементам массива числа
            array[i] = in.nextInt();
        }
        Arrays.sort(array); // сортируем массив
        for(int i:array){ // проходимся по массиву
            if (i>0){
                flag = false; // если нашли i>0 изменяем флаг
                number = i;
                System.out.println(number); // вывод
                break;// как только нашли первое положительное число выходим из цикла
            }
        }
        if(flag) System.out.println("invalid"); // если флаг не изменялся (i>0 не нашлось)


    }

}
