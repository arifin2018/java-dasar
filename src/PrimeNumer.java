public class PrimeNumer {
    public static void main(String[] args) {
        int number = 43;

        String resultPrime = Prime(number);

        System.out.println(resultPrime);
    }

    private static String Prime(int number){
        int primeIndex = 0;
        for (int i = 2; i <= (number/2); i++){
            if (number % i == 0){
                primeIndex++;
            }
        }

        if (primeIndex == 0){
            return "prime";
        }else{
            return "not prime";
        }
    }
}
