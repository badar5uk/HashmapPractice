import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class OneValueFollow {

    /*
Modify and return the given map as follows: if exactly one of the keys "a" or "b"
has a value in the map (but not both), set the other to have that same value in the map.


mapAB3({"a": "aaa", "c": "cake"}) → {"a": "aaa", "b": "aaa", "c": "cake"}
mapAB3({"b": "bbb", "c": "cake"}) → {"a": "bbb", "b": "bbb", "c": "cake"}
mapAB3({"a": "aaa", "b": "bbb", "c": "cake"}) → {"a": "aaa", "b": "bbb", "c": "cake"}
     */

    static Map<String,String> letterMap = new HashMap<>();
    public static void main(String[]args){
        scannerInp();
        System.out.println("The Hashmap before adjusting: " + letterMap);
        adjust();
        System.out.println("The Hashmap after adjusting: " + letterMap);
    }

    public static void scannerInp(){

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
    public static void adjust(){
        if(letterMap.containsKey("a") && letterMap.containsKey("b")){
            return;
        }
        else if(letterMap.containsKey("a")){
            letterMap.put("b", letterMap.get("a"));
        }
        else if(letterMap.containsKey("b")){
            letterMap.put("a",letterMap.get("b"));
        }
    }
}
