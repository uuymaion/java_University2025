import java.util.*;
// 最大公因數算法

public class Sep10_a{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int how = sc.nextInt();

        for(int i=0;i<how;i++){
            int a = sc.nextInt();
            int b = sc.nextInt();

            if(a>b){
                int tem = a;
                a = b;
                b = tem;
            }
            // a must be small than b

            for(int j=a;j>=1;j--){
                if(a%j!=0){
                    continue;
                }if(b%j==0){
                    System.out.println(j);
                    break;
                }

            }
        }
        sc.close();
    }
}
