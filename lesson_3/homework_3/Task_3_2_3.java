package lesson_3.homework_3;
import java.util.Scanner;
public class Task_3_2_3 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int num;
        System.out.print("Введите число");
        num=sc.nextInt();
        int dig1=num/1000;
        int dig2=num/100%10;
        int dig3=num/10%10;
        int dig4=num%10;
        if((dig1+dig2)==(dig3+dig4)) System.out.println("Счастливый билет");
        else System.out.println("Несчастливый билет");

    }
}
