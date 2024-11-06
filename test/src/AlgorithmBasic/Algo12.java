package AlgorithmBasic;

import java.io.*;
import java.util.StringTokenizer;

/**
 * sliding window
 * 연속부분 수열
 */
public class Algo12 {

    public void solve() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());

        int m = Integer.parseInt(st.nextToken());

        // 두 번째 줄에서 배열 요소 읽기
        st = new StringTokenizer(br.readLine());
        int arr[] = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }

        int pt = 0;
        int ans = -1;

        while (pt + m < n ){
            int tmp = 0;
            for (int i = pt; i < pt + m; i++) {
                tmp += arr[i];
            }
            if(tmp > ans) ans = tmp;
            pt++;
        }

        bw.write(String.valueOf(ans));

        bw.flush();
        bw.close();
        br.close();
    }
}
