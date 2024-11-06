package AlgorithmBasic;

import java.io.*;
import java.util.StringTokenizer;

public class Algo10 {
    public void solve() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int n = Integer.parseInt(br.readLine());
        int arr [][] = new int[n+1][n+1];
        for (int i = 0; i < n; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            for(int j = 0 ; j < n ; j++){
                arr[i][j] = Integer.parseInt(st.nextToken());
            }
        }
        int ans = -1;
        for(int i = 0 ; i < n ; i++){
            int tmp = 0;
            for(int j = 0 ; j < n ; j++){
                tmp += arr[i][j];
            }
            if (tmp > ans) {
                ans = tmp;
            }
        }

        for(int i = 0 ; i < n ; i++){
            int tmp = 0;
            for(int j = 0 ; j < n ; j++){
                tmp += arr[j][i];
            }
            if (tmp > ans) {
                ans = tmp;
            }
        }
        int tmp = 0;
        for(int x = 0 ; x < n ; x++){
            tmp += arr[x][x];
        }
        if (tmp > ans) { ans = tmp; }
        tmp = 0;
        for(int x = 0 ; x < n ; x++){
            tmp += arr[x][n-x-1];
        }
        if (tmp > ans) { ans = tmp; }
        bw.write(ans + "\n");

        bw.flush();
        bw.close();
        br.close();
    }
}
