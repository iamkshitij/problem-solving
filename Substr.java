/**
 * Substr
 */
public class Substr {

    public static void main(String[] args) {
            boolean res = isSubstr("abcdabcd","cabd");
            System.out.println(res);        
    }


    public static boolean isSubstr(String s1, String s2){

        int len1 = s1.length();
        int len2 = s2.length();
        char[] w1 = s1.toCharArray();
        char[] w2 = s2.toCharArray();
        boolean pass = false;
        for (int i = 0; i < len1; i++) { // 8
            for(int j = 0; j < len2; j++){ // 4
                if(w1[i] == w2[j]){
                        if(pass){
                            return true;
                        }
                        pass = true;
                    
                }
            }
        }

        return false;

    }

}