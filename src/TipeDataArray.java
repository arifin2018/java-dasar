import java.util.Arrays;

public class TipeDataArray {
    public static void main(String[] args) {

        String[] arrayString;
        arrayString = new String[3];

        arrayString[0] = "Azriel";
        arrayString[1] = "Rafiq";
        arrayString[2] = "Pradipta";

        System.out.println(arrayString[0]);
        System.out.println(arrayString[1]);
        System.out.println(arrayString[2]);

        String[] namaString = new String[] {
                "nur", "arifin"
        };
        System.out.println("Array: "
                + Arrays.toString(namaString));

        int[] numbers = {
            1,2,3,4,5,6,7,8
        };
        numbers[0] = 11;
        for (int number:numbers) {
            if (number % 2 == 0 || number == 5){
                continue;
            }
            System.out.println(number);
        }

        long longNumber = 10L;

        System.out.println("LongNumber = " + longNumber);

        String[][] arrayMultidimensi = {
                {
                    "Nur", "Arifin"
                },
                {
                    "azriel","rafiq","pradipta"
                },
                {
                    "khoirunnisa", "MJ"
                }
        };
//        System.out.println("arrays = " + Arrays.deepToString(arrayMultidimensi));
//        System.exit(0);
        int index = 0;
        for (String[] TesArrays:arrayMultidimensi ) {
            System.out.println("Data " + (index+1) + ":");
            for (String TesArrays2:TesArrays) {
                System.out.println(TesArrays2);
            }
            index++;
            System.out.println();
        }
    }
}
