/**
 * WaveArray
 */
public class WaveArray {

    public static void main(String[] args) {
        int[] a = {10, 90, 49, 2, 1, 5, 23};
        printArray(wave(a));
    }

    static void printArray(int[] a){
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + " ");
        }
    }
    public static void swap(int[] arr,int a, int b){
        int temp;
        temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;
    }
    public static int[] wave(int a[]){

        for (int i = 1; i < a.length; i = i + 2) {

            if(i>0 && a[i] < a[i-1])
                swap(a, i-1,i);
            if(i<a.length -1 && a[i] < a[i+1]) 
                swap(a, i, i+1);   
        }

        return a;
    }

}