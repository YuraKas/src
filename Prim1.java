
public class Prim1 {

    public static void main(String[] args)
    throws java.io.IOException {

        char ch[] = new char[10]; // создаём массив симолов
        int x;
        x = 0;
        ch[0] = (char) System.in.read(); // вытаскиваем из буфера первый символ
        System.out.println(ch[x]); // печатаем первый символ
        for (x = 1; x <= 10; x++) { // запускаем цикл посимвольной печати
            ch[x] = (char) System.in.read();
            if(ch[x]=='\n') break; // дойдя до символа перевода строки выходим из цикла
            System.out.println(ch[x]);

        }



    }
}
