//Даны три точки А(х1,у1), В(х2,у2) и С(х3,у3). Определить, будут ли они расположены на одной прямой.
package NinthTask.src;

import java.util.Scanner;

public class Main {
    public static void main (String args[]){
        int exit=1;
        while(exit!=0) {

            System.out.println("Hi, stranger!");
            Scanner in = new Scanner(System.in);
            System.out.println("Введите х1");
            float x1=in.nextInt();
            System.out.println("Введите y1");
            float y1=in.nextInt();
            System.out.println("Введите x2");
            float x2=in.nextInt();
            System.out.println("Введите y2");
            float y2=in.nextInt();
            System.out.println("Введите x3");
            float x3=in.nextInt();
            System.out.println("Введите y3");
            float y3=in.nextInt();
            if((x1-x3)*(y2-y3)-(x2-x3)*(y1-y3)==0){
                System.out.println("Точки лежат на одной прямой");
            }
            else {
                System.out.println("Точки не лежат на одной прямой");
            }

            System.out.println("Enter 0 to exit");
            exit=in.nextInt();

        }
    }
}
