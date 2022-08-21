import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static int factorial(int N) {
        if (N == 1 || N == 0)
            return 1;
        else
            return N * factorial(N - 1);
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int result = factorial(N);
        System.out.println(result);
    }
}
