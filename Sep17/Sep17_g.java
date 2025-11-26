import java.util.*;

public class Sep17_g{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        while(sc.hasNext()){
            int a = sc.nextInt();
            int b = sc.nextInt();
            float c = sc.nextFloat();

            float ans = b*b - 4*a*c;

            if(ans>0){
                System.out.println(2);
            }else if(ans==0){
                System.out.println(1);
            }else if(ans<0){
                System.out.println(0);
            }
        }
        sc.close();
    }
}