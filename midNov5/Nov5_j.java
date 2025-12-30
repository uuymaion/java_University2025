import java.util.*;

public class Nov5_j {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int how = sc.nextInt();

        for(int i=0;i<how;i++){
            String input = sc.next().trim(); // 去掉多餘的空白
            boolean left = false; // 確認是否在等號右邊
            boolean negative = false; // 紀錄當下的值是否是負數
            float numb = 0;
            float numbX = 0;
            float temp = 0;
            for(int j=0;j<input.length();j++){
                // 是數字就原本的*10+數字
                if(input.charAt(j)>='0' && input.charAt(j)<='9'){ 
                    temp *= 10;
                    temp += (int)input.charAt(j) - '0';
                }
                // 沒有數字或讀到最後一個的話要結算
                if((input.charAt(j)<'0' || input.charAt(j)>'9')||j==input.length()-1){
                    // 考慮到x省略的係數1的狀況
                    if(temp==0&&input.charAt(j)=='x'){
                        if(j!=0){
                            if(input.charAt(j-1)=='0'){
                                temp = 0;
                            }else{
                                temp = 1;
                            }
                        }else{
                            temp = 1;
                        }

                    }
                    // 負號和等號要翻轉
                    if(negative){
                        temp *= -1;
                        negative = false;
                    }if(left){
                        temp *= -1;
                    }

                    if(input.charAt(j)=='x'){
                        numbX += temp;
                    }else if(input.charAt(j)!='x'){
                        numb += temp;
                    }
                    // 結算完temp要歸零
                    temp = 0;
                    if(input.length()-1==j){
                        left = false;
                    }
                }

                // 負號和等號放在後面才不會影響結算的正負號
                if(input.charAt(j)=='='){
                    left = true;
                }else if(input.charAt(j)=='-'){
                    negative = true;
                }
                // System.out.printf("%f %f %f %b %b%n", temp, numbX, numb, negative, left);
            }
            if(numbX==0){
                if(numb==0){
                    System.out.println("INF");
                }else{
                    System.out.println("NONE");
                }
            }else{
                float ans = (numb/numbX) * -1;
                if(ans==0){
                    ans = 0;
                }
                System.out.printf("%.0f%n", Math.floor(ans));
            }

        }
    }
}
