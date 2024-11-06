package AlgorithmBasic;

import java.util.Scanner;

public abstract class ProblemTemplate {
    protected Scanner sc;

    // 입력 준비 메서드
    public void setup() {
        this.sc = new Scanner(System.in);
    }

    // 문제 풀이 메서드 - 각 문제별로 구현 필요
    public abstract void solve();

    // 정리 메서드 - 필요한 경우 스캐너 닫기 등
    public void cleanup() {
        if (this.sc != null) {

            
            this.sc.close();
        }
    }

    // 실행 템플릿 메서드
    public void execute() {
        setup();  // 스캐너 준비
        solve();  // 문제 풀이
        cleanup(); // 자원 정리
    }
}
