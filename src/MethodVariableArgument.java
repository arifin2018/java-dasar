import java.util.Arrays;

public class MethodVariableArgument {
    public static void main(String[] args) {
        int[] values = {70,100,70,20};
        sayCongrats("arifin",70,100,70,30);
    }

    static void sayCongrats(String name, int... values){
        int total = 0;
        for (int value:values) {
            total += value;
        }

        int finalValue = total / values.length;

        if (finalValue > 70){
            System.out.println("Selamat "+name+" anda lulus,score anda = " + finalValue);
        }else{
            System.out.println("Mohon maaf "+name+" anda belum lulus,score anda = "+finalValue);
        }

    }
}
/*
Catatan untuk menggambil gettype variable dan die
        System.out.println(values.getClass().getSimpleName());
        System.exit(0);
 */
