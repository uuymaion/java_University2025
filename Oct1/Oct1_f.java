import java.util.*;
public class Oct1_f {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int day = a;

        while(sc.hasNext()){
            int b = sc.nextInt();
            day += b;
        }
        day = day%7;
        if(day==0){
            System.out.println("Sunday");
        }else if(day==1){
            System.out.println("Monday");
        }else if(day==2){
            System.out.println("Tuesday");
        }else if(day==3){
            System.out.println("Wednesday");
        }else if(day==4){
            System.out.println("Thursday");
        }else if(day==5){
            System.out.println("Friday");
        }else if(day==6){
            System.out.println("Saturday");
        }
    }
}
