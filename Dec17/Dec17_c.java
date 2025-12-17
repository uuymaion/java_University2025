import java.util.*;
public class Dec17_c{ //leap year是平年

    public static int[] month = {31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
    public static int add(String a){
        int ans = 0;
        int count = 0;
        for(int i=0;i<a.length();i++){
            if(a.charAt(i)=='/'){
                for(int j=0;j<count-1;j++){
                    ans += month[j];
                }
                count = 0;
                continue;
            }
            count = count*10 + ((int)a.charAt(i)-'0');
        }
        ans += count;
        return ans;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        while(sc.hasNext()){
            String input = sc.next();
            int today = add(input);
            int how = sc.nextInt();
            for(int i=0;i<how;i++){
                String name = sc.next();
                input = sc.next();
                int birthday = add(input);
                // System.out.printf("%d %d%n", today, birthday);
                if(birthday<today){
                    System.out.printf("Happy %d days after birthday, %s%n", today-birthday, name);
                }else if(birthday>today){
                    System.out.printf("Happy %d days before birthday, %s%n", birthday-today, name);
                }else if(birthday==today){
                    System.out.printf("Happy Birthday, %s%n", name);
                }
            }
            System.out.println();
        }
    }
}
