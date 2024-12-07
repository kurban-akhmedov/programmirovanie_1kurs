package Laba5;

public class Laba_1_5 {
    int maximum(String text, int value, int count) {
        if (!text.contains(" ")) { // условие выхода из рекурсии (последний элемент строки)
            try {
                int number = Integer.parseInt(text); // попытка преобразовать в число
                if (number > value) {
                    return 1;
                } else if (number == value) {
                    return count + 1;
                }
            } catch (Exception ex) {
                return count; // если не число то пропускаем
            }
            return count;
        }
        try {
            int number = Integer.parseInt(text.substring(0, text.indexOf(" "))); // обрабатываем первое число в строке
            if (number > value) { // обновляем макс
                value = number;
                count = 1;
            } else if (number == value) { //увеличиваем кол-во макс если число равно макс
                count += 1;
            }
            return maximum(text.substring(text.indexOf(" ") + 1), value, count); // если число меньше макс пропускаем и дем дальше
        } catch (Exception ex) {
            return maximum(text.substring(text.indexOf(" ") + 1), value, count); // если не число то дем дальше
        }
    }
public static void main(String[] args){
        String text = "5 5 5 5 5 13 123 1224 ё2 1213 цйацйу 1000 1000 1000 2 1000 1000";
        Laba_1_5 max = new Laba_1_5();
        System.out.println(max.maximum(text, Integer.MIN_VALUE, 0));
    }
}