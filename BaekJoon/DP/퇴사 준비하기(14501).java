import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        int n=Integer.parseInt(br.readLine());
        StringTokenizer st;

        int[] D=new int[n+2];  //DP테이블, 퇴사일이 n+1일, 배열은 0부터 시작하는데 문제에서 1일부터 시작
        int[] T=new int[n+1]; //1일부터 시작이니깐
        int[] P=new int[n+1];
        //D[0]=t[0]=p[0]=0;  이걸 할 필요가 없는게 배열 객체는 원래 생성하면 모든 인덱스의 값을 0으로 초기화
        for(int i=1;i<=n;i++){
            st=new StringTokenizer(br.readLine());
            T[i]=Integer.parseInt(st.nextToken());
            P[i]=Integer.parseInt(st.nextToken());
        }

        for(int i=n;i>=1;i--){
            if(i+T[i]>n+1){ //i번째 일자+상담기간이 퇴사일을 넘을때
                D[i]=D[i+1];  //DP테이블 i번째 인덱스의 값을 0으로 저장
            }else{
                D[i]=Math.max(D[i+1],D[i+T[i]]+P[i]); //i+1번째 날의 값 vs i번째 날+상담기간+i번째 날 상담 수익을 더한 값을 비교하여 더 큰 값을 반환(최대수익)
            }
        }
        System.out.println(D[1]);  //얻을 수 있는 최대 수익 출력
    }
}
