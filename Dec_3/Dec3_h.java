import java.util.*;
public class Dec3_h {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        while(sc.hasNext()){
            String first = sc.nextLine();
            String edit = sc.nextLine();
            int[] arr = new int[26*2]; // 大寫在前(ACSII較前)
            Arrays.fill(arr, 0);
            for(int i=0;i<edit.length();i++){
                if(edit.charAt(i)==' '){
                    continue;
                }else if(edit.charAt(i)>='a' && edit.charAt(i)<='z'){
                    arr[((int)edit.charAt(i)-'a')+26] += 1;
                }else if(edit.charAt(i)>='A' && edit.charAt(i)<='Z'){
                    arr[(int)edit.charAt(i)-'A'] += 1;
                }
            }
            for(int i=0;i<3;i++){
                int max = 0;
                int maxIndex = 0;
                for(int j=51;j>=0;j--){
                    if(arr[j]>=max){
                        max = arr[j];
                        maxIndex = j;
                    }
                }
                if(max!=0){
                    // System.out.printf("%d %d%n", max, maxIndex);
                    if(maxIndex>=26){
                        System.out.print((char)(maxIndex-26+'a')+" ");
                    }else{
                        System.out.print((char)(maxIndex+'A')+" ");
                    }
                    arr[maxIndex] = 0;
                }
            }
            System.out.println();

        }
    }
}
