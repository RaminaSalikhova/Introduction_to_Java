//Дано натуральное число Т, которое представляет длительность прошедшего времени в секундах. Вывести
//данное значение длительности в часах, минутах и секундах в следующей форме:
//ННч ММмин SSc.
package FifthTask.src;

import java.util.Calendar;
import java.util.Scanner;
import java.util.Date;
import java.text.SimpleDateFormat;

public class Main {
    public static void main (String args[]){
        int exit=1;
        while(exit!=0) {
            System.out.println("Hi, stranger!");
            System.out.println("Введите натуральное число Т");
            Scanner in = new Scanner(System.in);
            int T=in.nextInt();
            while (T>86400){
                T-=86400;
            }
            int hours= T/3600;
            int min=T/60%60;
            int sec=T%60;
            Calendar calendar = new Calendar.Builder().setTimeOfDay(hours, min, sec).build();
            Date date = calendar.getTime();
            SimpleDateFormat dateFormat = new SimpleDateFormat("HH'ч' mm'мин' ss'сек'");
            System.out.println("date: " + dateFormat.format(date));
            System.out.println("Enter 0 to exit");
            exit=in.nextInt();

        }
    }
}
