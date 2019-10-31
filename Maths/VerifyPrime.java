/**
 * VerifyPrime
 */
public class VerifyPrime {

    public static void main(String[] args) {
        System.out.println(isPrime(39601));
    }

    static boolean isPrime(int N){

        if( N <= 1) return false;
        for (int i = 2; i <= Math.sqrt(N); i++) {
            if( N % i == 0)
                return false;
        }

        return true;

    }

}