import java.util.Arrays;

public class TestingArray {
    public static void main(String[] args) {

        Object[] ObjectArray = {
                "nur",
                "arifin",
                true,
                1
        };
        String typeObjectArray;
        System.out.println(typeObjectArray = ObjectArray[1].getClass().getSimpleName());
        System.out.println(typeObjectArray == "String");
        System.out.println(Arrays.toString(ObjectArray));
    }
}
