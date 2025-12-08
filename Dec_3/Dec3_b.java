import java.util.*;
public class Dec3_b{
    public static void main(String[] args){
        Scanner sc =  new Scanner(System.in);
        while(sc.hasNext()){
            int a = sc.nextInt();
            if(a==0){
                break;
            }
            int b = sc.nextInt();

            int[][] arr = new int[a][b];
            for(int i=0;i<a;i++){
                for(int j=0;j<b;j++){
                    arr[i][j] = sc.nextInt();
                }
            }
            int goal = sc.nextInt();

            int goalX = -1;
            int goalY = -1;
            for(int i=0;i<a;i++){
                for(int j=0;j<b;j++){
                    if(arr[i][j]==goal){
                        goalX = i;
                        goalY = j;
                    }
                }
            }

            for(int i=0;i<a;i++){
                for(int j=0;j<b;j++){
                    if(i==goalX || j==goalY){
                        System.out.print(arr[i][j]+" ");
                    }else{
                        System.out.print("0 ");
                    }
                }
                System.out.println();
            }

            
        }
    }
}