import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        int N = Integer.parseInt(st.nextToken()); // 동전 개수
        int total = Integer.parseInt(st.nextToken()); // 총 금액

        int[] coin = new int[N]; // 동전 종류
        for (int i = 0; i < N; i++) {
            coin[i] = Integer.parseInt(br.readLine());
        }

        int count = 0;
        for (int i = N - 1; i >= 0; i--) {
            if (coin[i] <= total) {
                count += (total / coin[i]); // 동전이 총 금액보다 작거나 같으면 count 개수 증가
                total %= coin[i]; // 남은 금액
            }
        }
        System.out.println(count);
    }
}
