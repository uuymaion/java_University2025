import java.util.*;

public class Oct15_c {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int how = sc.nextInt();
        for(int i=0;i<how;i++){
            int r = sc.nextInt(), g = sc.nextInt(), b = sc.nextInt();
            int max = r, min = r;

            if(g>max){
                max = g;
            }if(b>max){
                max = b;
            }
            if(g<min){
                min = g;
            }if(b<min){
                min = b;
            }
            int ans = max-min;
            if(max==0){
                ans = 0;
            }
            if(ans<=0.87*255){
                System.out.println("pending");
            }else{
                System.out.println("skip");
            }
        }
    }
    
}
