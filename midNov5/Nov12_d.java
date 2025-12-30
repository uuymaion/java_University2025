import java.util.*;

public class Nov12_d {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int how = sc.nextInt();
        for(int i=0;i<how;i++){
            int numb = sc.nextInt();
            int com = sc.nextInt();
            String input = sc.next();
            int[] arr = new int[input.length()];
            int[] ans = new int[input.length()];

            for(int j=0;j<input.length();j++){
                int tem;
                if((int)input.charAt(j)>='A'){
                    tem = (int)input.charAt(j)-'A'+10;
                }else{
                    tem = (int)input.charAt(j)-'0';
                }
                arr[j] = tem;
                ans[j] = numb - arr[j] - 1;
            }

            if(numb==com){
                ans[input.length()-1] += 1;
                int set = input.length()-1;

                while(true){
                    if(ans[set]!=numb){
                        break;
                    }else if (set==0) {
                        ans[set] = 0;
                        System.out.print("1");
                        break;
                    }else{
                        ans[set] = 0;
                        set -= 1;
                        ans[set] += 1;
                    }
                }
            }
            // System.out.println(Arrays.toString(arr));
            // System.out.println(Arrays.toString(ans));
            for(int j=0;j<input.length();j++){
                if(ans[j]>=10){
                    System.out.print((char)(ans[j]-10+'A'));
                }else{
                    System.out.print(ans[j]);
                }

            }
            System.out.println();

        }
    }
}
