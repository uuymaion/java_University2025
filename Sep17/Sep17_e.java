import java.util.*;

public class Sep17_e{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        while(sc.hasNext()){
            int s = sc.nextInt();
            int n = sc.nextInt();
            float k = sc.nextFloat();

            float ans = s * (n - 2*k) / n;
            if(ans<0){
                ans = 0.0F;
            }
            System.out.println(ans);
        }
        sc.close();
    }
}