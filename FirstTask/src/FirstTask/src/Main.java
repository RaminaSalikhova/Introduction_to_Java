//Найдите значение функции: z = ( (a – 3 ) * b / 2) + c

package FirstTask.src;

import java.util.Scanner;

public class Main {
    public static void main (String args[]){
        int exit=1;
        while(exit!=0) {
        System.out.println("Выражение: z=((a-3)*b/2)+c");
        Scanner in= new Scanner(System.in);
        System.out.println("Введите переменную a");
        float a=in.nextFloat();
        System.out.println("Введите переменную b");
        float b=in.nextFloat();
        System.out.println("Введите переменную c");
        float c=in.nextFloat();
        if(b==0||a==3){
            System.out.println("Переменная z равна: " +c);
        }
        else{
            System.out.printf("Переменная z равна: %.5f ", ((a - 3) * b / 2) + c);
        }
            System.out.println("Enter 0 to exit");
            exit=in.nextInt();
        }
    }
}
