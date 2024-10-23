import java.util.*;

public class CountOccurence {

    /*
    The classic word-count algorithm: given an array of strings,
    return a Map<String, Integer> with a key for each different string,
    with the value the number of times that string appears in the array.

wordCount(["a", "b", "a", "c", "b"]) → {"a": 2, "b": 2, "c": 1}
wordCount(["c", "b", "a"]) → {"a": 1, "b": 1, "c": 1}
wordCount(["c", "c", "c", "c"]) → {"c": 4}
     */
    static Map<String, Integer> occurenceMap = new HashMap<>();

    public static void main(String[] args) {
        List<String> strings = new ArrayList<>(Arrays.asList("a", "b", "c", "d", "a", "c", "c", "d"));

        for (String counting : strings) {
            if (occurenceMap.containsKey(counting)) {
                occurenceMap.put(counting, occurenceMap.get(counting) + 1);
            }
            else {
                occurenceMap.put(counting,1);
            }
        }
        System.out.println(occurenceMap);
    }
}
