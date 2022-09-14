import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static StringBuilder sb = new StringBuilder();

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        System.out.println((int) (Math.pow(2, n) - 1));

        hanoi(n, 1, 2, 3);
        System.out.print(sb.toString());
    }

    public static void hanoi(int n, int start, int temp, int target) {
        if (n == 1) { // 재귀 함수 종료 조건
            sb.append(start + " " + target + "\n");
            return;
        }

        hanoi(n - 1, start, target, temp); // n-1개를 A에서 B로 이동

        sb.append(start + " " + target + "\n"); // 마지막 장대 1개를 A에서 C로 이동

        hanoi(n - 1, temp, start, target); // n-1개를 B에서 C로 이동
    }
}
