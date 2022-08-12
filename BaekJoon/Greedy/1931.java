import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Comparator;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        int N = Integer.parseInt(br.readLine());

        int[][] arr = new int[N][2];
        for (int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine(), " ");
            arr[i][0] = Integer.parseInt(st.nextToken());
            arr[i][1] = Integer.parseInt(st.nextToken());
        }
        Arrays.sort(arr, new Comparator<int[]>() {
            @Override
            public int compare(int[] S, int[] E) {
                if (S[1] == E[1]) { // 종료시간이 같을 때
                    return S[0] - E[0];
                }
                return S[1] - E[1];
            }
        });
        int cnt = 0;
        int end = -1;
        for (int i = 0; i < N; i++) {
            if (arr[i][0] >= end) {
                end = arr[i][1];
                cnt++;
            }
        }
        System.out.println(cnt);
    }
}
