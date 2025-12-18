import java.util.*;
public class Dec17_h{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int how = sc.nextInt();
        for(int i=0;i<how;i++){
            int howSoldier = sc.nextInt();
            int[] arr = new int[howSoldier];
            for(int j=0;j<howSoldier;j++){
                arr[j] = sc.nextInt();
            }
            Long count = 0L;
            Long zeroScore = 0L;
            Long oneScore = 0L;

            for(int j=0;j<howSoldier;j++){
                count += 1;
                if(j==howSoldier-1){
                    if(arr[j]==0){
                        zeroScore += (count*(count-1)) / 2; 
                    }else{
                        oneScore += (count*(count-1)) / 2;
                    }
                    count = 0L;
                }else if(arr[j+1]!=arr[j]){
                    if(arr[j]==0){
                        zeroScore += (count*(count-1)) / 2; 
                    }else{
                        oneScore += (count*(count-1)) / 2;
                    }
                    count = 0L;
                }
            }
            if(zeroScore<oneScore){
                System.out.printf("%d : %d Disadvantages%n", zeroScore, oneScore);
            }else if(zeroScore>oneScore){
                System.out.printf("%d : %d Advantages%n", zeroScore, oneScore);
            }else{
                System.out.printf("%d : %d Balance%n", zeroScore, oneScore);
            }
            
        }    
    }
}