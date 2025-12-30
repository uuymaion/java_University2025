import java.util.*;
// still
public class Nov12_f {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        while(sc.hasNext()){
            int sizeBig = sc.nextInt();
            int sizeSmall = sc.nextInt();
            int ask = sc.nextInt();
            if(sizeBig==0&&sizeSmall==0&&ask==0){
                break;
            }

            int[][] arr = new int[sizeBig][sizeBig];

            for(int i=0;i<sizeBig;i++){
                for(int j=0;j>sizeBig;j++){
                    int input = sc.nextInt();
                    arr[i][j] = input;
                }
            }
            for(int i=0;i<(sizeBig*sizeBig/sizeSmall*sizeSmall);i++){
                for(int x=i;x<sizeSmall;x++){
                    for(int y=i;y<sizeSmall;y++){
                        
                    }
                }
            }

        }
    }
}
