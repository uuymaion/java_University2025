import java.util.*;

public class Sep10_b {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        while(sc.hasNext()){
            float s = sc.nextFloat();
            float n = sc.nextFloat();
            float k = sc.nextFloat();

            float ans = s * (n - 2*k) / n;

            if(ans<=0){
                System.out.println(0.0);
            }else{
                System.out.println(ans);
            }


        }
        sc.close();
    }
    
}
