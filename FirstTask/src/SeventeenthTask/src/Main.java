//Вывести на экран соответствий между символами и их численными обозначениями в памяти компьютера
package SeventeenthTask.src;

public class Main {
    public static void main(String[] args) {
        System.out.println("ASCII-table");
        for (int i = 33; i <= 126; i++) {
            System.out.println (i + " " + (char) i );
        }
        System.out.println("UTF-table");
        for (int i = '\u0021'; i <= '\u007E'; i++) {
                System.out.println(i + " " + (char) i );
        }
    }
}

