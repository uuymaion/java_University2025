import java.util.*;

public class Oct8_h {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        while(sc.hasNext()){
            int change = sc.nextInt();
            if(change==0){
                break;
            }
            char name = sc.next().charAt(0);
            int first = (int)name;

            int ans = first + change;

            
            if(ans>122){
                ans -= 26;
            }else if(ans<97){
                ans += 26;
            }
            
            System.out.println((char)ans);

        }
        sc.close();
    }
}
