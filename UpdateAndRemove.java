import java.util.HashMap;
import java.util.Map;

public class UpdateAndRemove {

    /*
    Input: A hashmap with keys a,b,c
    Output: appending the map to have different keys
    Process: - if the key "a" has a value, set the key "b" to have that same value.
             -

Modify and return the given map as follows:  In all cases remove the key "c",
leaving the rest of the map unchanged.



mapShare({"a": "aaa", "b": "bbb", "c": "ccc"}) → {"a": "aaa", "b": "aaa"}
mapShare({"b": "xyz", "c": "ccc"}) → {"b": "xyz"}
mapShare({"a": "aaa", "c": "meh", "d": "hi"}) → {"a": "aaa", "b": "aaa", "d": "hi"}
     */

    public static void main(String[]args){
        Map<String , String> lettersMap = new HashMap<>();
        lettersMap.put("a" , "aaa");
        lettersMap.put("b" , "bbb");
        lettersMap.put("c" , "ccc");
        System.out.println("The original map is:  " +lettersMap);

        if (lettersMap.containsKey("c") && lettersMap.containsKey("b")){
            lettersMap.remove("c");
            lettersMap.put("b",lettersMap.get("a"));
        }
        System.out.println("The Modified map is:  "+ lettersMap);
    }
}
