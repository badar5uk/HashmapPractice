import java.util.*;

public class ZeroCountUniqueWords {

    /*
    Given an array of strings, return a Map<String, Integer> containing
    a key for every different string in the array, always with the value 0.

word0(["a", "b", "a", "b"]) → {"a": 0, "b": 0}
word0(["a", "b", "a", "c", "b"]) → {"a": 0, "b": 0, "c": 0}
word0(["c", "b", "a"]) → {"a": 0, "b": 0, "c": 0}
     */

    static Map<String,Integer> mapOfLetters = new HashMap<>();
    public static void main(String[]args){

        System.out.println("The map after adjustment: "+ userInpuTotMap());

    }
    public static Map<String,Integer> userInpuTotMap(){

        Scanner input = new Scanner(System.in);
        Boolean exitFlag = true;
        while (exitFlag) {
            System.out.println("Enter a key: ");
            String key = input.nextLine();

            mapOfLetters.put(key,0);
            System.out.println("If you dont wish to continue press 0 or enter any number to continue");
            if (input.nextLine().contains("0")) {
                exitFlag = false;
            }
        }
        return mapOfLetters;
    }
}
