import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class PascalTriangle {
    public static void main(String[] args) throws IOException {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        System.out.print("줄 수를 입력하세요: ");
        int n=Integer.parseInt(br.readLine()); //파스칼 삼각형 줄 수
        pascalTriangle(n);
    }
    
    /* 재귀함수가 있으면 재귀함수가 있는 부분까지는 계속 반복되고, 
    * 재귀함수가 없는 아랫부분의 코드는 윗 부분이 다 진행되고 나서야 실행된다. */
    public static int[] pascalTriangle(int n){  //파스칼 삼각형 출력, 재귀함수로 구현
        int[] arr=new int[n];
        if(n==1){  //맨 첫줄
            arr[0]=1;
            System.out.println(arr[0]);
            return arr;  //배열을 반환
        }else if(n==2){  //두번째 줄까지는 1,1
            arr[0]=1;
            arr[1]=1;
            pascalTriangle(n-1);
        }else{  //그 외의 줄
            arr[0]=1;
            arr[n-1]=1;
            int[] tempArr=new int[n-1];  //얘를 만들어주는 이유가 아래줄의 숫자를 계산하기 위해서, 윗줄은 아랫줄보다 숫자가 한 개 적으니깐 크기가 n-1
            tempArr= pascalTriangle(n-1);
            for(int i=1;i<n-1;i++){ //한줄에서 처음이랑 마지막이랑 제외하고
                arr[i]=tempArr[i-1]+tempArr[i]; //위의 두수를 합해서 arr에 넣어줌
            }
        }
        for(int i=0;i<arr.length-1;i++){
            System.out.print(arr[i]+",");
        }
        System.out.print(arr[arr.length-1]);
        System.out.println(); //다음줄로 넘겨줌
        return arr;
    }
}
