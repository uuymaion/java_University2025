import java.util.*;
public class Nov26_e {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);    
        while(sc.hasNext()){
            int a = 0;
            int b = 1;
            int ans = 0;
            int input = sc.nextInt();
            for(int i=1;i<input;i++){
                ans = a + b;
                a = b;
                b = ans;
            }
            System.out.println(ans);
        }
    }
    
}
