public class FrogJump {
    public static void main(String[] args) {
        int x = 10;
        int y = 85;
        int d = 30;
        System.out.println(solution(x, y, d));
    }
    private static int solution(int X, int Y, int D){
        int result;

        try{
            if(Y < X || D <= 0){
                throw new Exception();
            }

        }catch(Exception e){
            System.out.println("Invalid arguments");
        }

        if((Y - X) % D == 0){
            result = (Y - X)/ D;
        }else{
            result = ((Y - X)/ D) + 1;
        }

        return result;
    }
}
