public class CountDiv {
    public static void main(String[] args) throws Exception {
        int A = 6;
        int B = 11;
        int K = 2;
        System.out.println(solution(A, B, K));
    }
    // https://app.codility.com/demo/results/trainingMKNMEQ-4WS/
    private static int solution(int A, int B, int K) throws Exception {
        if(B < A || K <= 0){
            throw new Exception("Invalid values supplied");
        }
        // Division not counting decimal values
        int minValue = ((A + K - 1 )/ K) * K;

        if(minValue > B){
            return 0;
        }else{
            return ((B - minValue) / K) + 1;
        }
    }
}
