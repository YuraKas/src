package lesson_3.homework_3;

import java.util.Scanner;

public class Task_3_2_2 {
    public static void main(String[] args) {

        int xA=0;
        int yA=0;
        int xB=4;
        int yB=4;
        int xC=6;
        int yC=1;
        double ab;
        ab=leng(xA,yA,xB,yB);
        double bc;
        bc=leng(xB,yB, xC, yC);
        double ac;
        ac=leng(xA, yA, xC, yC);
        double abc=square(ab,ac,bc);

        Scanner sc= new Scanner(System.in);
        System.out.print("x=");
        int xD;
        xD=sc.nextInt();
        System.out.print("y=");
        int yD=sc.nextInt();
        double ad =leng(xA,yA,xD,yD);
        double bd=leng(xB,yB,xD,yD);
        double cd=leng(xC, yC,xD, yD);

        double abd=square(ab, ad, bd);
        double bcd=square(bc,bd, cd);
        double acd=square(ad,cd,ac);
        double sum=abd+bcd+acd;
        if(abc==sum) System.out.println("Точка принадлежит треугольнику");
        else System.out.println("Точка не принадлежит треугольнику");

    }

     static double leng(int x1, int y1, int x2, int y2) {
        double l;
        int x = x2 - x1;
        int y = y2 - y1;
        l = Math.sqrt(x * x + y * y);
        return l;
    }
    static double square(double l1, double l2, double l3){
         double p;
         double s;
         p=(l1+l2+l3)/2;
         s=p*(p-l1)*(p-l2)*(p-l3);
         s=Math.sqrt(s);
         return s;
    }

}
