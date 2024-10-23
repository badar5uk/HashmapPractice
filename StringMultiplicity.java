import java.util.*;

public class StringMultiplicity {

    /*
    Given an array of strings, return a Map<String, Boolean> where each different
     string is a key and its value is true if that string appears 2 or more times in the array.

wordMultiple(["a", "b", "a", "c", "b"]) → {"a": true, "b": true, "c": false}
wordMultiple(["c", "b", "a"]) → {"a": false, "b": false, "c": false}
wordMultiple(["c", "c", "c", "c"]) → {"c": true}
     */

    static Map<String, Boolean> indexMap = new HashMap<>();

    public static void main(String[]args){
        Boolean checker;
        List<String> strings = new ArrayList<>(Arrays.asList("a", "b", "c", "d", "a", "c", "c", "d"));
        for (String counting : strings) {
            if (indexMap.containsKey(counting)) {
                indexMap.put(counting, checker = true);
            }
            else {
                indexMap.put(counting,checker = false);
            }
        }
        System.out.println(indexMap);
    }
}
