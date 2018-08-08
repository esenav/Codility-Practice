import java.util.Arrays;

public class CyclicRotation {
    public static void main(String[] args) {
        int[] A = new int[]{3, 8, 9, 7, 6};
        int K = 3;
        solution(A, K);
    }

    private static int[] solution(int[] A, int K){

        for(int i =0; i<K;i++){
            rotate(A, K);
            System.out.println(Arrays.toString(A));
        }
        return A;
    }

    private static void rotate(int[] tmp, int K){
        int i, tm;
        tm = tmp[tmp.length-1];
        for(i=tmp.length-1;i>0;i--){
            tmp[i] = tmp[i-1];
        }
        tmp[0]=tm;
    }
}
