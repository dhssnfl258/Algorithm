package AlgorithmBasic;

import java.io.*;

public class Algo8 {
    public void solve() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());
        int answer = 0;
        int [] isPrime = new int[n+1];
        for (int i = 2; i <= n; i++) {

            if (isPrime[i] == 0) {
                isPrime[i] = 1;
                answer++;
                for(int j = i; j <= n; j = j + i) {
                    isPrime[j] = 1;
                }
            }

        }

        bw.write(answer + "\n");
        bw.flush();
        bw.close();
        br.close();
    }


}
