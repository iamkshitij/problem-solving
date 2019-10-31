/**
 * PrimeSum --- Given an even number ( greater than 2 ), return two prime numbers whose sum will be equal to given number.
 */
import java.util.*;
public class PrimeSum {

    public static void main(String[] args) {
        int[]  result = PrimeSum(10);
        printArray(result);
        
    }
    public int[] primesum(int A) {
    
        int[] primes = generatePrimes(A);
        int[] sumPair = generateSum(primes,A);   
        return sumPair;
    }   
 
    public static int[] generateSum(int[] A, int totalSum){
       
        int complement;
        complement = 0;
        for (int i = 0; i < A.length; i++) {
            complement = totalSum - A[i];
            int index = Arrays.binarySearch(A, complement);
            int found = index < 0 ? -1: A[index];
            if(found > 1)
                
        }

        


    }
 
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
     
        System.out.println(list.get(0));
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