package AlgorithmBasic;

import java.io.*;
import java.util.ArrayList;
import java.util.StringTokenizer;

/**
 * 인프런 자바 알고리즘 강의 배열 7번 문제
 * 뒤집은 소수
 * 한번더 풀어볼 것
 */
public class Algo9 {
    public static Boolean isPrime(int n) {
        if (n <= 1) return false;
        if (n == 2) return true;
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }

    public void solve() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        // 첫 번째 입력 숫자 개수
        int num = Integer.parseInt(br.readLine());

        // 숫자 문자열 리스트 입력
        StringTokenizer st = new StringTokenizer(br.readLine());
        ArrayList<String> al = new ArrayList<>();
        for (int i = 0; i < num; i++) {
            al.add(st.nextToken());
        }

        // 각 문자열을 변환하고 소수 판별
        for (String s : al) {
            int tmp = 0;
            for (int i = 0; i < s.length(); i++) {
                tmp += Integer.parseInt(s.charAt(i) + "") * Math.pow(10, i); // i + 1로 지수 수정 가능
            }
            if (isPrime(tmp)) {
                bw.write(tmp + " ");
            }
        }

        bw.flush();
        bw.close();
        br.close();
    }

}
