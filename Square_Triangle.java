import java.util.Scanner;
public class Square_Triangle {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        // Ввод сторон
        double a, b, c;
        System.out.println("Введите сторону a:");
        a=sc.nextDouble();
        System.out.println("Введите сторону b:");
        b=sc.nextDouble();
        System.out.println("Введите сторону c:");
        c=sc.nextDouble();
        //Вычисление площади
        double p, s;
        p=(a+b+c)/2;
        s=Math.sqrt(p*(p-a)*(p-b)*(p-c));
        System.out.println("Площадь треугольника="+s);

    }

}
