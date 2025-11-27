import java.util.*;
public class Oct29_b {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int how = sc.nextInt();
        for(int i=0;i<how;i++){
            String input = sc.next();
            System.out.printf("%s is the input number%n", input);
        }
        
        while(sc.hasNext()){
            String input = sc.next();
            if(input.charAt(0)=='-'){
                break;
            }else{
                System.out.printf("%s is the input number%n", input);
            }
        }

        for(int i=0;i<how;i++){
            String input = sc.next();
            System.out.printf("%s is the input number%n", input);
        }
    }
}
