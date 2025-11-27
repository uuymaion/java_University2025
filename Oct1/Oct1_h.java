import java.util.*;

public class Oct1_h {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);    
        int how = sc.nextInt();

        for(int i=0;i<how;i++){
            int time = sc.nextInt(); // 天數
            int min_price = sc.nextInt(); 
            int ans = 0; // 相當於最大收益

            for(int j=1;j<time;j++){
                int price = sc.nextInt();
                if((price-min_price)>ans){
                    ans = price - min_price;
                }if(price<min_price){
                    min_price = price;
                }
            }
            System.out.println(ans);
        }
    }
    
}
