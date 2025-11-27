import java.util.*;
public class Oct29_c {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int how = sc.nextInt();
        for(int i=0;i<how;i++){
            int x = sc.nextInt(), v = sc.nextInt(), a = sc.nextInt(), t = sc.nextInt();
            int ans = x + v*t + (a*t*t)/2;
            System.out.println(ans);
        }
    }
}
