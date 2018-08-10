public class PermCheck {
    /*
    https://app.codility.com/demo/results/trainingZEUHRS-BN5/
    */
    public static void main(String[] args) {
        int[] A = new int[]{4, 1, 3, 2};
        System.out.println(solution(A));
    }

    private static int solution(int[] A){

        boolean[] known = new boolean[A.length+1];

        for (int aA : A) {
            if (aA < 1 || aA > A.length) {
                return 0;
            }
            if (known[aA]) {
                return 0;
            } else {
                known[aA] = true;
            }
        }
        return 1;
    }
}
