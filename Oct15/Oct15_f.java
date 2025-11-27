import java.util.*;

public class Oct15_f {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int how = sc.nextInt();
        sc.nextLine();

        for(int i=0;i<how;i++){
            String input = sc.nextLine();
            boolean real = false; // 紀錄有沒有1-9出現
            int read = 0; // 紀錄讀到的數字

            for(int j=0;j<input.length();j++){
                if((int)input.charAt(j)>48 && (int)input.charAt(j)<=57){ //1-9
                    real = true;
                    read += 1;
                    System.out.print(input.charAt(j));

                }else if(input.charAt(j)=='-'){
                    if(j==input.length()-1){

                    }else if(read!=0){
                        
                    }else if(input.charAt(j+1)>=48 && input.charAt(j+1)<=57){
                        System.out.print(input.charAt(j));
                    }

                }else if(input.charAt(j)=='0'){
                    read += 1;
                    if(real==true){
                        System.out.print(input.charAt(j));
                    }
                }
            }
            
            if(real==false){ // 有讀到數字但沒有1-9
                System.out.println(0);
            }else if(real==true){
                System.out.println();
            }
        }
        sc.close();
    }
}
