public class BreakContinue {
    public static void main(String[] args) {
        /*
        FUNGSI BREAK;
         */
        for (int i=1; i <= Math.round(50/2); i++){
            if (i == 20){
                break;
            }
            System.out.println("angka ganjil = " + i);
        }
        /*
            AKHIR FUNGSI BREAK;
         */

        System.out.println("\n\nLANJUT FUNGSI CONTINUE GANJIL\n\n");

        for (int i=1; i <= Math.round(50/2); i++){
            /*
            fungsi continue;
             */
            if (i % 2 == 0){
                continue;
            }
            /*
            akhir fungsi continue;
             */
            System.out.println("angka ganjil = " + i);
        }
    }
}
