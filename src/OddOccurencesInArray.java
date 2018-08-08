public class OddOccurencesInArray {
    public static void main(String[] args) {
        int[] A = new int[]{9, 3, 9, 3, 9, 7, 9};

        System.out.println(solution(A));
    }
    private static int solution(int[] A){
        int arrayValue = 0;

        for (int aA : A) {
            arrayValue ^= aA;
        }
        return arrayValue;
    }
}
