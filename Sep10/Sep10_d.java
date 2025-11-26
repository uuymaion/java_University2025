import java.util.*;

public class Sep10_d {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int how = sc.nextInt();
        
        for(int i=0;i<how;i++){
            int a = sc.nextInt();
            int one = 1;
            int two = 2;
            int count = 0;

            if(a == 1){
                System.out.println(one);
            }else if(a == 2){
                System.out.println(two);
            }else if(a > 2){
                for(int x=0;x<(a-2);x++){
                    count = one + two;
                    one = two;
                    two = count;
                }
            }

            System.out.println(count);
        }
            

        sc.close();
    }
    
}
