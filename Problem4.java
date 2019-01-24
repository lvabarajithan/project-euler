/**
 * Problem4
 */
public class Problem4 {

    public static void main(String[] args) {
        
        long ans = squareOfSums(100) - sumOfSquares(100);
        System.out.println(ans);

    }

    private static long sumOfSquares(int n) {
        long sum = 1;
        for (int i = 2; i<=n; i++) {
            sum += (i*i);
        }
        return sum;
    }

    private static long squareOfSums(int n) {
        long sum = 1;
        for (int i = 2; i<=n; i++) {
            sum+=i;
        }
        return sum*sum;
    }
    
}