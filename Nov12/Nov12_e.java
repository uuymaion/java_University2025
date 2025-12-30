import java.util.*;

public class Nov12_e {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        while(sc.hasNext()){
            int how = sc.nextInt();
            if(how==0){
                break;
            }
            int[] arr = new int[how];
            for(int i=0;i<how;i++){
                int input = sc.nextInt();
                arr[i] = input;
            }
            for(int i=0;i<how;i++){
                int min = arr[i];
                int minIndex = 0;
                for(int j=i+1;j<how;j++){
                    if(arr[j]<min){
                        min = arr[j];
                        minIndex = j;
                    }
                }
                if(min!=arr[i]){
                    int tem = arr[i];
                    arr[i] = min;
                    arr[minIndex] = tem;
                }
                for(int j=0;j<how;j++){
                    System.out.printf("%d ", arr[j]);
                    if(j==how-1){
                        System.out.println();
                    }
                }
            }
        }
    }
    
}
