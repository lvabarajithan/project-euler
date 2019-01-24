import java.util.ArrayList;
import java.util.List;

/**
 * Problem5
 */
public class Problem5 {

    public static void main(String[] args) {
        
        int k = 20;
        int N = 1;
        int i = 1;
        boolean check = true;
        int limit = (int) Math.sqrt(k);

        ArrayList<Integer> primes = genPrimes(k);
        int[] e = new int[primes.size()+1];

        for (Integer p: primes) {
            e[i] = 1;
            if (check) {
                if (p <= limit) {
                    e[i] = (int) Math.floor(Math.log(k) / Math.log(p));
                } else {
                    check = false;
                } 
            }
            N *= Math.pow(p, e[i]);
            i++;
        }

        System.out.println(N);

    }

    /**
     * Generate primes until 'n' value.
     */
    private static ArrayList<Integer> genPrimes(int n) {
        ArrayList<Integer> primes = new ArrayList<>();

        int num = 2;
        int status = 1;

        for (int i = 3; i <= n && num<=n;) {
            for(int j=2; j<=Math.sqrt(num);j++){
                if (num%j == 0) {
                    status = 0;
                    break;
                }
            }
            if (status != 0) {
                primes.add(num);
                i++;
            }
            status = 1;
            num++;
        }
        return primes;
    }

}