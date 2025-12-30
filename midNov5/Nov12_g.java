import java.util.*;

public class Nov12_g {
    public static int count(String input){
        int count = 1;
        char[] arr = new char[input.length()+1];

        for(int i=0;i<input.length();i++){
            arr[i] = input.charAt(i); // arr裡的東西才能編輯
        }
        // System.out.println(Arrays.toString(arr));
        for(int i=0;i<input.length();i++){
            int numb = 2;
            if(arr[i]=='1'){
                continue;
            }
            for(int j=i+1;j<input.length();j++){
                if(arr[i]==arr[j]){
                    numb += 1;
                    arr[j] = '1';
                }
            }
            count *= numb;
        }
        return count;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);    
        int how = sc.nextInt();
        for(int i=0;i<how;i++){
            String inputOne = sc.next();
            String inputTwo = sc.next();

            // System.out.printf("%d %d%n", count(inputOne), count(inputTwo));
            if(count(inputOne)>count(inputTwo)){
                System.out.println("Player 1");
            }else if(count(inputOne)<count(inputTwo)){
                System.out.println("Player 2");
            }else if(count(inputOne)==count(inputTwo)){
                System.out.println("Draw");
            }
        }
    }
    
}

