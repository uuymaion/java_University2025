import java.util.*;

public class Oct15_h {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int how = sc.nextInt();
        int count = 0;
        for(int i=0;i<how;i++){
            String input = sc.next();
            int total_o = 0;
            int total_x = 0;

            for(int j=0;j<input.length();j++){
                if(input.charAt(j)=='O'){
                    total_o += 1;
                }else if(input.charAt(j)=='X'){
                    total_x += 1;
                }
            }
            if(total_x>total_o){
                count += 1;
            }
        }
        System.out.println(count);

    }
}
