import java.util.*;
public class Oct15_d {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String input = sc.next();
        for(int i=0;i<input.length();i+=2){
            if(input.charAt(i)=='0'){
                if(input.charAt(i+1)=='0'){
                    System.out.print("A");
                }else if(input.charAt(i+1)=='1'){
                    System.out.print("B");
                }
            }else if(input.charAt(i)=='1'){
                if(input.charAt(i+1)=='0'){
                    System.out.print("C");
                }else if(input.charAt(i+1)=='1'){
                    System.out.print("D");
                }
            }
        }
    }
}
