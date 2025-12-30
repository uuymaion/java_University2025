import java.util.*;
public class Nov26_b {
    public static int function(int a, int b){
        int ans = a*a*a + 2*a*a - 3*a - 1 + b*b*b - b*b + 4*b;
        return ans;
    }
    public static int find(String input, int index){
        int one = 0;
        int two = 0;
        boolean oneAction = false;
        boolean twoAction = false;
        boolean end = false;
        for(int i=index;i<input.length();i++){
            if(input.charAt(i)==' '&&oneAction==true){
                if(twoAction==false){
                    twoAction = true;
                }else if(end==false){
                    end = true;
                    break;
                }
            }
            if(twoAction){ 
                if(input.charAt(i)=='f'){
                    two = find(input, i+1);
                }else{
                    two = two*10 + ((int)input.charAt(i)-'0');
                }
            }else{
                if(input.charAt(i)=='f'){
                    one = find(input, i+1);
                }else{
                    one = one*10 + ((int)input.charAt(i)-'0');
                } 
                oneAction = true;
            }

        }
        return function(one, two);
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int how = sc.nextInt();
        for(int i=0;i<how;i++){
            String input = sc.nextLine();
            System.out.println(find(input, 2));
        }
    }
}
