/**
 * PalinWOSpace
 */
public class PalinWOSpace {

    public static void main(String[] args) {
        System.out.println(isPalindrome(451154));
    }


    public static int isPalindrome(int A) {
        return A >= 0 && new StringBuilder(A+"").reverse().toString().equals(A+"") ? 1 : 0;
    }
}