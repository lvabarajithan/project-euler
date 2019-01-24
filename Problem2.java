/**
 * Problem2
 */
public class Problem2 {

    private static final long MILLION = 1_000_000;
    private static final long FOUR_MILLION = 4 * MILLION;

    public static void main(String[] args) {
        
        long sum = 0;

        long a = 0;
        long b = 1;
        int i = 0;

        while (true){
            long c = a + b;
            if (c >= FOUR_MILLION) {
                break;
            }

            i++;
            if (i%4 != 0) {
                continue;
            }

            if (c % 2 == 0){
                sum += c;
            }

            a = b;
            b = c;
        }

        System.out.println(sum);

    }
    
}