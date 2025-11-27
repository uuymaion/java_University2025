import java.util.*;

public class Oct15_b {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int how = sc.nextInt();

        for(int i=0;i<how;i++){
            int numb = sc.nextInt();
            int count = 1;
            int sum = 0;

            for(int j=0;j<numb;j++){
                int input = sc.nextInt();
                if(input==1){
                    count = 1;
                }else if(input==0){
                    sum += count*10;
                    count += 1;
                }
            }
            System.out.println(sum);
        }
    }
}
