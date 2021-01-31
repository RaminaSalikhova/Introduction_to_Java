//Вычислить значение функции
package Eleventh.src;

import java.util.Scanner;

public class Main {
    public static void main (String args[]){
        int exit=1;
        while(exit!=0) {

            System.out.println("Hi, stranger!");
            Scanner in = new Scanner(System.in);
            System.out.println("Введите x");
            float x=in.nextInt();
            if(x<=3){
                System.out.println(Math.pow(x,2)-3*x+9);
            }
            if(x>3){
                System.out.println(1/(Math.pow(x,3)+6));
            }
            System.out.println("Enter 0 to exit");
            exit=in.nextInt();

        }
    }
}
