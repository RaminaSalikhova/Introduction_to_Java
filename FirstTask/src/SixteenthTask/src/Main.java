//Даны числовой ряд и некоторое число е. Найти сумму тех членов ряда, модуль которых больше или равен
//заданному е. Общий член ряда имеет вид: a(n)=1/2^n+1/3^n
package SixteenthTask.src;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int exit=1;
        while(exit!=0) {
            System.out.println("Hi, stranger!");
            Scanner in = new Scanner(System.in);
            System.out.println("Введите e");
            double e=in.nextDouble();
            double n=0;
            double an=0;
            double sum=0;
            if(e>0 && e<=1){
                do{
                    an=(1/Math.pow(2,n)+1/Math.pow(3,n));
                    sum+=an;
                    n++;
                }while(Math.abs(an)>=e);
                System.out.println(n);
                System.out.println(sum);
            }
           else {
                System.out.println("Значение е должно быть в диапазоне от 0 до 1");
            }
            System.out.println("Enter 0 to exit");
            exit=in.nextInt();
        }
    }
}
