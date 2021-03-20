package alg;

public class _剑指Offer_10_I_斐波那契数列 {

    public int fib(int n) {
        int a = 0, b = 1, sum;
        for (int i = 0; i < n; i++) { // TODO i从0开始，sum交替向前移动
            sum = a + b;
            a = b;
            b = sum % 1000000007; // TODO 注意看题干要求取余
        }
        return a;
    }

    public int fib_2(int n) {
        int[] dp = new int[n + 2];
        dp[0] = 0;
        dp[1] = 1;
        for (int i = 2; i <= n; i++) {
            dp[i] = dp[i - 2] + dp[i - 1];
            dp[i] %= 1000000007;
        }
        return dp[n];
    }

}
