import java.util.HashSet;

/*
https://app.codility.com/demo/results/trainingFBYQKK-9VU/
*/

public class FrogRiverJump {
    public static void main(String[] args) {
        int[] A = new int[]{1, 3, 1, 4, 2, 3, 5, 4};
        int X = 5;
        System.out.println(solution(A, X));
    }

    private static int solution(int[] A, int X){
        // HashSet does not allow duplicates, opposed to Lists that do allow duplicates
        // Main idea of this task is to add elements that are not duplicate
        // and check size of set when X equals to it.

        HashSet<Integer> integerHashSet = new HashSet<>();

        for(int i = 0; i < A.length; i++){
            if(A[i] <= X){
                integerHashSet.add(A[i]);
            }if(integerHashSet.size()==X){
                return i;
            }
        }
        return -1;
    }
}
