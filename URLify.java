/**
 * URLify =>  Replace whitespace with %20 
 *              Ex: this is root => this%20is%20root
 */
public class URLify {
    public static void main(String[] args) {
        String chars = "he is ";
        char[] result = urlify(chars, 5);
        System.out.println(result);
    }

    public static char[] urlify(String sentence, int trueLength){

        char[] letters = sentence.toCharArray();
        int spaceCounts = 0;
        int index, i = 0;
        
        // count number of spaces in the sentence
        for (char c : letters) {
            if(c == ' ') spaceCounts ++;
        }

        // count number of extra spaces needed to shift existing array
        index = trueLength + spaceCounts * 2;

        // if extra space is present at the end of the sentence remove it
        if(trueLength < letters.length) letters[trueLength] = '\0';

        // create a new character array to store shifted characters from old array.
        char[] newSet = new char[index + 1];
        int position = 0;
        for(i = 0; i <trueLength; i++ ){
            if(letters[i] == ' '){
                newSet[position] = '%';
                newSet[position + 1] = '2';
                newSet[position + 2] = '0';
                position = position + 3;
            }else{
                // if there isn't any whitespace then shift the chars to new location
                newSet[position] = letters[i];
                position++;
            }
        }
       

       return newSet;
    }
    
}