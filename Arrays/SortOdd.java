/**
 * SortOdd
 */
import java.util.*;
public class SortOdd {

    public static void main(String[] args) {
        int[] a = {5,3,2,8,1,4};
        
        printArray(sortArray1(a));
    }

    public static void printArray(int[] a){
        for (int i = 0; i < a.length; i++) {
            System.err.print(a[i] + " ");
        }
    }
  
    public static int[] sortArray1(int[]  a){

        int[] b = new int[a.length];
        int k = 0;
        for (int i = 0; i < a.length; i++) {
            if(a[i] % 2 != 0){
                b[k] = a[i];
                k++;
            }
        }

        Arrays.sort(b);

        b = removeZeros(b);

        int l = 0;
        for (int i = 0; i < a.length; i++) {
            if(a[i] % 2 != 0){
                a[i] = b[l];
                l++;
            }
        }

       
       return a;
    }

    public static int[] removeZeros(int[] a){
        
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


        
        return b;
    }

    public static void sortArray(int[] array) {
       
        ArrayList<Integer> list = new ArrayList<>();
    
        for (int i = 0; i < array.length; i++) {
            if(array[i] % 2 != 0){
                list.add(array[i]);
            }
        }

        

        Collections.sort(list);
        int[] b = new int[list.size()];

       for (int i = 0; i < list.size() ; i++) {
            b[i] = list.get(i).intValue();
       }

       int k = 0;
        for (int i = 0; i < array.length; i++) {
            if(array[i] % 2 != 0){
                array[i] = b[k];
                k++;
            }
        }

        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
      }

  

}