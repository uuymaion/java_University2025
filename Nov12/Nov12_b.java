import java.util.*;
// still
public class Nov12_b {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int how = sc.nextInt();
        for(int i=0;i<how;i++){
            int speedA = sc.nextInt();
            int attackA = sc.nextInt();
            int speedB = sc.nextInt();
            int attackB = sc.nextInt();
            int setA = 0;
            int setB = 1000;
            while(true){
                setA += speedA;
                setB -= speedB;
                // System.out.printf("%d %d %d %d%n", setA, setA+attackA, setB, setB-attackB);
                if((setA+attackA>=setB && setB-attackB<=setA)||(setA==setB)){ // 同時在攻擊範圍或AB在相同位置
                    if(speedA>speedB){
                        System.out.println("Player A win");
                    }else if(speedB>speedA){
                        System.out.println("Player B win");
                    }else{
                        System.out.println("No winner");
                    }
                    break;
                }else if(setA+attackA>=setB && setA<setB){ // B在A的攻擊範圍
                    System.out.println("Player A win");
                    break;
                }else if(setB-attackB<=setA && setA<setB){ //
                    System.out.println("Player B win");
                    break;
                }else if(setA>setB){
                    System.out.println("No winner");
                    break;
                }
                
            }
        }
    }
    
}
