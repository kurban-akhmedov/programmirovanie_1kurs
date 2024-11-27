package Laba2;

import java.util.Scanner;

public class Laba1_6_final {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int travel_time = scanner.nextInt(); // время в пути
        int numver_of_stops = scanner.nextInt(); // кол-во остановок
        int time_of_stops = scanner.nextInt(); // длительность остановок
        int final_time = travel_time + numver_of_stops * time_of_stops; // время в минутах общее
        int hours = final_time / 60; // кол-во часов
        int minutes = final_time - hours * 60; // кол-во минут
        if (hours >= 10 && minutes >= 10){
            System.out.println(hours + ":" + minutes);
        } else if (hours >= 10 && minutes < 10){
            System.out.println(hours + ":0" + minutes);
        } else if (hours < 10 && minutes >= 10){
            System.out.println("0" + hours + ":" + minutes);
        } else System.out.println("0" + hours + ":0" + minutes);
    }
}