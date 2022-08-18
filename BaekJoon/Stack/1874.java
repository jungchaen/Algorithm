import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine()); // 수열 개수
        int[] arr = new int[N];

        for (int i = 0; i < N; i++) { // 수열 입력
            arr[i] = Integer.parseInt(br.readLine());
        }

        Stack<Integer> stack = new Stack<>();
        StringBuffer bf = new StringBuffer();
        int num = 1; // 자연수
        boolean result = true;
        for (int i = 0; i < arr.length; i++) {
            int nowNum = arr[i];
            if (nowNum >= num) {
                while (nowNum >= num) {
                    stack.push(num++);
                    bf.append("+\n"); // +문자열 추가
                }
                stack.pop();
                bf.append("-\n"); // -문자열 추가
            } else { // 현재수열값<자연수
                int n = stack.pop();
                if (n > nowNum) { // pop한 숫자가 현재수열값과 보다 크다면
                    System.out.println("NO");
                    result = false;
                    break;
                } else {
                    bf.append("-\n");
                }
            }
        }
        if (result) {
            System.out.println(bf.toString());
        }
    }
}
