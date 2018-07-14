package lesson_3.homework_3;
import java.util.Scanner;

public class Task_3_1_1 {

    public static void main(String[] args) {

        //вводим числа
        Scanner sc= new Scanner(System.in);
        System.out.print("Введите число №1:");
        double num1=sc.nextDouble();
        System.out.print("Введите число №2:");
        double num2=sc.nextDouble();
        System.out.print("Введите число №3:");
        double num3=sc.nextDouble();
        System.out.print("Введите число №4:");
        double  num4=sc.nextDouble();
        // находим максимальное
        double max;
        max=num1;
        if(max<num2)max=num2;
        if (max<num3) max=num3;
        if (max<num4) max=num4;
        // вывод значения
        System.out.println("Max="+max);
    }

}
