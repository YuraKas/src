package lesson_3;
import java.util.Scanner;

public class Task_3 {
    public static void main(String[] args) {
        int a=14,b=140, c=14;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a"); a=sc.nextInt();
        b=sc.nextInt();
        c=sc.nextInt();

//        if(a<b)a=b;
//        else if(a<c) a=c;
//        System.out.println(a);
        switch (a){
            case 1:
                System.out.println(1);
                break;
            case 2:
                System.out.println(2);
                break;
            case 3:
            case 4:
                default:
                    System.out.println("not 1, not 2");

        }
    }
}
