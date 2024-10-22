import java.util.*;

public class AAndBGone {

    /*
Modify and return the given map as follows:
if the keys "a" and "b" are both in the map and have equal values, remove them both.

mapAB2({"a": "aaa", "b": "aaa", "c": "cake"}) → {"c": "cake"}
mapAB2({"a": "aaa", "b": "bbb"}) → {"a": "aaa", "b": "bbb"}
mapAB2({"a": "aaa", "b": "bbb", "c": "aaa"}) → {"a": "aaa", "b": "bbb", "c": "aaa"}
     */

    static Map<String, String> letterMap = new HashMap<>();

    public static void main(String[] args) {
        scannerInp();
        System.out.println("The Hashmap before adjusting: " + letterMap);
        adjust();
        System.out.println("The map after adjsuting: "+ letterMap);

    }

    public static void scannerInp() {

        Scanner input = new Scanner(System.in);
        Boolean exitFlag = true;
        while (exitFlag) {
            System.out.println("Enter keys 'a', 'b' or 'c'");
            String key = input.nextLine();

            System.out.println("Enter their value:  ");
            String value = input.nextLine();

            letterMap.put(key, value);
            System.out.println("If you dont wish to continue press 0 or enter any number to continue");
            if (input.nextLine().contains("0")) {
                exitFlag = false;
            }
        }
    }

    public static void adjust() {
        if (letterMap.get("a").equals(letterMap.get("b"))) {
            letterMap.remove("a");
            letterMap.remove("b");
        }
    }
}

