import java.util.*;

public class Oct9_c{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int how = sc.nextInt();

        for(int i=0;i<how;i++){
            int r = sc.nextInt();
            int g = sc.nextInt();
            int b = sc.nextInt();

            int max = r;
            int min = r;
            
            if(g>max){
                max = g;
            }if(b>max){
                max = b;
            }
            if(g<min){
                min = g;
            }if(b<min){
                min = b;
            }
            
            if(max==0){
                System.out.println("pending");
            }else{
                if((max-min)<=221.85){
                    System.out.println("pending");
                }else{
                    System.out.println("skip");
                }
            }
        }
        
    }
}