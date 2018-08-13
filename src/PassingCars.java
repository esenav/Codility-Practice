public class PassingCars {
    public static void main(String[] args) {
        int[] A = new int[]{0,1,0,1,1};
        System.out.println(solution(A));
    }

    // https://app.codility.com/demo/results/trainingGTFWGZ-FHX/
    private static int solution(int[] A){
        int MAX = 1000000000;
        int carWest = 0;
        int carPassing = 0;
        for (int aA : A) {
            carWest = carWest + 1 - aA;
            carPassing += carWest * aA;
        }
        if(carPassing > MAX || carPassing < 0 ){
            return -1;
        }else{
            return carPassing;
        }
    }
}
