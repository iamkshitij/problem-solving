/**
 * Anagram - An anagram is a word or phrase formed by rearranging the letters of a different word or phrase,
 * typically using all the original letters exactly once.
 */
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class Anagrams{
    public static void main(String[] args) {
        if(isAnagram("dog", "god"))
            System.out.println("Anagrams");
        else
            System.out.println("Not Anagrams");    
    }
    // ---------------------- O(n) => Optimal solution ---------------------------
    public static boolean isAnagram(String phrase1,String phrase2){
        
        // if length is not equal rule them out at first go.
        if(phrase1.length() != phrase2.length() ) return false;

            // Assuming these are ASCII characters
            int[] letters = new int[128];

            char[] w1 = phrase1.toCharArray();
            // hasing each characters
            for (char c : w1) {
                letters[c]++;
            }
         
            // substract phrase2 ascii values from phrase1
            for (int i = 0; i < phrase2.length(); i++) {
                int c = (int)phrase2.charAt(i);
                letters[c]--;
                if(letters[c] < 0) return false;
            }

        return true;
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
	
	
	    int[] isPrime = new int[list.size()];
	    
	    for(int i = 0; i < list.size(); i++)
	        isPrime[i] = list.get(i);
	    
	        return isPrime;
	     
	
	}

    //---------------------------- O(nlogn) => not optimal solution-------------------------------------------
//     public static boolean isAnagram(String phrase1, String phrase2){
//         int max = phrase1.length();

//         if(phrase1.length()!=phrase2.length())
//             return false;
        
//         char[] letters = phrase1.toCharArray();
//         char[] letters2 = phrase2.toCharArray();

//         Arrays.sort(letters);
//         Arrays.sort(letters2);

//         for (int i = 0; i < max; i++) {
//             if(letters[i] == letters2[i])
//                 return true;
//         }
//         return false;
//     }

 }