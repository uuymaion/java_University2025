import java.util.*;

public class Oct9_d{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int how = sc.nextInt();

        for(int i=0;i<how;i++){
            int row = sc.nextInt();
            int column = sc.nextInt();

            int up = -1;
            int down = -1;
            int right = -1;
            int left = -1;

            for(int x=0;x<row;x++){
                int count = 0; // 記錄此column有沒有1

                for(int y=0;y<column;y++){
                    int a = sc.nextInt();

                    if(a==1){ // 出現1時紀錄
                        count += 1;
                        if(right==-1){ // 出現第一個1時
                            right = y;
                            left = y;
                        }else{ // 其他狀況
                            if(y<right){ 
                                right = y;
                            }else if(y>left){
                                left = y;
                            }
                        }
                    }

                    
                }

                if(count>0){
                    if(up==-1){
                        up = x;
                        down = x;
                    }else{
                        down = x;
                    }
                }
            }

            int ans = (down-up+1) * (left-right+1);
            System.out.println(ans);
        }
    }
}
