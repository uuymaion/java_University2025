import java.util.*;
public class Oct15_e {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        while(sc.hasNext()){
            String input = sc.next();
            
            // 檢查11的倍數
            int eleven_odd = 0;
            int eleven_even = 0;

            // 檢查3的倍數
            int three_sum = 0;

            // 檢查10的倍數
            int ten_bool = 0;
            for (int i=0;i<input.length();i++) {

                three_sum += input.charAt(i)-48;
                
                if(i%2==0){ // odd
                    eleven_odd += input.charAt(i)-48;
                }else if(i%2==1){ // even
                    eleven_even += input.charAt(i)-48;
                }

                if(i==(input.length()-1)){
                    if(input.charAt(i)-48==0){
                        ten_bool = 1;
                    }
                }

            }
            // 紀錄通關數
            int count = 0;
            if(three_sum%3==0){
                count += 1;
            }if((eleven_odd-eleven_even)%11==0){
                count += 1;
            }if(ten_bool==1){
                count += 1;
            }

            // ans
            if(count==3){
                System.out.println("nice gift");
            }else{
                System.out.println("skip");
            }
        }
    }
}
