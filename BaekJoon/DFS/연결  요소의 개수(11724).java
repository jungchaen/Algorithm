import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class Main {
    public static ArrayList<Integer>[] listArray; //인접 리스트를 저장
    public static boolean visited[]; //노드 방문 여부

    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer stringTokenizer = new StringTokenizer(bufferedReader.readLine());
        int n = Integer.parseInt(stringTokenizer.nextToken()); //노드의 개수 6
        int m = Integer.parseInt(stringTokenizer.nextToken()); //에지의 개수 5

        listArray = new ArrayList[n+1]; //1부터 시작해서 n+1
        visited = new boolean[n+1];

        //ArrayList 초기화
        for (int i = 1; i < n + 1; i++) {
            listArray[i] = new ArrayList<Integer>();
        }

        for (int i = 0; i < m; i++) {
            stringTokenizer = new StringTokenizer(bufferedReader.readLine());


            int headNode = Integer.parseInt(stringTokenizer.nextToken());
            int tailNode = Integer.parseInt(stringTokenizer.nextToken());

            //양방향(무향)이라서 u->v, v->v
            //단방향(유향)이면 u->v
            listArray[headNode].add(tailNode);
            listArray[tailNode].add(headNode);
        }

        int cnt=0; //연결 요소의 개수(=DFS가 몇 번 호출되는지)
        for (int i = 1; i < n + 1; i++) {
            if (!visited[i]) {
                cnt++;
                DFS(i);
            }
        }
        System.out.println(cnt);
    }

    public static void DFS(int visit) {
//      if (visited[visit]) {
//            return;
//        }
        //재귀함수라고 해서 반드시 무한루프에 빠지는 건 아니다.
        //코드를 보고 종료조건에서 빠져나오면 종료조건(탈출구)이 없어도 된다.

        visited[visit] = true; //방문했으니까 true를 해주고
        for (int i : listArray[visit]) {
            if (visited[i] == false) {
                DFS(i);
            }
        }
    }
}
