/**
 * CompressedStrings
 */
public class CompressedStrings {
    public static void main(String[] args) {
        String result;
        result = compressed("sstta");
        System.out.println(result);
    }

    public static String compressed(String str){

        int count = 0;
        int max = str.length();
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < max; i++) {
            count ++;
            if( i+1 >= max || str.charAt(i) != str.charAt(i+1)){
                    sb.append(str.charAt(i));
                    sb.append(count);
                    count = 0;
            }
               
        }
    
       
      return max < sb.length() ? str : sb.toString();
    }
    
}