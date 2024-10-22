import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class StringLength {

    /*
    Given an array of strings, return a Map<String, Integer> containing a key for every different string in the array, and the value is that string's length.


wordLen(["a", "bb", "a", "bb"]) → {"bb": 2, "a": 1}
wordLen(["this", "and", "that", "and"]) → {"that": 4, "and": 3, "this": 4}
wordLen(["code", "code", "code", "bug"]) → {"code": 4, "bug": 3}
     */
    static Map<String, Integer> stringMap = new HashMap<>();

    public static void main(String[] args) {
        System.out.println("The keys and string length as a value" +userInpuTotMap());

    }

    public static Map<String, Integer> userInpuTotMap() {

        Scanner input = new Scanner(System.in);
        Boolean exitFlag = true;
        while (exitFlag) {
            System.out.println("Enter a string: ");
            String key = input.nextLine();

            stringMap.put(key,key.length());
            System.out.println("If you dont wish to continue press 0 or enter any number to continue");
            if (input.nextLine().contains("0")) {
                exitFlag = false;
            }
        }
        return stringMap;
    }
}
