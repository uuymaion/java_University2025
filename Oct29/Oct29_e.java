import java.util.*;
public class Oct29_e {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);    
        String standard = sc.next();
        int how = sc.nextInt();
        for(int i=0;i<how;i++){
            String input = sc.next();

            
            if(standard.charAt(1)==input.charAt(1)){
                // 因為AB相對來說沒有按照順序，不能用ASCII解
                // 所以把他們變成數字之後再作比較0~6(C~B)
                int standardTem = (int)standard.charAt(0)-(int)'C';
                if(standardTem == -1){ // B
                    standardTem = 6;
                }else if(standardTem == -2){ // A
                    standardTem = 5;
                }
                int inputTem = (int)input.charAt(0)-(int)'C';
                if(inputTem == -1){ // B
                    inputTem = 6;
                }else if(inputTem == -2){ // A
                    inputTem = 5;
                }

                if(standardTem>=inputTem){
                    System.out.println("Plan Singing");
                }else{
                    System.out.println("Plan Toilet");
                }

            }else if(standard.charAt(1)>input.charAt(1)){
                System.out.println("Plan Singing");
            }else if(standard.charAt(1)<input.charAt(1)){
                System.out.println("Plan Toilet");
            }
        }
    }
}
