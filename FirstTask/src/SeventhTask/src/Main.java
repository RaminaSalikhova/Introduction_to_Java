//Даны два угла треугольника (в градусах). Определить, существует ли такой треугольник, и если да, то будет ли
//он прямоугольным.
package SeventhTask.src;

import java.util.Scanner;

public class Main {
    public static void main (String args[]){
        int exit=1;
        while(exit!=0) {
            System.out.println("Hi, stranger!");
            System.out.println("Введите угол 1");
            Scanner in = new Scanner(System.in);
            int corner1=in.nextInt();
            System.out.println("Введите угол 2");
            int corner2=in.nextInt();
            int corner3=180-corner1-corner2;
            if(180-corner1-corner2>0) {
                System.out.println("Такой треугольник существует");
                if(corner1==90 || corner2==90 || corner3==90 ){
                    System.out.println("Труегольник прямоугольный");
                }
            }
            else{
                System.out.println("Такой треугольник не существует");
            }

            System.out.println("Enter 0 to exit");
            exit=in.nextInt();

        }
    }
}
