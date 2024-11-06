package AlgorithmBasic;

/**
 * 인프런 자바 알고리즘 강의 배열 2번 문제
 * 보이는 학생 찾기
 */
public class Algo4 extends ProblemTemplate{

    @Override
    public void solve() {
        int n = sc.nextInt();
        int [] str = new int[n];

        int big = -1;
        int ans = 0;
        for(int i = 0 ; i < n ; i++){
            str[i] = sc.nextInt();
            if(str[i] > big){
                big = str[i];
                ans++;
            }
        }
        System.out.println(ans);
    }
}
