//Вычислить значение выражения по формуле (все переменные принимают действительные значения): (sin(x)+cos(y))/(cos(x)-sin(y))*tg(x*y)
package ThirdTask.src;

import java.util.Scanner;

public class Main {
    public static void main (String args[]){
        int exit=1;
        while(exit!=0) {
            System.out.println("Hi, stranger!");
            System.out.println("Выражение: (sin(x)+cos(y))/(cos(x)-sin(y))*tg(x*y)");
            Scanner in = new Scanner(System.in);
            System.out.println("Введите переменную x");
            double x = in.nextDouble();
            System.out.println("Введите переменную y");
            double y = in.nextDouble();

            System.out.printf("Выражение равно: %.5f \n", (Math.sin(x)+Math.cos(y))/(Math.cos(x)-Math.sin(y))*Math.tan(x*y));
            System.out.println("Enter 0 to exit");
            exit=in.nextInt();
        }
    }
}
