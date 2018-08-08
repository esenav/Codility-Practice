public class PermMissingElem {
    public static void main(String[] args) {
        int[] A = new int[]{2, 3, 1, 5};
        System.out.println(solution(A));
    }

    //Use long instead of int
    private static int solution(int[] A){
        long elem = 0;
        for(int i : A){
            elem += i;
        }
        long len = A.length;
        long missing = ((len+1)*(len+2))/2;

        // Easier understanding of mathematical solution

        /*long n = len+1;
        long missing = (n*(n+1))/2;*/

        return (int) (missing-elem);
    }

}
