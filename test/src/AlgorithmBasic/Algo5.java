package AlgorithmBasic;

public class Algo5 extends ProblemTemplate{
    @Override
    public void solve() {
                int n = sc.nextInt();
                int arr[][] = new int[2][n];
                int arr2[][] = new int[2][n];

                for(int i = 0 ; i < 2 ; i++){
                    for(int j = 0 ; j < n ; j++){
                        arr[i][j] = sc.nextInt();
                    }
                }

                for (int i = 0; i < n; i++) {
                    int A = arr[0][i];
                    int B = arr[1][i];
                    if(A == 1 && B == 3) System.out.println("A");
                    if(A == 3 && B == 1) System.out.println("B");
                    if(A == 2 && B == 3) System.out.println("B");
                    if(A == 3 && B == 2) System.out.println("A");
                    if(A == 2 && B == 1) System.out.println("A");
                    if(A == 1 && B == 2) System.out.println("B");
                    if(A == B) System.out.println("D");
                }
            }

}
