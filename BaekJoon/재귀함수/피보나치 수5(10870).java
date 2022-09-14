import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static int fibonacci(int N) {
        if (N == 0)  //조기 리턴
            return 0;
        if (N == 1)
            return 1;
        return fibonacci(N - 1) + fibonacci(N - 2);
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine()); // 피보나치 수에서 몇번째 수를 가리키는가
        System.out.println(fibonacci(N));
    }
}
