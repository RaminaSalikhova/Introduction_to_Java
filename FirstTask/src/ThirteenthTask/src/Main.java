//Вычислить значения функции на отрезке [а,b] c шагом h: y=x,>2 y=-x,x<=2
package ThirteenthTask.src;

import java.util.Scanner;

public class Main {
    public static void main (String args[]){
        int exit=1;
        while(exit!=0) {
            System.out.println("Hi, stranger!");
            Scanner in = new Scanner(System.in);
            System.out.println("Введите число а");
            int a=in.nextInt();
            System.out.println("Введите число b");
            int b=in.nextInt();
            System.out.println("Введите шаг h");
            int h=in.nextInt();
            int y=0;
            while(a<b ){
                if(a>2){
                    y=a;
                    System.out.printf("[%d, %d]", a,y);
                }
                if(a<=2){
                    y=-a;
                    System.out.printf("[%d, %d]", a,y);
                }
                a=a+h;
            }
            System.out.println("Enter 0 to exit");
            exit=in.nextInt();

        }
    }
}
