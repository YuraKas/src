package lesson_3.homework_3;
import java.util.Scanner;
public class Task_3_2_4 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        int dig1=num/100_000;
        int dig2=num/10_000%10;
        int dig3=num/1000%10;
        int dig4=num/100%10;
        int dig5=num/10%10;
        int dig6=num%10;
        int num2;
        num2=dig6*100_000+dig5*10_000+dig4*1000+dig3*100+dig2*10+dig1;
        if(num==num2) System.out.println("Данное число палиндром");
        else System.out.println("Данное число не является палиндромом");
    }
}
