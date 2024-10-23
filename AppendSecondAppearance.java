import java.util.*;

public class AppendSecondAppearance {

    /*

    Loop over the given array of strings to build a result string like this:
    when a string appears the 2nd, 4th, 6th, etc. time in the array,
    append the string to the result. Return the empty string if no string appears a 2nd time.

wordAppend(["a", "b", "a"]) → "a"
wordAppend(["a", "b", "a", "c", "a", "d", "a"]) → "aa"
wordAppend(["a", "", "a"]) → "a"
     */

    static Map<String,Integer> indexChecker = new HashMap<>();
    public static void main(String[]args){
        Integer counter = 0;
        List<String> listOfIndex = List.of("a", "b", "a", "c", "a", "d", "a");
        String occurence = "";
        for(Integer i = 0; i<listOfIndex.size(); i++){
            String letter = listOfIndex.get(i);
            if(!indexChecker.containsKey(letter)){
                indexChecker.put(letter,1);
            }
            else{
                counter = indexChecker.get(letter);
                indexChecker.put(letter,counter+1);
                if(indexChecker.get(letter)!= 1 && indexChecker.get(letter)%2==0){
                    occurence += letter;
                }
            }
        }
        System.out.println(occurence);
    }
}
