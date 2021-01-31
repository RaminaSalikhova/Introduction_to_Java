// Найти сумму квадратов первых ста чисел.
package FourteenthTask.src;

import java.util.Scanner;

public class Main {
    public static void main (String args[]){
        int exit=1;
        while(exit!=0) {
            System.out.println("Hi, stranger!");
            Scanner in = new Scanner(System.in);
            System.out.println("Введите первое число");
            int startNum=in.nextInt();
            int sum=startNum;
            for(int i=startNum; i<100+startNum;i++){
                sum+=(int) Math.pow(i,2);
            }
            System.out.println(sum);
            System.out.println("Enter 0 to exit");
            exit=in.nextInt();
        }
    }
}
