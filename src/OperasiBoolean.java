public class OperasiBoolean {
    public static void main(String[] args) {

        var absen = 70;
        var nilaiAkhir = 80;

        boolean lulusAbsen = absen >75;
        boolean lulusNilai = nilaiAkhir >= 75;

        System.out.println(lulusAbsen && lulusNilai);
    }
}
