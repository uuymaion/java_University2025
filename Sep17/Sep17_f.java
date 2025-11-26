import java.util.*;

public class Sep17_f{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        long money = sc.nextInt();

        while(sc.hasNext()){
            long out = sc.nextLong();
            money += out;

            System.out.println(money);
        }
        sc.close();
    }
}