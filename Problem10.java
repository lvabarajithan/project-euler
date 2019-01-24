/**
 * Problem10
 */
public class Problem10 {

    public static void main(String[] args) {
        
        long twoMillion = 2_000_000;

        long sum = 0;
        int num = 2;
        int status = 1;

        for (int i = 3; i <= twoMillion && num<=twoMillion;) {
            for(int j=2; j<=Math.sqrt(num);j++){
                if (num%j == 0) {
                    status = 0;
                    break;
                }
            }
            if (status != 0) {
                sum += num;
                i++;
            }
            status = 1;
            num++;
        }

        System.out.println(sum);

    }
    
}