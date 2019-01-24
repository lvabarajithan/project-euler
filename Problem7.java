/**
 * Problem7
 */
public class Problem7 {

    public static void main(String[] args) {
        
        int x = 10001;

        int n = 2;
        int pc = 0;

        while (true) {

            if (isPrime(n)) {
                pc++;
            }

            if (pc == x) {
                System.out.println(n);
                break;
            }
            n++;

        }

    }

    private static boolean isPrime(int n) {
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if(n%i == 0){
                return false;
            }
        }
        return true;
    }
    
}