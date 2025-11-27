import java.util.*;

public class Oct29_h {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while(sc.hasNext()){
            String a = sc.next(), b = sc.next();
            int ansA = 0, ansB = 0;
            for(int i=0;i<a.length();i++){
                ansA += ((int)a.charAt(i)-48) * Math.pow(2, a.length()-i-1);
            }
            for(int i=0;i<b.length();i++){
                ansB += ((int)b.charAt(i)-48) * Math.pow(2, b.length()-i-1);
            }
            System.out.printf("%d:%d%n", ansA, ansB);
        }
    }
}
