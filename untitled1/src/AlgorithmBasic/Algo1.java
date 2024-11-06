package AlgorithmBasic;

import java.util.Scanner;

/**
 * 인프런 자바 알고리즘 강의 문자열 1번 문제
 */
public class Algo1 extends ProblemTemplate{

    @Override
    public void solve(){
        Scanner sc = new Scanner(System.in);
        String s1 = sc.next();

        char s2 = sc.next().charAt(0);

        s1 = s1.toLowerCase();
        s2 = Character.toLowerCase(s2);
        int ans = 0;
        for(char c : s1.toCharArray()) {

            if(c == s2){
                ans++;
            }

        }
        System.out.println(ans);
    }

}
