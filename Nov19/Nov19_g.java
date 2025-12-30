import java.util.*;

public class Nov19_g {
    public static int search(char a){
        char[] standard = {'C', 'D', 'E', 'F', 'G', 'A', 'B'};
        int ans = 0;
        for(int i=0;i<standard.length;i++){
            if(standard[i]==a){
                ans = i;
            }
        }
        return ans;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        char[] standard = {'C', 'D', 'E', 'F', 'G', 'A', 'B'};
        int[] diff = {2, 2, 1, 2, 2, 2, 1}; // C到C之間仲間的key數
        String my = sc.next();
        int how = sc.nextInt();
        for(int i=0;i<how;i++){
            String input = sc.next();
            int ans = 0;
            if(my==input){
                System.out.println(ans);
                continue;
            }
            ans = (((int)my.charAt(1))-((int)input.charAt(1)))*12;
            boolean postive = true;
            int max = Math.max(search(my.charAt(0)), search(input.charAt(0)));
            int min = Math.min(search(my.charAt(0)), search(input.charAt(0)));
            if(max==search(input.charAt(0))){
                postive = false;
            }
            for(int j=min;j<max;j++){
                if(postive){
                    ans += diff[j];
                }else{
                    ans -= diff[j];
                }
            }
            System.out.println(ans);

        }

    }
    
}
