//Даны два числа. Определить цифры, входящие в запись как первого так и второго числа
package NineteenthTask.src;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int exit=1;
        while(exit!=0) {
            System.out.println("Hi, stranger!");
            Scanner in = new Scanner(System.in);
            System.out.println("Введите первое число");
            long num1=in.nextLong();
            System.out.println("Введите второе число");
            long num2=in.nextLong();
            long d=0;
            long c=0;
            while(num1>0){
                d=num1%10;
                num1/=10;
                c=num2;
                while (c>0){
                    if(c%10==d){
                        System.out.print(d+" ");
                        break;
                    }
                    c/=10;
                }
            }
            System.out.println("Enter 0 to exit");
            exit=in.nextInt();
        }
    }
}
