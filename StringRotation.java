/**
 * StringRotation
 */
public class StringRotation {

    public static void main(String[] args) {
       // boolean result = isRotation("waterbottle", "erbottlewat");
        boolean result = isRotation("waterbottle", "erbattlewat"); 
    
        System.out.println(result);
    }

    public static boolean isRotation(String original, String given){
        int maxO = original.length();
        int maxG = given.length();

        if(maxO != maxG && maxO < 0) return false;
        
        String newString = original + original;
        return isSubstring(newString, given);
    }

    // Given in question this method isSubstring is given
    public static boolean isSubstring(String str1, String str2){
        return str1.contains(str2);
    }
}