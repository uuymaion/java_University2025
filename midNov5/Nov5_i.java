import java.util.*;

public class Nov5_i {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int how = sc.nextInt();
        for(int i=0;i<how;i++){
            double x1 = sc.nextDouble(), y1 = sc.nextDouble();
            double x2 = sc.nextDouble(), y2 = sc.nextDouble();
            double x3 = sc.nextDouble(), y3 = sc.nextDouble();
            double x4 = sc.nextDouble(), y4 = sc.nextDouble();

            double a1 = y2 - y1;
            double b1 = x1 - x2;
            double c1 = a1*x1 + b1*y1;
            double a2 = y4 - y3;
            double b2 = x3 - x4;
            double c2 = a2*x3 + b2*y3;

            double tem = a1*b2 - a2*b1;
            double temX = c1*b2 - c2*b1;
            double temY = a1*c2 - a2*c1;

            if(tem==0){
                if(temX==0 && temY==0){
                    System.out.println("LINE");
                }else{
                    System.out.println("NONE");
                }
            }else{
                double x = temX/tem;
                double y = temY/tem;
                if(x==0){
                    x = 0;
                }if(y==0){
                    y = 0;
                }
                System.out.printf("POINT %.2f %.2f\n", x, y);
            }
        }
    }
    
}
