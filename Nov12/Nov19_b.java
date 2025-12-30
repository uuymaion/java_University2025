import java.util.*;

public class Nov19_b {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int how = sc.nextInt();
        for(int i=0;i<how;i++){
            String input = sc.next();
            int count = 0;
            boolean even = true;
            int ans = 0;
            int tem = 0;
            for(int j=input.length()-1;j>=0;j--){
                tem += Math.pow(10, count) * ((int)input.charAt(j)-'0');
                if(count==2||j==0){
                    if(even){
                        ans += tem;
                    }else{
                        ans -= tem;
                    }
                }
                if(count==2){ // 完成一次3的輪迴後重置
                    count = 0;
                    if(even){
                        even = false;
                    }else{
                        even = true;
                    }
                    tem = 0;
                }else{
                    count += 1;
                }
                // System.out.printf("%d %d %n", tem, ans);
            }
            if(ans%13==0){
                System.out.printf("%d YES%n", Math.abs(ans));
            }else{
                System.out.printf("%d NO%n", Math.abs(ans));
            }
        }
    }
}
