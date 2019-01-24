/**
 * Problem6
 * 1 = 9                (       3x       3)
 * 2 = 9009             (      99x      91)
 * 3 = 906609           (     993x     913)
 * 4 = 99000099         (    9999x    9901)
 * 5 = 9966006699       (   99979x   99681)
 * 6 = 999000000999     (  999999x  999001)
 * 7 = 99956644665999   ( 9998017x 9997647)
 * 8 = 9999000000009999 (99999999x99990001)
 */
public class Problem6 {

    public static void main(String[] args) {
        
        int ul = 999;
        int ll = 100;

        long ans = 0;
        boolean found = false;

        for (int i=ul; i>ll; i--) {
            for(int j=i; j>ll;j--){
                long mul = i*j;
                if (isPalindrome(mul) && mul>ans){
                    ans = mul;
                }
            }
        }

        System.out.println(ans);

    }

    private static boolean isPalindrome(long val) {
        long temp = val;
        long reverse = 0;
        while(temp>0){
            reverse = reverse*10 + temp%10;
            temp/=10;
        }
        return reverse == val;
    }
    
}