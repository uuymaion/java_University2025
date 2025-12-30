import java.util.*;
public class Nov26_a {
    public static boolean check(String my){
        boolean ans = false;
        String standard = "Wally";
        if(my.length()>=5){
            for(int i=0;i<my.length();i++){
                if(my.charAt(i)=='W'&&(i+5<=my.length())){
                    for(int j=i;j<i+5;j++){
                        if(my.charAt(j)==standard.charAt(j-i)){
                            ans = true;
                        }else{
                            ans = false;
                            break;
                        }
                    }
                }
            }
        }
        return ans;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int how = sc.nextInt();
        for(int i=0;i<how;i++){
            int a = sc.nextInt();
            int b = sc.nextInt();
            int ansX = 1;
            int ansY = 1;
            boolean correct = false;

            for(int x=0;x<a;x++){
                for(int y=0;y<b;y++){
                    String input = sc.next();
                    if(check(input)){
                        correct = true;
                        ansX += x;
                        ansY += y;
                    }
                }
            }
            if(correct==false){
                System.out.println("Wally Not Found");
            }else{
                System.out.printf("%d %d%n", ansX, ansY);
            }
        }
    }  
}
