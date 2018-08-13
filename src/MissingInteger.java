import java.util.HashSet;

public class MissingInteger {
    public static void main(String[] args) {
        int[] A = new int[]{1, 3, 6, 4, 1, 2};
        int[] B = new int[] {-1, -3};
        System.out.println(solution2(A));
        System.out.println(solution(B));
    }
    // Does not deal with mixed numbers in arrays
    // Good only for small test cases
    private static int solution(int[] A){

        boolean[] known = new boolean[A.length+1];

        for(int aA : A){
            if(aA>0){
                known[aA-1]=true;
            }else{
                return 1;
            }
        }
        for(int i = 0; i<known.length; i++){
            if(!known[i]){
                return i+1;
            }
        }

        return A.length+1;
    }

    // Much better solution as first we eliminate repeating values and...
    // we increment minPositive until set no longer contains min value
    //  https://app.codility.com/demo/results/trainingNSUFFK-ADQ/
    private static int solution2(int[] A){

        HashSet<Integer> set = new HashSet<>();
        int minPositive = 1;

        for(int aA: A){
            if(aA >0){
                set.add(aA);
            }
        }
        for(int aA : set){
            if(aA == minPositive){
                do minPositive++;
                while(set.contains(minPositive));
            }
        }
        return minPositive;
    }
}
