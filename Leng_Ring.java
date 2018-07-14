import java.util.Scanner;
public class Leng_Ring {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Введите радиус:");
        double r=sc.nextDouble();
        double leng=2*(Math.PI)*r;
        System.out.println("Длина окружности="+leng);
    }
}
