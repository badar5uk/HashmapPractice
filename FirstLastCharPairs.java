import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class FirstLastCharPairs {

    /*
    Given an array of non-empty strings, create and
     return a Map<String, String> as follows: for each string add its first character
     as a key with its last character as the value.

pairs(["code", "bug"]) → {"b": "g", "c": "e"}
pairs(["man", "moon", "main"]) → {"m": "n"}
pairs(["man", "moon", "good", "night"]) → {"g": "d", "m": "n", "n": "t"}
     */
static Map<String,String> stringMap = new HashMap<>();
    public static void main(String[]args){
        System.out.println("The map after adjustment: "+userInpuTotMap());

    }
    public static Map<String, String> userInpuTotMap() {

        Scanner input = new Scanner(System.in);
        Boolean exitFlag = true;
        while (exitFlag) {
            System.out.println("Enter a string: ");
            String key = input.nextLine();

            stringMap.put(String.valueOf(key.charAt(0)),String.valueOf(key.charAt(key.length()-1)));
            System.out.println("If you dont wish to continue press 0 or enter any number to continue");
            if (input.nextLine().contains("0")) {
                exitFlag = false;
            }
        }
        return stringMap;
    }
}
