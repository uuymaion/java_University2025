import java.util.*;

public class Nov5_c {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int how = sc.nextInt();
        for(int i=0;i<how;i++){
            sc.nextLine();
            int len = sc.nextInt(); // 長度
            int howTwo = sc.nextInt(); // 幾組
            String[] arr = new String[howTwo];
            int[] count = new int[howTwo];
            Arrays.fill(count, 0); // 讓count的初始值是0

            // input及計算每個input的代表值
            for(int j=0;j<howTwo;j++){
                String input = sc.next();
                arr[j] = input;
                for(int z=0;z<len;z++){
                    for(int x=z+1;x<len;x++){
                        if((int)arr[j].charAt(z)>(int)arr[j].charAt(x)){
                            count[j] += 1;
                        }
                    }
                }
            }
            // 將count依照最大到最小，反向排入ans(可以確定最小值，不能確定最大值)
            int[] ans = new int[howTwo];
            for(int j=0;j<howTwo;j++){
                int max = 0;
                for(int z=0;z<howTwo;z++){
                    if(count[z]==-1){
                        continue;
                    }
                    if(count[z]>max){
                        max = count[z];
                    }
                }
                for(int z=0;z<howTwo;z++){
                    if(max==count[z]){
                        count[z] = -1;
                        ans[howTwo-j-1] = z;
                        break;
                    }
                }
            }
            // 依照ans給的index去output arr
            for(int j=0;j<howTwo;j++){
                System.out.println(arr[ans[j]]);
            }
            if(i!=how-1){
                System.out.println();
            }

        }
    }
    
}
