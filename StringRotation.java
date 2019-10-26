/**
 * StringRotation
 */
public class StringRotation {

    public static void main(String[] args) {
        boolean result = isRotation("waterbottle", "erbottlewat");
        //boolean result = isRotation("waterbottle", "erbattlewat"); -- false
        System.out.println(result);
    }

    public static boolean isRotation(String original, String given){
        String newString = original + original;
        return isSubstring(newString, given) ? true : false;
    }

    // Given in question this method isSubstring is given
    public static boolean isSubstring(String str1, String str2){
        return str1.contains(str2) ? true : false;
    }
}