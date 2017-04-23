package Tests;
import org.jetbrains.annotations.Contract;

public class Main {

    public static void main(String[] args) {
        System.out.println("2: " + isEven(2));
    }
    @Contract(pure = true)
    public static boolean isEven(int num){
        if(num%2 == 0){
            return true;
        }else {
            return false;
        }
    }
    public static boolean isNull(Object data){
        if(data == null){
            return true;
        }
        return false;
    }
}
