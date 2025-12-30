// binary search
import java.util.*;

public class Nov12_h {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int how = sc.nextInt();
        for(int i=0;i<how;i++){
            String input = sc.next();
            int left = 0;
            int right = input.length()-1;
            int mid;
            while(true){
                mid = (left+right) / 2;
                System.out.printf("%d ", mid);
                if(input.charAt(mid)=='X'){
                    right = mid - 1;
                }else if(input.charAt(mid)=='O'){
                    left = mid + 1;
                }
                if(left>right){
                    System.out.println();
                    System.out.println(left);
                    break;
                }

            }
        }
    }
    
}
