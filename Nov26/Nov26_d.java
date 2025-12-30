import java.util.*;
public class Nov26_d {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);    
        int how = sc.nextInt();
        int count = 0;
        int[] check = new int[4];
        for(int i=0;i<how;i++){
            Arrays.fill(check, 0);
            String input = sc.next();

            for(int j=0;j<input.length();j++){
                if(input.charAt(j)=='B'){
                    check[0] += 1;
                }else if(input.charAt(j)=='F'){
                    check[1] += 1;
                }else if(input.charAt(j)=='I'){
                    check[2] += 1;
                }else if(input.charAt(j)=='A'){
                    check[3] += 1;
                }
            }
            if(check[0]<2||check[1]<3||check[2]<3||check[3]!=0){
                count += 1;
            }
        }
        System.out.println(count);
    }
    
}
