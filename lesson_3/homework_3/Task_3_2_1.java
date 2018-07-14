package lesson_3.homework_3;
import java.util.Scanner;
public class Task_3_2_1 {
    public static void main(String[] args) {
        //ввод кординат
        int x,y;
        Scanner sc=new Scanner(System.in);
        System.out.print("x="); x=sc.nextInt();
        System.out.print("y="); y=sc.nextInt();

        // Проверка принадлежности
        double r = Math.sqrt(x*x+y*y);
        if(r<=4) System.out.println("Точка принадлежит кругу");
        else System.out.println("Точка не принадлежит кругу");
    }
}
