/**
 * Problem3
 */
public class Problem3 {

    public static void main(String[] args) {
        
        long n = 600851475143L;
        long max = 0;

        while (n%2 == 0) {
            if (2 > max) {
                max = 2;
            }
            n = n/2;
        }

        for (int i=3; i<=Math.sqrt(n); i+=2) {
            while (n%i == 0) {
                if (i > max) {
                    max = i;
                }
                n = n/i;
            }
        }

        if (n > 2 && n > max){
            max = n;
        }

        System.out.println(max);

    }
    
}