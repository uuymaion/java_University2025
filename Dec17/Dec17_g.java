import java.util.*;
public class Dec17_g{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        while(sc.hasNext()){
            int need = sc.nextInt();
            int able = sc.nextInt();
            if(need==0 && able==0){
                break;
            }
            int count = 0; 
            int total = 12; // 總共有空閒的時間
            int[] arr = new int[12];
            for(int i=0;i<12;i++){
                arr[i] = sc.nextInt();
                total -= arr[i];
            }
            for(int i=0;i<12-need+1;i++){
                for(int j=i;j<i+need;j++){
                    count += arr[j];
                }
                if(count<=able && total>=need){ // 當天的事要做完，所以所有的空閒時間至少等於所需時間
                    System.out.println(i+8);
                    break;
                }else if(i==12-need){
                    System.out.println("busy");
                }
                count = 0;
            }
        }
    }
}