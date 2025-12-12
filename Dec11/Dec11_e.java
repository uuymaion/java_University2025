import java.util.*;
public class Dec11_e{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        while(sc.hasNext()){
            int input = sc.nextInt();
            int ans = 1;
            for(int i=0;i<input-1;i++){
                ans = (ans+1)*2;
            }
            System.out.println(ans);
        }
    }
}