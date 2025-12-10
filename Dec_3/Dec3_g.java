import java.util.*;
public class Dec3_g {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);    
        int how = sc.nextInt();
        for(int i=0;i<how;i++){
            int numb = sc.nextInt();
            int[] arr = new int[numb];
            Arrays.fill(arr, 0);
            String standard = sc.next();
            String std = sc.next();
            for(int j=0;j<standard.length();j++){
                arr[(int)standard.charAt(j)-'A'] += 1;
            }
            for(int j=0;j<std.length();j++){
                arr[(int)std.charAt(j)-'A'] += 1;
            }
            int ans = numb;
            for(int j=0;j<numb;j++){
                if(arr[j]==1){
                    ans -= 2;
                }
            }
            System.out.println(ans);
        }
    }
}
