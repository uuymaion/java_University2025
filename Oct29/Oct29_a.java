import java.util.*;
public class Oct29_a {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int how = sc.nextInt();
        for(int i=0;i<how;i++){
            int howTwo = sc.nextInt();
            String standard = sc.next();

            for(int j=0;j<howTwo;j++){
                String input = sc.next();

                for(int z=0;z<input.length();z++){
                    if(input.charAt(z)==standard.charAt(z)){
                        System.out.print(0);
                    }else{
                        System.out.print(1);
                    }
                }
                System.out.println();
            }

        }
    }
}
