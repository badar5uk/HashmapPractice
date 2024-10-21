import java.util.HashMap;
import java.util.Map;

public class BTakesA {

    /*
    Input: Take a Hashmap of values and append accordingly
    Output:if the key "a" has a value, set the key "b" to have that value,
    and set the key "a" to have the value "".
    Basically "b" is a bully, taking the value and replacing it with the empty string.

mapBully({"a": "candy", "b": "dirt"}) → {"a": "", "b": "candy"}
mapBully({"a": "candy"}) → {"a": "", "b": "candy"}
mapBully({"a": "candy", "b": "carrot", "c": "meh"}) → {"a": "", "b": "candy", "c": "meh"}
     */

    public static void main(String[]args){
        Map<String, String> indexValue = new HashMap<>();

        indexValue.put("a","candy");
        indexValue.put("b","dirt");

        System.out.println("Before appending: " + indexValue);

        if(!indexValue.get("a").isEmpty()){
            indexValue.put("b",indexValue.get("a"));
            indexValue.put("a","");
        }

        System.out.println("After appending: "+ indexValue);

    }
}
