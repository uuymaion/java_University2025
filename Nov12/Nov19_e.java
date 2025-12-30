import java.util.*;

public class Nov19_e {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while(sc.hasNext()){
            long health = sc.nextLong();
            long damage = sc.nextLong();
            long howLong = sc.nextLong();
            int how = sc.nextInt();
            long[] time = new long[how];

            for(int i=0;i<how;i++){
                time[i] = sc.nextInt();
            }
            for(int i=0;i<how;i++){
                if(i!=how-1){
                    if(time[i+1]-time[i]>howLong){
                        health -= damage*howLong;
                    }else{
                        health -= damage*(time[i+1]-time[i]);

                    }
                }else{
                    health -= damage*howLong;
                }
                // System.out.println(sum);
            }
            
            if(health<=0){
                System.out.println("Dead");
            }else{
                System.out.println("Alive");
            }
        }
    }
}
