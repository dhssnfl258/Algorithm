package AlgorithmBasic;//package AlgorithmBasic;
//
//import java.io.BufferedReader;
//import java.io.BufferedWriter;
//import java.io.InputStreamReader;
//import java.io.OutputStreamWriter;
//import java.util.StringTokenizer;
//
//public class Algo7 extends ProblemTemplate{
//    @Override
//    public void solve() {
//
//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
//        int cnt = Integer.parseInt(br.readLine());
//        int arr[] = new int[cnt];
//        StringTokenizer st = new StringTokenizer(br.readLine());
//        for(int i = 0 ; i < cnt ; i++ ){
//            arr[i] = Integer.parseInt(st.nextToken());
//        }
//        int flag = 1;
//        int ans = 0;
//        for(int t : arr){
//            if(t == 1){
//                ans += flag * t;
//                flag ++;
//            }
//            else{
//                flag =1;
//            }
//        }
//
//        bw.write(ans+"\n");
//
//        bw.flush(); // BufferedWriter에 저장된 내용을 출력
//        br.close();
//        bw.close();
//    }
//}
