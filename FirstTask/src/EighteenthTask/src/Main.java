//Для каждого натурального числа в промежутке от m до n вывести все делители, кроме единицы и самого числа.
//m и n вводятся с клавиатуры.
package EighteenthTask.src;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int exit=1;
        while(exit!=0) {
            System.out.println("Hi, stranger!");
            Scanner in = new Scanner(System.in);
            System.out.println("Введите m");
            int m=in.nextInt();
            System.out.println("Введите n");
            int n=in.nextInt();
            while( m<n){
                System.out.print( m +":");
                for(int i=2; i<m-1;i++){
                    if(m%i==0){
                        System.out.print(i +" ");
                    }
                }
                System.out.println();
                m++;
            }
            System.out.println("Enter 0 to exit");
            exit=in.nextInt();
        }
    }
}
