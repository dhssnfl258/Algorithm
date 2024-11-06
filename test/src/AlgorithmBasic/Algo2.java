package AlgorithmBasic;

/**
 * 인프런 자바 알고리즘 강의 문자열 2번 문제
 */
public class Algo2 extends ProblemTemplate {
    @Override
    public void solve(){
        String st = sc.next();
        StringBuilder sb = new StringBuilder();
        for(char c : st.toCharArray()){
            if(Character.isLowerCase(c)){
                sb.append(Character.toUpperCase(c));
            }
            else{
                sb.append(Character.toLowerCase(c));
            }
        }
        System.out.println(sb.toString());


    }
}
