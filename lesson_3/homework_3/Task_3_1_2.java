package lesson_3.homework_3;
import java.util.Scanner;
public class Task_3_1_2 {
    public static void main(String[] args) {
        // ввод номера квартиры
        double num;
        Scanner sc = new Scanner(System.in);
        System.out.print("Введите номер квратриры:");
        num=sc.nextDouble();

        //расчёт номера подъезда
        int ent;
        ent=(int)num/36;
        if((num/36)%ent!=0) ent++;

        //расчёт этажа
        int floor;
        num=num-36*(ent-1);
        floor=(int)num/4;
        if((num/4)%floor!=0) floor++;

        //Вывод данных
        System.out.println("Квартира № "+(int)num+" находится в\n" +
                "подъезде№ "+ent+" на этаже№ "+floor);
    }
}
