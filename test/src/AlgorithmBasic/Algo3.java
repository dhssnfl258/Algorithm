package AlgorithmBasic;

import java.util.ArrayList;
import java.util.List;

/**
 * 인프런 자바 알고리즘 강의 문자열 12번 문제
 */
public class Algo3 extends ProblemTemplate {

    @Override
    public void solve(){
        int num = sc.nextInt();
        sc.nextLine();               // 줄 바꿈 문자를 처리하기 위해 한 줄 더 읽음
        String st = sc.nextLine();

        List<String> res = new ArrayList<>();

        for(int i = 0 ; i < st.length() ; i+=7) {

            int end = Math.min(i+7, st.length());
            res.add(st.substring(i, end));
        }
        int n = 1;
        for(String s : res) {
            if(num < n) break;
            n ++;
            int p = 0;
            int temp = 0;
            for(int i = s.length()-1 ; i >= 0 ; i--) {
                if (s.charAt(i) == '#') {

                    temp += Math.pow(2, p++);
                }
                else{
                    p++;
                }
            }
            System.out.print((char)temp);
        }





    }
}
