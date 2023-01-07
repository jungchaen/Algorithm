import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

/*그래프를 DFS로 탐색한 결과와 BFS로 탐색한 결과를 출력하는 프로그램*/
public class Main {
    static boolean visited[];
    static ArrayList<Integer>[] A;

    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer stringTokenizer = new StringTokenizer(bufferedReader.readLine());
        int N = Integer.parseInt(stringTokenizer.nextToken()); //정점의 수
        int M = Integer.parseInt(stringTokenizer.nextToken()); //간선의 수
        int start = Integer.parseInt(stringTokenizer.nextToken()); //시작 정점

        /*자료구조 초기화*/
        A = new ArrayList[N + 1];
        for (int i = 1; i <= N; i++) {
            A[i] = new ArrayList<Integer>();
        }

        for (int i = 0; i < M; i++) {
            stringTokenizer = new StringTokenizer(bufferedReader.readLine());
            int head = Integer.parseInt(stringTokenizer.nextToken());
            int tail = Integer.parseInt(stringTokenizer.nextToken());
            //무향
            A[head].add(tail);
            A[tail].add(head);
        }

        //번호가 작은 것부터 방문하기 위해 정렬
        for (int i = 1; i <= N; i++) {
            Collections.sort(A[i]); //리스트 내림차순 정렬
        }

        visited=new boolean[N+1];
        DFS(start);
        System.out.println();
        visited=new boolean[N+1];
        BFS(start);
    }

    public static void DFS(int node) {
        System.out.print(node+" ");
        visited[node]=true;  //방문했다고 true처리 해줌
        for (int i : A[node]) {
            if (!visited[i]) {
                DFS(i);
            }
        }
    }

    public static void BFS(int node) {
        Queue<Integer> queue = new LinkedList<Integer>();
        queue.add(node);
        visited[node] = true;

        while (!queue.isEmpty()) {
            int now = queue.poll();
            System.out.print(now + " ");
            for (int i : A[now]) {
                if (!visited[i]) {
                    visited[i]=true;
                    queue.add(i);
                }
            }
        }
    }
}
