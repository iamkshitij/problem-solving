import java.util.ArrayList;
import java.util.List;
import java.lang.*;
import java.io.*;
import java.math.*;
/**
 * TrailingZeros in factorial ex: n = 5 ; 5! = 120 ; o/p = 1
 */
public class TrailingZeros {

    public static void main(String[] args) {
         int A = 8785856;
        // System.out.println(factorial(A));
        // BigInteger fact = factorial(A);
        // // int res = countZeros(fact);
        // // System.out.println(res);
        System.out.println(trailingZeroes(A));
    }


    // for large numbers solution - II

    public static int trailingZeroes(int A) {
        
        int count = 0;
        
        while(A != 0){
            count += A/5;
            A/=5;
        }
        
        return count;

    }

    static int countZeros(BigInteger fact){
            List<Character> list = new ArrayList<>();
            String str = String.valueOf(fact);
            char[] ch = str.toCharArray();
            for (char c : ch) {
                list.add(c);
            }
            int count = 0;
            if(str.endsWith("0")){
                for (int i = 0; i < list.size(); i++) {
                    if(list.get(i) == '0') count++;
                }
                
            };
            return count;
    }

    static BigInteger factorial(int A){
        BigInteger fact= BigInteger.ONE;
        // int factorialNo = 100;

            for (int i = 2; i <= A; i++)
               {
                    fact = fact.multiply(new BigInteger(String.valueOf(i)));
            }
        return fact;
    }
}