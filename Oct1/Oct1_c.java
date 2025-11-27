import java.util.*;

public class Oct1_c {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int how = sc.nextInt();
        int time = 0;
        int finish = 0;

        
        for(int i=0;i<how;i++){
            int a = sc.nextInt();
            int b = sc.nextInt();

            time += a;
            if(time>finish){
                finish = time;
            }
            finish += b;
        }

        System.out.println(finish);
    }
}
