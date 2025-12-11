import java.util.*;
public class Dec11_f{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        while(sc.hasNext()){
            int n = sc.nextInt();
            int m = sc.nextInt();
            int[][] arr = new int[n][m];
            for(int i=0;i<n;i++){
                for(int j=0;j<m;j++){
                    arr[i][j] = sc.nextInt();
                }
            }
            int x = sc.nextInt();
            int y = sc.nextInt();
            int dir = sc.nextInt();
            int ans = 0;
            String move = sc.next();
            for(int i=0;i<move.length();i++){
                if(move.charAt(i)=='F'){
                    if(dir==1){
                        if(y!=m-1){
                            y += 1;
                        }else{
                            continue;
                        }
                    }else if(dir==2){
                        if(x!=n-1){
                            x += 1;
                        }else{
                            continue;
                        }
                    }else if(dir==3){
                        if(y!=0){
                            y -= 1;
                        }else{
                            continue;
                        }
                    }else if(dir==0){
                        if(x!=0){
                            x -= 1;
                        }else{
                            continue;
                        }
                    }
                    if(arr[x][y]==1){
                        ans += 1;
                    }
                }else if(move.charAt(i)=='R'){
                    dir = (dir+1)%4;    
                }else if(move.charAt(i)=='L'){
                    dir = (dir+3)%4;
                }
            }
            System.out.println(ans);
        }
    }
}