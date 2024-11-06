package AlgorithmBasic;

import java.io.*;
import java.util.HashSet;
import java.util.StringTokenizer;

/**
 *
 * 임시반장 정하기
 * -> 문제 임계 확인 + 강의 풀이 한번 확인할 것
 */
public class Algo11 {
    public void solve() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int n = Integer.parseInt(br.readLine());
        int [][] arr = new int[n][5];
        for (int i = 0; i < n; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            for (int j = 0; j < 5; j++) {
                arr[i][j] = Integer.parseInt(st.nextToken());
            }
        }
        int ans = -1;
        int max = -1;
        for(int i = 0 ; i < n ; i++){
            //각 학생별
            //인원 체크용 리스트
            HashSet<Integer> set = new HashSet<>();
            for(int j = 0 ; j < 5 ; j++){
                int current = arr[i][j]; //현재 학생의 현재 학년 반
                for (int k = 0; k < n; k++) {
                    if(i != k && arr[i][j] == arr[k][j]){
                        set.add(k);
                    }
                }
            }
            if(max < set.size()){
                max = set.size();
                ans = i+1;
            }

        }
        bw.write(ans+"\n");
        bw.flush();
        bw.close();
        br.close();
    }
 }
