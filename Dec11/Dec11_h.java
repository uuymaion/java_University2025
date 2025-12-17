import java.util.*;
public class Dec11_h {
    public static int how, ans, half;
    public static int[] arr;
    public static void add(int index, int nowTotal){
        if(index==how){
            if(nowTotal>=half){
                ans += 1;
            }
            return;
        }
        add(index+1, nowTotal+arr[index]);
        add(index+1, nowTotal);
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        while(sc.hasNext()){
            how = sc.nextInt();
            arr = new int[how];
            ans = 0;
            half = 0;
            for(int i=0;i<how;i++){
                arr[i] = sc.nextInt();
                half += arr[i];
            }
            if(half%2==1){
                half = (half + 1)/2;
            }else{
                half /= 2;
            }
            add(0, 0);
            System.out.println(ans);
        }
    }
    
}
