import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/* DP의 효율성 확인 */
public class Main {
    static int cnt = 0;
    static int dpCnt = 0;

    public static int fib(int n) { // 재귀함수를 이용한 피보나치 수열
        if (n == 1 || n == 2) {
            cnt++;
            return 1;
        } else {
            return fib(n - 1) + fib(n - 2);
        }
    }

    public static int fibonacci(int n) { // dp를 이용한 피보나치 수열
        int[] dp = new int[n + 1];
        dp[1] = 1;
        dp[2] = 1;
        for (int i = 3; i <= n; i++) {
            dpCnt++;
            dp[i] = dp[i - 1] + dp[i - 2];
        }
        return dp[n];
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        fib(n);
        fibonacci(n);
        System.out.println(cnt + " " + dpCnt);
    }
}
