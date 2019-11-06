/**
 * Gcd
 */
public class Gcd {

    public static void main(String[] args) {
        System.out.println(rGcd(6, 9));
    }

    // iterative approach
    public static int gcd(int A, int B){
        int r;
        while( B != 0){
            r = A % B;
            A = B;
            B = r;
        }
        return A;
    }

    // recursive approach
    public static int rGcd(int A, int B){
        return (B != 0) ? rGcd(B, A % B):A;
    }
}