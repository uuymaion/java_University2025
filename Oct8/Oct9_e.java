import java.util.*;

public class Oct9_e{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int day = sc.nextInt();
        while(sc.hasNext()){
            int a = sc.nextInt();
            day += a;
        }
        int ans = day%7;
        if(ans==0){
            System.out.println("Sunday");
        }else if(ans==1){
            System.out.println("Monday");
        }else if(ans==2){
            System.out.println("Tuesday");
        }else if(ans==3){
            System.out.println("Wednesday");
        }else if(ans==4){
            System.out.println("Thursday");
        }else if(ans==5){
            System.out.println("Friday");
        }else if(ans==6){
            System.out.println("Saturday");
        }
    }
}