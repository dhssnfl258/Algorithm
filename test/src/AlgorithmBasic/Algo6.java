package AlgorithmBasic;//package AlgorithmBasic;
//
//import java.io.BufferedReader;
//import java.io.BufferedWriter;
//import java.io.InputStreamReader;
//import java.io.OutputStreamWriter;
//
///**
// * Algorithm 배열 문제 2번
// * 피보나치 수열
// */
//public class Algo6 extends ProblemTemplate{
//    @Override
//    public void solve(){
//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
//        int s = 10;
////        int s = Integer.parseInt(br.readLine());
//        int [] arr = new int[s];
//        arr[0] = 1;
//        arr[1] = 1;
//        for(int i = 2 ; i < s ; i++){
//            arr[i] = arr[i-1] + arr[i-2];
//        }
//        // 배열 값을 BufferedWriter로 출력
//        for (int i = 0; i < s; i++) {
//            bw.write(arr[i] + " ");
//        }
//
//
//        bw.flush(); // BufferedWriter에 저장된 내용을 출력
//        br.close();
//        bw.close();
//    }
//}
