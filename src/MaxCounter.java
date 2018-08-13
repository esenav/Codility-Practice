import java.util.Arrays;

public class MaxCounter {
    public static void main(String[] args) {
        int[] A = new int[]{3, 4, 4, 6, 1, 4, 4};
        int N = 5;
        System.out.println(Arrays.toString(solution1(N, A)));
        System.out.println(Arrays.toString(solution2(N, A)));
    }
    // Solution Score 66% as when handling large data sets, code does not perform fast enough;
    // https://app.codility.com/demo/results/trainingPZFTFW-FS2/
    private static int[] solution1(int N, int[] A){
        int[] array = new int[N];
        int max = 0;
        int increase = 0;
        for(int i =0;i<N;i++){
            Arrays.fill(array, 0);
        }
        for (int aA : A) {
            if (aA > N) {
                increase = max;
            } else {
                array[aA - 1] = Math.max(array[aA - 1], increase);
                array[aA - 1]++;
                max = Math.max(max, array[aA - 1]);
            }
        }
        for(int i=0;i<N;i++){
            array[i]=Math.max(array[i], increase);
        }
        return array;
    }
    // A much more complex solution as it deals with boolean when assigning values to variables
    // Deals with large data sets much faster than solution1, but difficult to work out the code.
    // https://app.codility.com/demo/results/trainingEDNWAQ-H8M/
    private static int[] solution2(int N, int[] A){
        int[] array = new int[N];
        int max = 0;
        int temp;
        for(int aA : A){
            if(aA >= 1 && aA <= N){
                temp = array[aA-1];
                temp++;
                max = (max > temp) ? max : temp;
                array[aA - 1] = temp;
            }else if(aA == (N+1)){
                if(N>1){
                    array[0] = max;
                    array[1] = max;
                    for(int y = 1; y < N; y += y){
                        System.arraycopy(array, 0, array, y, ( (N-y) < y) ? (N-y) : y );
                    }
                }else{
                    array[0] = max;
                }
            }
        }
        return array;
    }
}
