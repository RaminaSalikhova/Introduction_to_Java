//Найти max{min(a, b), min(c, d)}.
package EighthTask.src;

import java.util.Scanner;

public class Main {
    public static void main (String args[]){
        int exit=1;
        while(exit!=0) {

            System.out.println("Hi, stranger!");
            Scanner in = new Scanner(System.in);
            System.out.println("Введите а");
            float a=in.nextInt();
            System.out.println("Введите b");
            float b=in.nextInt();
            System.out.println("Введите c");
            float c=in.nextInt();
            System.out.println("Введите d");
            float d=in.nextInt();

            System.out.printf("max{min(a,b), min(c,d)}= %.5f", max(min(a,b),min(c,d)));
            System.out.println("Enter 0 to exit");
            exit=in.nextInt();

        }
    }
   static float max(float a, float b){
        if(b>a){
           return b;
        }
        else{
            return a;
        }
    }
    static float min(float a, float b){
        if(b<a){
            return b;
        }
        else{
            return a;
        }
    }
}


