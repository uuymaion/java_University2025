import java.util.*;
public class Oct15_a {
    public static int cut(int a, int b){ // 計算兩值的差
        if(a<b){ // 確保a>b
            int tem = b;
            b = a;
            a = tem;
        }
        return a-b;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int how = sc.nextInt();
        for(int i=0;i<how;i++){
            // 檢查點的位置
            int check_x = sc.nextInt();
            int check_y = sc.nextInt();
            int count = 0;

            int numb = sc.nextInt();
            for(int j=0;j<numb;j++){
                int x = sc.nextInt();
                int y = sc.nextInt();
                int power = sc.nextInt();

                if((cut(check_x, x)+cut(check_y, y))<=power){
                    count += 1;
                }
            }
            if(count<3){
                count = 0;
            }
            System.out.println(count);
        }
    }
}
