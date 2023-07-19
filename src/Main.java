
public class Main {

    public static boolean perfectSquareOrNot(int number){
        for (int iterator = 1 ;iterator * iterator <= number ; iterator++){
            if(iterator * iterator == number){
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        System.out.println(perfectSquareOrNot(14));
    }
}