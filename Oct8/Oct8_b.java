import java.util.*;

public class Oct9_b{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int how = sc.nextInt();

        int time = 0;
        int count = 0;
        for(int i=0;i<how;i++){
            int a = sc.nextInt();
            int b = sc.nextInt();

            time += a;
            if(time>count){
                count = time;
            }
            count += b;

        }
        System.out.println(count);
        
    }
}
