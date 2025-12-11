import java.util.*;
public class Dec11_a{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);    
        while(sc.hasNext()){
            int need = sc.nextInt();
            int can = sc.nextInt();
            if(need==0 && can==0){
                break;
            }
            int[] arr = new int[12]; // 儲存input的1/0
            int[] useIndex = new int[can+1]; // 索引代表所需更改的時間，而儲存最小的時間
            Arrays.fill(useIndex, 12);

            for(int i=0;i<12;i++){
                arr[i] = sc.nextInt();
            }
            for(int i=0;i<12-need+1;i++){
                int busyCount = 0;
                for(int j=i;j<i+need;j++){
                    if(arr[j]==1){
                        busyCount += 1;
                    }
                }
                if(busyCount<=can){
                    useIndex[busyCount] = Math.min(useIndex[busyCount], i);
                }
            }
            // System.out.println(Arrays.toString(useIndex));
            for(int i=0;i<can+1;i++){
                if(useIndex[i]!=12){
                    System.out.println(useIndex[i]+8); 
                    break;
                }else if(i==can){
                    System.out.println("busy");
                }
            }
        }
    }
}
