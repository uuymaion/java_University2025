import java.util.*;

public class Oct29_f {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while(sc.hasNext()){
            double mhealth = 30;
            double mattack = 10;
            double khealth = 50;
            double kattack = 25;

            int input = sc.nextInt();
            // 在input進來的時候就設定好可變動的生命值
            // 等級一的時候沒有加乘所以要扣掉
            double temp_mhealth = 30*Math.pow(1.3, input-1), temp_khealth = 50*Math.pow(1.25, input-1);

            int diff = 0;
            while(true){

                // 先進行每回合的攻擊
                temp_mhealth -= kattack * Math.pow(1.25, input-1);
                temp_khealth -= mattack * Math.pow(1.3, input+diff-1);

                // m的生命變零的情況先討論
                if(temp_mhealth<=0){
                    if(temp_mhealth==0 && temp_khealth==0){
                        diff += 1;
                        break;
                    }else{
                        diff += 1;
                        temp_mhealth = 30*Math.pow(1.3, input+diff-1);
                        temp_khealth = 50*Math.pow(1.25, input-1);
                    }
                }else if(temp_khealth<=0){
                    // 此時m的生命不可能是零，所以到這裡就計算結束
                    break;
                }
            }
            System.out.println(diff);
        }
    }
}
