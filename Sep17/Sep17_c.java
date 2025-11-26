import java.util.*;

public class Sep17_c{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        while(sc.hasNext()){
            int a = sc.nextInt();
            if(a==0){
                break;
            }
            System.out.println(a + " is the input number");
        }

        sc.close();
    }
}