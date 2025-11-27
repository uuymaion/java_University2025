import java.util.*;

public class Oct1_g {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        while(sc.hasNext()){
            int a = sc.nextInt();
            if(a==-1){
                break;
            }
            int b = sc.nextInt();
            int c = sc.nextInt();
            int d = sc.nextInt();

            int max = a;
            int min = a;
            if(b>max){
                max = b;
            }else if(b<min){
                min = b;
            }
            if(c>max){
                max = c;
            }else if(c<min){
                min = c;
            }
            if(d>max){
                max = d;
            }else if(d<min){
                min = d;
            }
            
            if((max-min)>25){
                System.out.println("Nah");
            }else if((a+b+c+d)<350){
                System.out.println("Nah");
            }else{
                System.out.println("In");
            }
            
        }
    }
}
