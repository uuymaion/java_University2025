import java.util.*;

public class Sep17_d{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int how = sc.nextInt();

        for(int i=0;i<how;i++){
            int hour1 = sc.nextInt();
            int min1 = sc.nextInt();
            int hour2 = sc.nextInt();
            int min2 = sc.nextInt();       
            
            int ans = (hour2-hour1)*60 + (min2-min1);
            System.out.println(ans);
        }
        sc.close();
    }
}