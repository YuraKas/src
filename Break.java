public class Break {
    public static void main(String[] args) {
        int i;
        for(i=1;i<7;i++){
            System.out.println("Начало цикла");
            q1:{
            two:{
                three:{
                    System.out.println("\ni="+i);
                    if(i==1) break q1;
                    if(i==2) break two;
                    if(i==3) break three;
                    System.out.println("типа не будет выведена :)");
                }
                System.out.println("После блока три");
            }
                System.out.println("После блока Два");
            }
            System.out.println("После блока один");

        }
        System.out.println("После цикла");
    }
}
