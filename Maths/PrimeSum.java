/**
 * PrimeSum --- Given an even number ( greater than 2 ), return two prime numbers whose sum will be equal to given number.
 */
import java.util.*;
public class PrimeSum {

    public static void main(String[] args) {
        int A = 4;
        int[]  result = generatePrimes(A);
        
        HashSet<Integer> hs = new HashSet<>();
        for (int i : result) {
            hs.add(i);
        }
        Iterator<Integer> it = hs.iterator();
        HashSet<Integer> sol = new HashSet<>();

        while(it.hasNext()){
            int p = it.next();
            if(isPrime(A-p)){
                sol.add(p);
                sol.add(A-p);
            }
        }

        System.out.println(sol);
        //printArray(result);
        
    }
        
    static boolean isPrime(int N){

        if( N <= 1) return false;
        for (int i = 2; i <= Math.sqrt(N); i++) {
            if( N % i == 0)
                return false;
        }

        return true;

    }
    // }
 
    public static int[] generatePrimes(int A){
        boolean[] prime = new boolean[A+1];
        
        for(int i = 0; i < A; i++) prime[i] = true;
        
        for(int p = 2; p*p <= A; p++){
            if(prime[p] == true){
                for(int i = p*p; i <=A;i+=p) prime[i] = false;
            }
        }
        
       
        List<Integer> list = new ArrayList<>();
        
        for(int j = 2; j <= A; j++ ){
            if(prime[j] == true) 
            list.add(j);
        }
     

        int[] isPrime = new int[list.size()];
        
        for(int i = 0; i < list.size(); i++)
            isPrime[i] = list.get(i);
        
            return isPrime;
         
     
    }

    public static void printArray(int[] arr){
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}