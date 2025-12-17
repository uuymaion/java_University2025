import java.util.*;
public class Dec11_g {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        double n = sc.nextDouble();
        double m = sc.nextDouble();
        double e = sc.nextDouble();
        while(sc.hasNext()){
            double input = sc.nextDouble();
            n += input;
            if(n>m || m-n<=e){
                System.out.println("dangerous");
                break;
            }else{
                System.out.println("save");
            }
        }
    }
}
