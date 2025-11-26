import java.util.*;
public class Sep24_g {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int how = sc.nextInt();

        for(int i=0;i<how;i++){
            Long a = sc.nextLong();
            Long b = sc.nextLong();

            Long ans = ((a+b) + (a-b) + (a*b) + (a/b)) % (a%b);
            System.out.println(ans);
        }
        sc.close();
    }
    
    
}
