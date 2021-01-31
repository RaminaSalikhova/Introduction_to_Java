//2. Вычислить значение выражения по формуле (все переменные принимают действительные значения):((b+(b^2+4*a*c)^(1/2))/2*a -a^3*c+b^(-2)
package SecondTask.src;

import java.util.Scanner;


public class Main {
    public static void main (String args[]){
        int exit=1;
        while(exit!=0) {
            System.out.println("Hi, stranger!");
            System.out.println("Выражение: ((b+(b^2+4*a*c)^(1/2))/2*a -a^3*c+b^(-2)");
            Scanner in = new Scanner(System.in);
            System.out.println("Введите переменную a");
            double a = in.nextDouble();
            System.out.println("Введите переменную b");
            double b = in.nextDouble();
            System.out.println("Введите переменную c");
            double c = in.nextDouble();
            System.out.printf("Выражение равно: %.5f \n", ((b + (Math.sqrt(Math.pow(b, 2) + (4 * a * c)))) / (2 * a))- Math.pow(a, 3) * c + Math.pow(b, -2));
            System.out.println("Enter 0 to exit");
            exit=in.nextInt();
        }
    }
}
