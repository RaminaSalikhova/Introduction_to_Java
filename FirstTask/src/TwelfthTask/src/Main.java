// Напишите программу, где пользователь вводит любое целое положительное число. А программа суммирует
//все числа от 1 до введенного пользователем числа.
package TwelfthTask.src;

import java.util.Scanner;

public class Main {
    static int result=0;
    public static void main (String args[]){
        int exit=1;
        while(exit!=0) {
            result=0;
            System.out.println("Hi, stranger!");
            Scanner in = new Scanner(System.in);
            System.out.println("Введите x");
            int x=in.nextInt();
            for (int i=1; i<x; i++){
                result+=i;
            }
            System.out.println(result);
            System.out.println("Enter 0 to exit");
            exit=in.nextInt();

        }
    }
}
