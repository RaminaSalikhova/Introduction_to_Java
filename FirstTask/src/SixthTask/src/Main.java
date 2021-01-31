//Для данной области составить линейную программу, которая печатает true, если точка с координатами (х, у)
//принадлежит закрашенной области, и false — в противном случае:
package SixthTask.src;

import java.util.Scanner;

public class Main {
    public static void main (String args[]){
        int exit=1;
        while(exit!=0) {
            System.out.println("Hi, stranger!");
            System.out.println("Введите координату X");
            Scanner in = new Scanner(System.in);
            float x=in.nextFloat();
            System.out.println("Введите координату Y");
            float y=in.nextFloat();
            boolean check=(y>=0 && y<4 && x<2 && x>-2)||(y<=0 && y>-3 && x<4 && x>-4);

            System.out.println(check);
            System.out.println("Enter 0 to exit");
            exit=in.nextInt();

        }
    }
}
