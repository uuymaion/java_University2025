import java.util.*;

public class Sep10_g {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int how = sc.nextInt();

        for(int i=0;i<how;i++){
            String a = sc.next();
            int count = 0;

            for(int j=0;j<a.length();j++){
                int tem = a.charAt(j) - 48;
                // 因為會轉成ASCII，所以扣48來解決
                count += tem;
            }
            System.out.println(count);
            
        }
    }
    
}
