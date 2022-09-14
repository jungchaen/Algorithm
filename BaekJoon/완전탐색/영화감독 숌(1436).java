import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        int num = 666;
        int cnt = 1;
        if (N == 1) {
            System.out.println(num);
        } else {
            while (cnt != N) {
                num++;

                if (Integer.toString(num).contains("666")) {
                    cnt++;
                }
            }
            System.out.println(num);
        }
    }
}
