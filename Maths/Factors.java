/**
 * Factors -> O(n ^ 1/2)
 */
import java.util.*;
public class Factors {

    public static void main(String[] args) {
        
        int[]  result = allFactors(256);
        printArray(result);
        
    }

    public static void printArray(int[] arr){
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    public static int[] allFactors(long A) {
            List<Integer> list = new ArrayList<>();

            for(int i = 1; i <= Math.sqrt(A); i++){
                    if(A % i == 0){
                        list.add(i);
                        if( i != Math.sqrt(A)) list.add((int)A/i);
                    }
            }
            Collections.sort(list);

            int[] factors = new int[list.size()];

            for (int i = 0; i < list.size(); i++) {
                factors[i] = list.get(i);
            }

            
            return factors;
    }

}