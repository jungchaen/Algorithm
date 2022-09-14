import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());

        Stack<Character> st = new Stack<>();
        for (int i = 0; i < T; i++) {
            String str = br.readLine();
            for (int j = 0; j < str.length(); j++) {
                if (str.charAt(j) == '(') {
                    st.push(str.charAt(j));
                } else { // 닫는 괄호 ')' 인 경우
                    if (st.isEmpty()) {
                        st.push(str.charAt(j));
                        break;
                    } else {
                        st.pop();
                    }
                }
            }
            if (st.isEmpty()) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
            st.clear();
        }
    }
}
