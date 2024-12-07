package Laba4;

import java.util.Scanner;

public class Ipoteka {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        String percent = scanner.nextLine();
        double perc = Double.parseDouble(percent.replaceAll("%", ""))/100 + 1;
        int ipoteka = scanner.nextInt();
        double summa = ipoteka * perc;
        while (summa > 0){
            int platej = scanner.nextInt();
            summa -= platej;
        }
    }

}
