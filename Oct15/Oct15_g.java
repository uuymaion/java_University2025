import java.util.*;

public class Oct15_g {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int how = sc.nextInt(); // 會產生一個\n
        sc.nextLine(); // 幫上一行吃掉\n

        for(int i=0;i<how;i++){
            String input = sc.nextLine();
            int time = input.length()/2+1;

            for(int j=0;j<time;j++){
                if(input.charAt(j)!=input.charAt(input.length()-j-1)){
                    System.out.println("No");
                    break;
                }else if(j==time-1){
                    System.out.println("Yes");
                }
            }
        }
    }
}