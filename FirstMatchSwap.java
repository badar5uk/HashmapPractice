import java.util.*;

public class FirstMatchSwap {

    /*
  We'll say that 2 strings "match" if they are non-empty and their first chars are the same.
  Loop over and then return the given array of non-empty strings as follows:
  if a string matches an earlier string in the array, swap the 2 strings in the array.
   A particular first char can only cause 1 swap, so once a char has caused a swap,
   its later swaps are disabled. Using a map,
   this can be solved making just one pass over the array. More difficult than it looks.


firstSwap(["ab", "ac"]) → ["ac", "ab"]
firstSwap(["ax", "bx", "cx", "cy", "by", "ay", "aaa", "azz"]) → ["ay", "by", "cy", "cx", "bx", "ax", "aaa", "azz"]
firstSwap(["ax", "bx", "ay", "by", "ai", "aj", "bx", "by"]) → ["ay", "by", "ax", "bx", "ai", "aj", "bx", "by"]
     */
    static Map<Character, Integer> indexMap = new HashMap<>();
    static List<String> stringList = new ArrayList<>(Arrays.asList("ax", "bx", "cx", "cy", "by", "ay", "aaa", "azz"));

    public static void main(String[] args) {
        System.out.println("List before swapping: " + stringList);
        System.out.println("List after swapping: " + swapper());
    }

    public static List<String> swapper() {
        boolean exitFlag = true;
        while(exitFlag){
            for (Integer i = 0; i < stringList.size(); i++) {
                if (!indexMap.containsKey(stringList.get(i).charAt(0))) {
                    indexMap.put(stringList.get(i).charAt(0), i);
                } else {
                    Integer indexSwap = indexMap.get(stringList.get(i).charAt(0));
                    Collections.swap(stringList, i, indexSwap);
                    indexMap.remove(stringList.get(i).charAt(0));
                    continue;
                }
                exitFlag =false;
            }
        }
        return stringList;
    }
}
