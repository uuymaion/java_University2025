import java.util.*;

public class Nov19_d {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int how = sc.nextInt();
        int key = sc.nextInt();
        int data = sc.nextInt();
        boolean dataEven;
        if(data%2==0){
            dataEven = true;
        }else{
            dataEven = false;
        }

        int[] lossNumb = new int[how];
        for(int i=0;i<how;i++){
            lossNumb[i] = sc.nextInt();
        }
        for(int i=0;i<how;i++){
            int input = sc.nextInt();
            if(dataEven){
                if(input%2==0){
                    input -= data;
                }else{
                    input += data;
                }
            }else{
                if(input%2==0){
                    input += data;
                }else{
                    input -= data;
                }
            }
            input += lossNumb[i];
            System.out.printf("%d ", input);
        }
        System.out.println();
    }
    
}
