import java.util.*;

public class Sep10_f {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        while(sc.hasNextInt()){
            int one = sc.nextInt();
            int two = sc.nextInt();

            if(one == -1){
                break;
            }
            if(two<one){
                int tem = two;
                two = one;
                one = tem;
            }

            int between = two - one;
            int behind = 100 - between;
            if(between<=behind){
                System.out.println(between);
            }else if(behind<between){
                System.out.println(behind);
            }
        }
        sc.close();
    }
}
