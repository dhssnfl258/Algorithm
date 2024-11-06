import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());

        int lt = 1;
        int ans = 0;
        int sum = 0;

        for (int rt = 1; rt < n; rt++) {
            sum += rt;


            while(sum > n){
                sum -= lt;
                lt++;
            }
            if(sum == n) ans++;

        }
        bw.write(ans + "\n");
        bw.flush();
        bw.close();
        br.close();
    }
}
