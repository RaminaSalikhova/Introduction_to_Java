// Дано действительное число R вида nnn.ddd (три цифровых разряда в дробной и целой частях). Поменять местами
//дробную и целую части числа и вывести полученное значение числа.
package FourthTask.src;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Main {
    public static void main (String args[]){
        int exit=1;
        while(exit!=0) {
            System.out.println("Hi, stranger!");
            System.out.println("Число R вида nnn.ddd");
            Scanner in = new Scanner(System.in);
            System.out.println("Введите R");
            double num = in.nextDouble();
            System.out.println(new DecimalFormat( "000.000" ).format((num * 1000) % 1000 + (int) num /1000.0));;
            System.out.println("Enter 0 to exit");
            exit=in.nextInt();
        }
    }
}
