import java.util.*;
public class Oct29_g {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while(sc.hasNext()){
            int how = sc.nextInt();
            int[] a = new int[how];
            int sum = 0;

            for(int i=0;i<how;i++){
                a[i] = sc.nextInt();
                sum += a[i];
            }
            for(int i=0;i<how;i++){
                System.out.printf("%d ", sum);
                sum -= a[i];
            }
            System.out.println();
        }
    }
}
