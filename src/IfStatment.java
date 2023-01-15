public class IfStatment {
    public static void main(String[] args) {

        int nilai = 79;
        int absen = 80;

        if (nilai>75 && absen > 75){
            System.out.println("Selamat anda lulus");
        }else{
            System.out.println("Mohon maaf anda belum lulus, silahkan coba kembali");
        }

        if (nilai > 80 && absen > 80){
            System.out.println("Nilai anda A");
        } else if (nilai > 70 && absen > 70) {
            System.out.println("Nilai anda B");
        } else if (nilai > 60 && absen > 70) {
            System.out.println("Nilai anda C");
        }else {
            System.out.println("Nilai anda D");
        }


    }
}
