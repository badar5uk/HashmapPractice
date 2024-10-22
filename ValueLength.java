import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class ValueLength {

    /*
Modify and return the given map as follows: if the keys "a" and "b" have values that have different lengths,
then set "c" to have the longer value.
If the values exist and have the same length, change them both to the empty string in the map.


mapAB4({"a": "aaa", "b": "bb", "c": "cake"}) → {"a": "aaa", "b": "bb", "c": "aaa"}
mapAB4({"a": "aa", "b": "bbb", "c": "cake"}) → {"a": "aa", "b": "bbb", "c": "bbb"}
mapAB4({"a": "aa", "b": "bbb"}) → {"a": "aa", "b": "bbb", "c": "bbb"}
     */

    static Map<String, String> letterMap = new HashMap<>();

    public static void main(String[]args){
        letterMap.put("a","aaaa");
        letterMap.put("b","bbbbbbbbb");
        letterMap.put("c","cake");
        System.out.println("The Hashmap before adjusting: " + letterMap);

        mapAdjuster();
        System.out.println("The Hashmap after adjusting: " + letterMap);
    }
    public static void mapAdjuster(){
        String valeOfA = letterMap.get("a");
        String valeOfB = letterMap.get("b");

        if(valeOfA.length() == valeOfB.length()){
            letterMap.replace("a","");
            letterMap.replace("b","");
        }
        else if(valeOfA.length()>valeOfB.length()){
            letterMap.replace("c",letterMap.get("a"));
        }
        else if(valeOfA.length()<valeOfB.length()){
            letterMap.replace("c",letterMap.get("b"));
        }
    }
}
