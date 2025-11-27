import java.util.*;

public class Oct29_d {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        while(sc.hasNext()){
            int input = sc.nextInt();
            if(input==0){
                break;
            }
            for(int i=2;i<input;i++){
                if(number(i)){
                    if(number(input-i)){
                        System.out.printf("%d = %d + %d%n", input, i, input-i);
                        break;
                    }
                }
                if(i==input-1){
                    System.out.printf("%d = 0 + 0", input);
                }
            }
        }
    }
    // 判斷質數
    public static boolean number(int a){
        for(int i=2;i<a;i++){ // 
            if(a%i==0){
                return false;
            }
        }
        if(a==1){ // 1不是質數
            return false;
        }
        return true; // 2會直接跳過來
        
    }
}
