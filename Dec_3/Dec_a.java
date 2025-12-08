import java.util.*;
public class Dec3_a{
    public static int change(String a){
        int ans = 0;
        for(int i=0;i<a.length();i++){
            ans += Math.pow(2, a.length()-i-1) * ((int)a.charAt(i)-'0');
        }
        return ans;                                                                                 
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int how = sc.nextInt();
        for(int i=0;i<how;i++){
            String inputR = sc.next();
            String inputG = sc.next();
            String inputB = sc.next();
            int r = change(inputR);
            int g = change(inputG);
            int b = change(inputB);

            int max = Math.max(r, g);
            max = Math.max(max, b);
            int min = Math.min(r, g);
            min = Math.min(min, b);

            int s = 0;
            if(max!=0){
                s = max-min;
            }
            if(s<=255*0.87){
                System.out.println("pending");
            }else{
                System.out.println("skip");
            }

        }
    }
}
