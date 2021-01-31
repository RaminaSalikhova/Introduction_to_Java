//Составить программу нахождения произведения квадратов первых двухсот чисел.
package FifteenthTask.src;

import java.math.BigInteger;
import java.util.Scanner;

public class Main {
    public static void main (String args[]){
        int exit=1;
        while(exit!=0) {
            System.out.println("Hi, stranger!");
            Scanner in = new Scanner(System.in);
            System.out.println("Введите первое число");
            int startNum=in.nextInt();
            BigInteger sum=BigInteger.valueOf(startNum);
            for(int i=startNum; i<200+startNum;i++){
                sum = sum.multiply(BigInteger.valueOf(i*i));
            }

            System.out.println(sum);
            System.out.println("Enter 0 to exit");
            exit=in.nextInt();
        }
    }
}
