/**
 * Rearrange Arr[Arr[i]]
 */

import java.util.*;
public class Rearrange {

    public static void main(String[] args) {
        int[] in = {1,0};
        int size = in.length;
       // rearrange(in, size);
        ArrayList<Integer> list = new ArrayList<>();
        //4, 0, 2, 1, 3
        list.add(4);
        list.add(0);
        list.add(2);
        list.add(1);
        list.add(3);
        
        ArrayList<Integer> list2 = new ArrayList<>(list);
    
        arrange(list);
        System.out.println();
      //  arrangeA(list2);
        
    }
    
    public static void arrangeA(ArrayList<Integer> A) {
        int n = A.size();
        for (int i = 0; i < n; i++) A.set(i, A.get(i) + (A.get(A.get(i)) % n) * n );
        for (int i = 0; i < n; i++) A.set(i, A.get(i) / n);
        System.out.println(A);
    }
    public static void arrange(ArrayList<Integer> a) {
        int[] arr = new int[a.size()]; 


        for (int i = 0; i < a.size(); i++) arr[i] = a.get(i);
        for (int i = 0; i < arr.length; i++) {
            int j = arr[i];
         //   System.out.print(arr[j]+" ");
        }

        for (int i : arr) {
            System.out.println(i);
        }
        a.clear();
    }
    public static void rearrange(int[] A, int N){
        for (int i = 0; i < N; i++) {
            int j = A[i];
            System.out.println(A[j]);
        }
    }

}