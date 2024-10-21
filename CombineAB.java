import java.util.HashMap;
import java.util.Map;

public class CombineAB {

    /*
    Input: key a and key b with values to be combined
    Output: The combination of key a and b entered into the map
    Process: - An if statement to check if the key a and b exist
             - if they both exist, it would use the put method to add a new key with both values
     */

    public static void main(String[]args){
        Map<String,String> indexOfValues = new HashMap<>();

        indexOfValues.put("a","Hi");
        indexOfValues.put("b","There");

        System.out.println("Before modification: "+indexOfValues);

        if (indexOfValues.containsKey("a") && indexOfValues.containsKey("b")){
            indexOfValues.put("ab",indexOfValues.get("a")+indexOfValues.get("b"));
        }
        System.out.println("After appending:" +indexOfValues);
    }
}
