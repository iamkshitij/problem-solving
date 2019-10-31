import java.util.HashSet;
import java.util.Iterator;

/**
 * SumPair
 */
public class SumPair {

    public static void main(String[] args) {
        int[] A = {1,2,3,8,12};
        int[] B = {8,4,1,10};
        int sum = 11;
        System.out.println(HasPairSum(A, sum));
        System.out.println(HasPairSum(B, sum));
        
    }

    //this case array need not to be sorted! O(N)
    static boolean HasPairSum(int[] A, int sum){

        HashSet<Integer> set = new HashSet<>();
        Iterator<Integer> it = set.iterator(); 

        for (int i : A) {
            if(set.contains(i) != it.hasNext()) return true;
            set.add(sum - i);
        }
        return false;
    }

    // this case our array must be sorted else we need to sort the array first! if sorted = O(N) else O(NLogN)
    // static boolean HasPairSum(int[] A, int sum){

    //     int low = 0;
    //     int high = A.length - 1;

    //     while(low < high){
    //         int s = A[low] + A[high];
    //         if( s < sum ) low++;
    //         if( s > sum ) high--;
    //         if( s == sum) return true;
            
    //     }

    //     return false;
        
    // }

}