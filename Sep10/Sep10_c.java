import java.util.*;

public class Sep10_c {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        long money = sc.nextInt();

        while(sc.hasNext()){
            long used = sc.nextInt();
            money += used;
            System.out.println(money);
        }
        sc.close();

    }
    
}
