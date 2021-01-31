//Заданы размеры А, В прямоугольного отверстия и размеры х, у, z кирпича. Определить, пройдет ли кирпич через
// отверстие
package TenthTask.src;

import java.util.Scanner;

public class Main {
    public static void main (String args[]){
        int exit=1;
        while(exit!=0) {

            System.out.println("Hi, stranger!");
            Scanner in = new Scanner(System.in);
            System.out.println("Введите А");
            float a=in.nextInt();
            System.out.println("Введите B");
            float b=in.nextInt();
            System.out.println("Введите x");
            float x=in.nextInt();
            System.out.println("Введите y");
            float y=in.nextInt();
            System.out.println("Введите z");
            float z=in.nextInt();
            if((a>=x && b>=y) || (a>=x && b>=z)||(a>=y && b>=x)){
                System.out.println("Кирпич влазит в отверстие");
            }
            else {
                System.out.println("Кирпич не влазит в отверстие");
            }
            System.out.println("Enter 0 to exit");
            exit=in.nextInt();

        }
    }
}
