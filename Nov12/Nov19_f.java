import java.util.*;
// still
public class Nov19_f {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        while(sc.hasNext()){
            int student = sc.nextInt();
            if(student==0){
                break;
            }
            int task = sc.nextInt();
            int[] std = new int[student];
            int[] t = new int[task];
            int[] ans = new int[student];
            Arrays.fill(ans, 0);
            for(int i=0;i<student;i++){
                std[i] = sc.nextInt();
            }
            for(int i=0;i<task;i++){
                int input = sc.nextInt();
                int max = 0;
                int maxIndex = -1;
                for(int j=0;j<student;j++){
                    if(input+std[j]<=10&&ans[j]==0){
                       if(input+std[j]>max){
                            max = input + std[j];
                            maxIndex = j;
                        }
                    }
                }
                if(maxIndex!=-1){
                    std[maxIndex] = max;
                    ans[maxIndex] += 1;
                }
                // System.out.println(Arrays.toString(std));
                // System.out.println(Arrays.toString(ans));
                // System.out.printf("%d %d%n", maxIndex, max);
            }
            int count = 0;
            for(int i=0;i<student;i++){
                if(std[i]==10){
                    count += 1;
                }
            }
            System.out.println(count);
        }
    }
    
}
