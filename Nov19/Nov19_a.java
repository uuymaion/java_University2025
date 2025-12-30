import java.util.*;
// still
public class Nov19_a {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int how = sc.nextInt();
        for(int i=0;i<how;i++){
            int n = sc.nextInt(), m = sc.nextInt();
            int big = sc.nextInt(), small = sc.nextInt();
            char[][] seat = new char[n][m];
            int[][] ans = new int[n][m];

            for(int j=0;j<n;j++){
                Arrays.fill(ans[j],0); // 二維陣列要用for
                String input = sc.next();
                sc.nextLine();
                for(int z=0;z<m;z++){
                    seat[j][z] = input.charAt(z);
                }
            }
            for(int j=0;j<n;j++){
                for(int z=0;z<m;z++){
                    if(seat[j][z]=='V'){
                        boolean up = true, down = true, left = true, right = true;
                        if(z==0){
                            left = false;
                        }if(z==m-1){
                            right = false;
                        }if(j==0){
                            up = false;
                        }if(j==n-1){
                            down = false;
                        }
                        if(up){
                            ans[j-1][z] = big;
                            if(left){
                                if(ans[j-1][z-1]!=big){
                                    ans[j-1][z-1] = small;
                                }
                            }if(right){
                                if(ans[j-1][z+1]!=big){
                                    ans[j-1][z+1] = small;
                                }
                            }
                        }if(down){
                            ans[j+1][z] = big;
                            if(left){
                                if(ans[j+1][z-1]!=big){
                                    ans[j+1][z-1] = small;
                                }
                            }if(right){
                                if(ans[j+1][z+1]!=big){
                                    ans[j+1][z+1] = small;
                                }
                            }
                        }if(left){
                            ans[j][z-1] = big;
                        }if(right){
                            ans[j][z+1] = big;
                        }
                    }
                }
            }
            System.out.printf("Airplane #%d:%n", i+1);
            for(int j=0;j<n;j++){
                for(int z=0;z<m;z++){
                    if(seat[j][z]=='V'){
                        System.out.print('V');
                    }else{
                        System.out.print(ans[j][z]);
                    }
                }
                System.out.println();
            }
            
        }
    }
}
