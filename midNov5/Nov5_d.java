import java.util.*;

public class Nov5_d {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);    

        while(sc.hasNext()){
            String input = sc.next();

            int even = 0;
            int odd = 0;
            for(int i=0;i<input.length();i++){
                if(i%2==1){
                    even += (int)input.charAt(i) - '0';
                }else if(i%2==0){
                    odd += (int)input.charAt(i) - '0';
                }
            }

            int ans = 0;
            if((even-odd)%11 == 0){
                ans += 1;
            }if((even+odd)%3 == 0){
                ans += 1;
            }if(input.charAt(input.length()-1)=='0'){
                ans += 1;
            }
            if(ans==3){
                System.out.println("nice gift");
            }else{
                System.out.println("skip");
            }
        }
    }
    
}
