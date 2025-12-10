import java.util.*;
public class Dec3_f {
    static int count = 1;
    public static void hanoi(int n, char A, char B ,char C){
        if(n==1){
            System.out.printf("%d - %c to %c%n", count, A, C);
            count += 1;
        }else{
            hanoi(n-1, A, C, B);
            hanoi(1, A, B, C);
            hanoi(n-1, B, A, C);
        }
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        while(sc.hasNext()){
            count = 1;
            int how = sc.nextInt();
            if(how==0){
                break;
            }
            hanoi(how, 'A', 'B', 'C');
            System.out.println();
        }
    }
}
