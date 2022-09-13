import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        int n=Integer.parseInt(br.readLine());
        long[][] D=new long[n+1][2]; //1의 자리부터 시작하니깐 n+1
        //앞에는 자리수이고 뒤에는 끝자리 수 0,1
        D[1][1]=1;
        D[1][0]=0;

        for(int i=2;i<=n;i++){ //이친수의 자리수만큼 반복
            D[i][0]=D[i-1][1]+D[i-1][0];
            D[i][1]=D[i-1][0];
        }
        System.out.println(D[n][0]+D[n][1]);
    }
}
