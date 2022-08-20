import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Collections;
import java.util.PriorityQueue;
import java.util.StringTokenizer;

/* 수정필요 2022.08.20 */
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine()); // 테스트케이스의 수

        for (int i = 0; i < N; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int total = Integer.parseInt(st.nextToken());
            int num = Integer.parseInt(st.nextToken());

            int[] arr = new int[total];
            PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder()); // 높은 순위가 우선순위인 우선순위 큐
            st = new StringTokenizer(br.readLine());
            for (int j = 0; j < total; j++) {
                arr[j] = Integer.parseInt(st.nextToken());
                pq.offer(arr[j]);
            }

            int cnt = 0;
            for (int j = 0; j < total; j++) {
                int nowNum = pq.poll();
                cnt++;
                int targetNum = arr[num];
                if (nowNum == targetNum) {
                    System.out.println(cnt);
                    break;
                }
            }
        }
    }
}
