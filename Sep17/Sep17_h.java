import java.util.*;

public class Sep17_h{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int how = sc.nextInt();

        for(int i=0;i<how;i++){
            int a = sc.nextInt();
            int count = 0;

            for(int j=0;j>=0;j++){
                count += a%10;
                a = (a-a%10)/10;
                if(a==0){
                    System.out.println(count);
                    break;
                }
            }
        }

        sc.close();
    }
}