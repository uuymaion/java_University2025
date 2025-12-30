import java.util.*;

public class Oct9_g{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int how = sc.nextInt();

        for(int i=0;i<how;i++){
            int numb = sc.nextInt();
            int max = 0;
            int min = 0;

            for(int x=0;x<numb;x++){
                int money = sc.nextInt();

                if(x==0){
                    min = money;
                }else{
                    if(money>min){
                        if(money-min>max){
                            max = money - min;
                        }
                    }else if(money<min){
                        min = money;
                    }
                }
            }
            System.out.println(max);
        }
    }
}