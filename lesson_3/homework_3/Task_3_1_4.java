package lesson_3.homework_3;
import  java.util.Scanner;
public class Task_3_1_4 {
    public static void main(String[] args) {
        //ввод сторон
        Scanner sc = new Scanner(System.in);

        System.out.print("a=");
        double a=sc.nextDouble();
        System.out.print("b=");
        double b=sc.nextDouble();
        System.out.print("c=");
        double c=sc.nextDouble();

        //находим значение максимальной стороны
        double max;
        max=a;
        if(b>max) max=b;
        if (c>max) max=c;

        //полупериметр должен быть больше максимальной стороны
        double p=(a+b+c)/2;
        if(p>max) System.out.println("Треугольник существует");
        else System.out.println("Треугольник не существует");
    }
}
