import java.util.*;
public class Dec11_b {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int how = sc.nextInt();
        for(int i=0;i<how;i++){
            int n = sc.nextInt();
            int m = sc.nextInt();
            int[][] next;
            int[][] arr = new int[n][m];
            for(int x=0;x<n;x++){
                for(int y=0;y<m;y++){
                    arr[x][y] = sc.nextInt();
                }
            }
            int howNumb = sc.nextInt();
            for(int j=0;j<howNumb;j++){
                int input = sc.nextInt();
                if(input==1){
                    next = new int[arr.length][arr[0].length];
                    for(int x=0;x<arr.length;x++){
                        for(int y=0;y<arr[0].length;y++){
                            next[x][y] = arr[(x+1)%arr.length][y];
                        }
                    }
                }else if(input==2){
                    next = new int[arr.length][arr[0].length];
                    for(int x=0;x<arr.length;x++){
                        for(int y=0;y<arr[0].length;y++){
                            next[x][y] = arr[(x+(arr.length-1))%arr.length][y];
                        }
                    }
                }else if(input==3){
                    next = new int[arr.length][arr[0].length];
                    for(int x=0;x<arr.length;x++){
                        for(int y=0;y<arr[0].length;y++){
                            next[x][y] = arr[x][(y+1)%arr[0].length];
                        }
                    }
                }else if(input==4){
                    next = new int[arr.length][arr[0].length];
                    for(int x=0;x<arr.length;x++){
                        for(int y=0;y<arr[0].length;y++){
                            next[x][y] = arr[x][(y+(arr[0].length-1))%arr[0].length];
                        }
                    }
                }else if(input==5){
                    next = new int[arr[0].length][arr.length];
                    for(int x=0;x<arr[0].length;x++){
                        for(int y=0;y<arr.length;y++){
                            next[x][y] = arr[arr.length-y-1][x];
                        }
                    }
                }else{
                    next = new int[arr[0].length][arr.length];
                    for(int x=0;x<arr[0].length;x++){
                        for(int y=0;y<arr.length;y++){
                            next[x][y] = arr[y][arr[0].length-x-1];
                        }
                    }
                }
                arr = next;
            }
            for(int x=0;x<arr.length;x++){
                for(int y=0;y<arr[0].length;y++){
                    System.out.printf("%d ", arr[x][y]);
                }
                System.out.println();
            }
            System.out.println();
        }
    }  
}
