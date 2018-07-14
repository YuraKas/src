package lesson_3.homework_3;
import java.util.Scanner;
public class Task_3_1_3 {
    public static void main(String[] args) {
        // вводим год
        System.out.print("Введите год:");
        Scanner sc = new Scanner(System.in);
        int year=sc.nextInt();
        if(year%400==0) System.out.println(year+" год - высокосный");
        else if ((year%4==0)&&(year%100!=0)) System.out.println(year+" год - высокосный");
        else System.out.println(year+" год - обычный");
    }
}
