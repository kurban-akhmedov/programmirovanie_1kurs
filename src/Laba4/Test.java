package Laba4;

import java.util.ArrayList;
import java.util.Scanner;

class PrimeTrue {
    int prime(int number) // метод для проверки числа на простоту
    {
        int pr = 0; // переменная для возврата значения
        int k = 1; // число делителей
        if (number % 2 == 0 && number != 2) pr = 0;
        for (int n = 1; n <= number / 2; n++)
        {
            if (number % n == 0) k++;
        }
        if (k > 2) pr = 0; // 0 если составное
        if (k == 2) pr = 1; // 1 если простое
        return pr;
    }
}

public class Test{
    public static void main(String[] args){
        PrimeTrue prime = new PrimeTrue();
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> numbers = new ArrayList<>(); // массив для хранения всех чисел
        ArrayList<Integer> prime_numbers = new ArrayList<>(); // массив для простых чисел
        ArrayList<Integer> non_prime_numbers = new ArrayList<>(); // массив для составных чисел
        int mean = 0; // среднее арифмитическое составных
        int summa = 0; // сумма простых чисел
        while (true){
            var value = scanner.next();
            if (value.equals("stop")) break;
            int number = Integer.parseInt(value);
            if (number < 2){ System.out.println("invalid"); // можно написать просто < 2 тк мой номер в группе 2
            } else numbers.add(number);
        }
        for (int i:numbers){ // сортируем числа по простым и составным
            if (prime.prime(i) == 1) prime_numbers.add(i);
            if (prime.prime(i) == 0) non_prime_numbers.add(i);
        }
        for (int i:non_prime_numbers){ // сумма составных
            mean +=i;
        }
        for(int i:prime_numbers){ // сумма простых
            summa+=i;
        }
        mean /= non_prime_numbers.size(); // находим среднее
       if (prime_numbers.isEmpty()){
           System.out.println("prime_undefined");
       }else{
           System.out.printf("sum_of_prime_%d \n", summa);
       }
       if (non_prime_numbers.isEmpty()){
           System.out.println("non_prime_undefined");
       }else {
           System.out.printf("non_prime_average_%d", mean);
       }
    }
}