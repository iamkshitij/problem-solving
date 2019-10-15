/**
 * UniqueCharacters - Check whether a given word has all unique characters or not
 */
public class UniqueCharacters {
    public static void main(String[] args) {
        if(isUnique("at b"))
        System.out.println("Unique");
         else
        System.out.println("Not Unique");  
    }
    // ------------------------- O(n) => optimal solution --------------------------------
    public static boolean isUnique(String phrase){
        int max = phrase.length();
        
        // if its more than 120 chars it is not unique
        if(max > 120 ) return false;
        
        int[] letter = new int[128];
        
        // hashing each letters and checking whether there occurance is more than once
        for (int i = 0; i < max; i++) {
            int c = (int) phrase.charAt(i);
            letter[c]++;
            if(letter[c] > 1) return false;
        }

        return true;
    }



    // //------------- O(n^2) => non optimal solution
    // public static boolean isUnique(String phrase){
    //     int max = phrase.length();
        
    //     char[] letter = phrase.toCharArray();
        
    //     for (int i = 0; i < max; i++) {
    //         for (int j = i+1; j < max; j++) {
    //             if(letter[i] == letter[j]) return false;
    //         }
    //     }
    //     return true;
    // }
    
}