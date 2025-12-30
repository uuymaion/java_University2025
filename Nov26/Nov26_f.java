import java.util.*;
public class Nov26_f {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);    
        while(sc.hasNext()){
            int how = sc.nextInt();
            if(how==0){
                break;
            }
            int[] arrY = new int[how];
            for(int i=0;i<how;i++){
                int x = sc.nextInt();
                arrY[i] = sc.nextInt();
            }
            Arrays.sort(arrY);


            int w = 0;
            if(how%2==0){
                w = arrY[how/2-1];
            }else{
                w = arrY[how/2];
            }
            long sum = 0;
            for(int i=0;i<how;i++){
                sum += Math.abs(arrY[i]-w);
            }
            System.out.printf("%d %d%n", w, sum);
        }
    }   
}
