import java.util.*;

public class Oct1_e {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int how = sc.nextInt();
        for(int i=0;i<how;i++){
            int row = sc.nextInt();
            int column = sc.nextInt();

            int up = -1;
            int down = -1;
            int left = -1;
            int right = -1;
            // 陣列的索引是由0開始，所以-1才能表示沒有紀錄過


            for(int x=0;x<row;x++){
                int column_sum = 0; // 偵測每行是否有1

                for(int y=0;y<column;y++){
                    int tem = sc.nextInt();
                    column_sum += tem;
                    if(tem==1){
                        if((left==-1)&&(right==-1)){
                            left = y;
                            right = y;
                            // 左邊和右邊先預設為第一次出現1的位置
                        }else if(y<left){
                            left = y; // 比預設或之前的紀錄更小，就紀錄新的左邊
                        }else if(y>right){
                            right = y; // 比預設或之前紀錄的更大，就紀錄新的右邊
                        }
                    }
                }

                if(column_sum!=0){ // 上下高的紀錄
                    if(up!=-1){ 
                        down = x; // 上邊有紀錄的話就記錄下邊
                    }else{
                        up = x;
                    }
                }
            }

            int length = down-up+1;
            int width = right-left+1;
            if(length==0){
                length = 1;
            }if(width==0){
                width = 1;
            }

            int ans = length * width;
            System.out.println(ans);
        }
    }
}
