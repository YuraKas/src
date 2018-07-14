import java.util.Scanner;
public class Prime_1_1 {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int x;
        x=sc.nextInt();
                //Определяем разрядность числа, считаем что есть хотя бы одна цифра
        int razryad = (int) (Math.log10(x));
        // выводим по разрадам
        int k;
        do {
            k=(int) (x/Math.pow(10,razryad));
            System.out.println(k);
            x=(int)(x-k*Math.pow(10,razryad));
            razryad--;
        } while (razryad>=0);
        }
    }

