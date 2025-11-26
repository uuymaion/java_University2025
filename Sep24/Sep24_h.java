import java.util.*;
public class Sep24_h {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int how = sc.nextInt();
        for(int i=0;i<how;i++){
            float k = sc.nextFloat();
            float w = sc.nextFloat();

            float ans = w * (k/100);
            System.out.println(ans);
        }
        sc.close();
    }
}
