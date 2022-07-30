import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int pay = Integer.parseInt(br.readLine());
        int amount = 1000 - pay;

        int[] coin = { 1, 5, 10, 50, 100, 500 };
        int cnt = 0;
        for (int i = coin.length - 1; i >= 0; i--) {
            if (coin[i] <= amount) {
                cnt += amount / coin[i];
                amount %= coin[i];
            }
        }
        System.out.println(cnt);
    }
}
