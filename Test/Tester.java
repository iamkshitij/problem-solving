/**
 * Tester
 */
public class Tester {

    public static void main(String[] args) {
        int[] a = {0,0,1,2};
        int count = 0;
        for (int i = 0; i < a.length; i++) {
            if(a[i] == 0)
                count++;
        }

        int[] b = new int[ a.length - count];

        int k = 0;
        for (int i = 0; i < a.length; i++) {
            if(a[i] != 0){
                b[k] = a[i];
                k++;
            }
        }

        for (int i = 0; i < b.length; i++) {
            System.out.print(b[i]);
        }
    }
}