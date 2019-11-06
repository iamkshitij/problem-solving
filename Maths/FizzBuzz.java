import java.util.ArrayList;
import java.util.List;

/**
 * FizzBuzz
 */
public class FizzBuzz {

    public static void main(String[] args) {
        // String[] res = fizzbuzz(15);
        // for (String string : res) {
        //     System.out.println(string);
        // }

        ArrayList<String> result = new ArrayList<>();
        result = fizzBuzz(35);
        System.out.println(result);

    }

    public static ArrayList<String> fizzBuzz(int A) {
        
        ArrayList<String> list = new ArrayList<>();

       for (int i = 1; i <= A; i++) {
           if( i % 3 == 0 && i % 5 == 0) list.add("FizzBuzz");
           else if( i % 3 == 0) list.add("Fizz");
           else if( i % 5 == 0) list.add("Buzz");   
           
           else list.add(""+i);
        }
       
       return list;
       
       
   }

    public static String[] fizzbuzz(int N){
      
        List<String> list = new ArrayList<>();

        for (int i = 1; i <= N; i++) {
            if( i % 3 == 0 && i % 5 == 0) list.add("FizzBuzz");
            else if( i % 3 == 0) list.add("Fizz");
            else if( i % 5 == 0) list.add("Buzz");   
            
            else list.add(""+i);
        }
        String[] str = new String[list.size()];
       
        for (int i = 0; i < list.size(); i++) {
            str[i] = list.get(i);
        }
        
        return str;
    }

}