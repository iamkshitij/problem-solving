/**
 * LoveLetterMystery
 */
public class LoveLetterMystery {

    public static void main(String[] args) {
        Checker("abcd");
    }

    static void Checker(String w){
        char[] letters = w.toCharArray();

        for (char c : letters) {
            c = c-1;    
        }

        System.out.println(letters);
    }

}