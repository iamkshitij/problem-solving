/**
 * OneAway - 
 */
public class OneAway {

    public static void main(String[] args) {
        boolean res;
        
        String str1 = "pale"
        ,str2 = "pal";

        int len1 = str1.length();
        int len2 = str2.length();

        if(len1 == len2) res = isEditable(str1, str2);
        res = len1 > len2 ? isOneEdit(str2, str1) : isOneEdit(str1, str2);
        
        System.out.println(res);
    }


    public static boolean isOneEdit(String w1, String w2){
        int i1 = 0;//1 2//0
        int i2 = 0;//1 2 3//1
        while(i2 < w2.length() && i1 < w1.length()){
            if(w1.charAt(i1) != w2.charAt(i2)){
                if(i1 != i2) return false;
                i2++;
            }else{
                    i1++;
                    i2++;
                }
            
        }

        return true;
        
    }
    public static boolean isEditable(String w1, String w2){
        boolean isEdited = false;
        int max = w1.length();
        for (int i = 0; i < max; i++) {
            if(w1.charAt(i) != w2.charAt(i)){
                if(isEdited) return false;
                isEdited = true;
            }
        }
        return true;
    }
    
}