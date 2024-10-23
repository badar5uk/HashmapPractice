import java.util.*;

public class GroupStringFirstCharacter {

    /*
    Input: take an arrray of strings
    Output: take the first letter of the string as a key
            and combine the words with that letter as the value
    Process: - initiate list of strings
             - take the first letter of each string and store it
             - if character at first index is same then add strings

     */

    static Map<String,String> stringMap = new HashMap<>();

    public static void main(String[]args){
        List<String> strings = new ArrayList<>(Arrays.asList("salt", "tea", "soda", "toast"));
        for(Integer i= 0; i < strings.size(); i++){
            String wordBeingChecked = strings.get(i);
            for (Integer j =i+1; j < strings.size(); j++){
                if(wordBeingChecked.charAt(0) == strings.get(j).charAt(0)){
                    String firstChar = String.valueOf(wordBeingChecked.charAt(0));
                    stringMap.put(firstChar,strings.get(i)+strings.get(j));
                }
            }
        }
        System.out.println(stringMap);
    }
}
