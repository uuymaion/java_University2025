import java.util.*;

public class Oct1_b {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int how = sc.nextInt();
        for(int i=0;i<how;i++){
            int a = sc.nextInt();
            int b = sc.nextInt();
            int c = sc.nextInt();

            if(a==1){
                System.out.print("handsome ");
            }else if(a==2){
                System.out.print("rich ");
            }else if(a==3){
                System.out.print("smart ");
            }
            if(b==1){
                System.out.print("Allcky ");
            }else if(b==2){
                System.out.print("Jimmy ");
            }else if(b==3){
                System.out.print("Chen ");
            }
            if(c==1){
                System.out.println("dances");
            }else if(c==2){
                System.out.println("eats");
            }else if(c==3){
                System.out.println("writes");
            }


        }

    }
    
}
