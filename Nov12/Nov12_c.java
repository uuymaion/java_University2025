import java.util.*;
public class Nov12_c {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        while(sc.hasNext()){
            int how = sc.nextInt();
            int[] time = new int[how];
            for(int i=0;i<how;i++){
                time[i] = sc.nextInt();
            }
            int medcine = sc.nextInt();
            if(how==0){ // 會有how=0的情況發生
                System.out.println(0);
                continue;
            }

            int now = time[0];
            int count = 0;
            for(int i=0;i<how;i++){
                if(i!=how-1){
                    if(now+medcine>time[i+1]){
                        count += time[i+1]-now;
                        now = time[i+1];
                        // System.out.print("A");
                    }else{
                        now = time[i+1];
                        count += medcine;
                        // System.out.print("B");
                    }
                }else{
                    now = time[i];
                    now += medcine;
                    count += medcine;
                    // System.out.print("C");
                }
                // System.out.printf("%d %d%n", now, count);
            } 
            System.out.println(count);
            
        }
    }
    
}
