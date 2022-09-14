import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static int findConstructor(int N) {
        int sum = 0;
        for (int i = 1; i < N; i++) { // 최소의 생성자를 찾기 위해 작은 수부터
            String temp = Integer.toString(i);

            sum = i;
            for (int j = 0; j < temp.length(); j++) {
                sum += Character.getNumericValue(temp.charAt(j)); // 각 자리 숫자를 더함
            }

            if (sum == N) {
                return i;
            }
        }
        return 0;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        System.out.println(findConstructor(N));
    }
}
