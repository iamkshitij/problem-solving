import java.util.ArrayList;

/**
 * AddOne
 */
public class AddOne {

    public static void main(String[] args) {
        ArrayList<Integer> A = new ArrayList<>();
      //
     // 111321125965
        A.add(1);
        A.add(1);
        A.add(1);
        A.add(3);
        A.add(2);
        A.add(1);
        A.add(1);
        A.add(2);
        A.add(5);
        A.add(9);
        A.add(6);
        A.add(5);


        addOne(A);
    }

    static ArrayList<Long> addOne(ArrayList<Integer> A){

    
        String str = new String();
        for (int i = 0; i < A.size(); i++) {
            str = str + A.get(i);
        }
        long in = Long.parseLong(str) + 1;
        //String res = String.valueOf(in);
        String[] result = String.valueOf(in).split(""); 
       
     
        ArrayList<Long> list = new ArrayList<>();
       
        for (int i = 0; i < result.length; i++) {
            long j = Long.parseLong(result[i]);
            list.add(j);
        }

        System.out.println(list);
       return list;
        
        

    }

  
}