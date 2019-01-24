/**
 * Problem9
 */
public class Problem9 {

    public static void main(String[] args) {
        
        System.out.println(prodOfTriplets());

    }

    private static long prodOfTriplets() {
        for (int a=1; a<1000; a++) {
            for (int b=a+1; b<1000; b++) {
                int c = 1000 - b - a;
                if ((a*a)+(b*b) == (c*c)) {
                    return a*b*c;
                }
            }
        }
        return 0;
    }
    
}