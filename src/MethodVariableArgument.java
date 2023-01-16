import java.util.Arrays;

public class MethodVariableArgument {
    public static void main(String[] args) {
        int[] values = {70,100,70,20};
        sayCongrats("arifin",70,100,70,20);
    }

    static void sayCongrats(String name, int... values){
        int total = 0;
        for (int value:values) {
            total += value;
        }
        System.out.println();

        int finalValue = total / values.length;

        if (finalValue > 70){
            System.out.println("Selamat "+name+" anda lulus");
        }else{
            System.out.println("Mohon maaf "+name+" anda belum lulus");
        }

    }
}
