import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine()); // 전체 사람의 수
        int[][] arr = new int[N][2]; // N개의 길이의 배열이 2개 있음
        int[] rank = new int[N];

        StringTokenizer st;
        for (int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine());
            arr[i][0] = Integer.parseInt(st.nextToken()); // 몸무게
            arr[i][1] = Integer.parseInt(st.nextToken()); // 키
        }

        for (int i = 0; i < N; i++) {
            int cnt = 1; // rank는 1부터 시작
            for (int j = 0; j < N; j++) {
                if (i == j) // 같은 경우 생략
                    continue;

                if (arr[i][0] < arr[j][0] && arr[i][1] < arr[j][1]) { // 몸무게, 키 비교
                    cnt++;
                }
            }
            rank[i] = cnt;
        }
        for (int i : rank) {
            System.out.print(i + " ");
        }
    }
}
