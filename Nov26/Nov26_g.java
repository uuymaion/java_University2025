import java.util.*;
public class Nov26_g{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);   
        int how = sc.nextInt();
        for(int i=0;i<how;i++){
            int numb = sc.nextInt();
            int[] arr = new int[numb];
            for(int j=0;j<numb;j++){
                arr[j] = sc.nextInt();
            }
            int count = 0;
            int n = 0;
            for(int x=0;x<numb-1;x++){
                for(int y=0;y<numb-1;y++){
                    if(arr[y]>arr[y+1]){
                        count += 1;
                        int tem = arr[y];
                        arr[y] = arr[y+1];
                        arr[y+1] = tem;
                    }
                }
            }
            System.out.println(count);
        } 
    }
}