import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Collections;
import java.util.PriorityQueue;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        PriorityQueue<Integer> plusPq = new PriorityQueue<>(Collections.reverseOrder()); // 내림차순
        PriorityQueue<Integer> minusPq = new PriorityQueue<>(); // 오름차순
        int one = 0;
        int zero = 0;

        int num = 0;
        for (int i = 0; i < N; i++) { // 수열 분리(1보다 큰수, 음수, 1, 0 총 4가지로 분리)
            num = Integer.parseInt(br.readLine());
            if (num > 1) {
                plusPq.add(num);
            } else if (num == 1) {
                one++;
            } else if (num == 0) {
                zero++;
            } else {
                minusPq.add(num);
            }
        }

        /* 1보다 큰 수 처리 */
        int sum = 0;
        int firt1 = 0, second1 = 0;
        while (plusPq.size() > 1) { // 사이즈가 1보다 클때까지, 즉 2일때까지
            firt1 = plusPq.remove();
            second1 = plusPq.remove();
            sum += firt1 * second1;
        }
        if (!plusPq.isEmpty()) { // 큐에 숫자가 남아있다면(숫자가 1개라면)
            sum += plusPq.remove();
        }

        /* 음수 처리 */
        int firt2 = 0, second2 = 0;
        while (minusPq.size() > 1) { // 사이즈가 1보다 클때까지, 즉 2일때까지
            firt2 = minusPq.remove();
            second2 = minusPq.remove();
            sum += firt2 * second2;
        }
        if (!minusPq.isEmpty()) { // 큐에 숫자가 남아있다면(숫자가 1개라면)
            if (zero == 0) {
                sum += minusPq.remove();
            }
            // else {
            // sum += minusPq.remove() * 0; // 0에 뭘곱해도 어차피 0이 되니깐 생략
            // }
        }

        /* 1 처리 */
        sum += one;
        System.out.println(sum);
    }
}
