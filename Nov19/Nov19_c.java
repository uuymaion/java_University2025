import java.util.*;
public class Nov19_c {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        while(sc.hasNext()){
            String input = sc.next();
            for(int i=0;i<input.length();i+=3){
                int sum = 0;
                sum += ((int)input.charAt(i)-'A')*9 + ((int)input.charAt(i+1)-'A')*3 + ((int)input.charAt(i+2)-'A'); 
                if(sum==26){
                    System.out.print(" ");
                }else{
                    System.out.print((char)(sum+'a'));
                }
                // System.out.println(sum);
            }
            System.out.println();
        }
    }
    
}
