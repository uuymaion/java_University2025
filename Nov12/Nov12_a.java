import java.util.*;
public class Nov12_a {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        while(sc.hasNext()){
            int how = sc.nextInt();
            if(how==0){
                break;
            }
            float[][] arr = new float[how][how];
            float[][] ans = new float[how][how];
            for(int i=0;i<how;i++){
                for(int j=0;j<how;j++){
                    float input = sc.nextFloat();
                    arr[i][j] = input;
                    ans[i][j] = input;
                }
            }
            for(int i=0;i<how;i++){
                for(int j=0;j<how;j++){
                    float count = 0;
                    float temp = 0;
                    if(arr[i][j]==0){
                        if(i!=0){
                            count += arr[i-1][j]*2; // up
                            temp += 2;
                            if(j!=0){
                                count += arr[i][j-1]*2; // left
                                temp += 2;
                                count += arr[i-1][j-1];
                                temp += 1;
                            }if(j!=how-1){
                                count += arr[i][j+1]*2; // right
                                temp += 2;
                                count += arr[i-1][j+1];
                                temp += 1;
                            }
                        }if(i!=how-1){
                            count += arr[i+1][j]*2; // under
                            temp += 2;
                            if(j!=0){
                                if(i==0){
                                    count += arr[i][j-1]*2; // left
                                    temp += 2;
                                }
                                count += arr[i+1][j-1];
                                temp += 1;
                            }if(j!=how-1){
                                if(i==0){
                                    count += arr[i][j+1]*2; // right
                                    temp += 2;
                                }
                                count += arr[i+1][j+1];
                                temp += 1;
                            }
                            
                        }
                        ans[i][j] = count/temp;
                        // System.out.printf("%.1f %.1f %.1f%n", ans[i][j], count, temp);
                    }
                }
            }
            for(int i=0;i<how;i++){
                for(int j=0;j<how;j++){
                    System.out.printf("%.1f ", ans[i][j]);
                }
                System.out.println();
            }
            
        }
    }
    
}
