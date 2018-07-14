public class Progres {
    public static void main(String[] args) {

        for(int i=2;i<=32;i*=2){
            double p=1;
            for(int k=i;k>=1;k--){
                p*=k;
                if(k==1) System.out.println("при i="+
                                i+" прогрессия="+p);
            }
        }
    }
}
