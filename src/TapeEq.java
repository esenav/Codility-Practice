public class TapeEq {
    public static void main(String[] args) {
        int[] A = new int[]{3,1,2,4,3};
        System.out.println(solution(A));
    }
    private static int solution(int[] A){
        int numberOfelements = A.length-1;
        int firstPart = A[0];
        int secondPart = 0;
        for(int i=1; i < A.length; i++){
            secondPart +=A[i];
        }
        int difference = Math.abs(firstPart-secondPart);

        for(int i=1; i < numberOfelements; i++){
            firstPart +=A[i];
            secondPart -=A[i];
            if(Math.abs(firstPart-secondPart) < difference){
                difference=Math.abs(firstPart-secondPart);
            }
        }
        return difference;
    }
}
