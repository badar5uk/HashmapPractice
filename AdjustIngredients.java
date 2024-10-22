import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class AdjustIngredients {

    /*
    Given a map of food keys and their topping values,
    modify and return the map as follows: if the key "ice cream" has a value,
    set that as the value for the key "yogurt" also. If the key "spinach" has a value,
    change that value to "nuts".


topping2({"ice cream": "cherry"}) → {"yogurt": "cherry", "ice cream": "cherry"}
topping2({"spinach": "dirt", "ice cream": "cherry"}) → {"yogurt": "cherry", "spinach": "nuts", "ice cream": "cherry"}
topping2({"yogurt": "salt"}) → {"yogurt": "salt"}
     */

    static Map<String,String> foodToppings = new HashMap<>();

    public static void main(String[]args){
        scannerInp();
        System.out.println("Before adjusting: " +foodToppings);
        adjust();
        System.out.println("After adjusting: " +foodToppings);

    }
    public static void scannerInp(){

        Scanner input = new Scanner(System.in);
        Boolean exitFlag = true;
        while (exitFlag) {
            System.out.println("Enter a food and a topping");
            foodToppings.put(input.nextLine(), input.nextLine());
            System.out.println("If you dont wish to continue press 0 or enter any number to continue");
            if (input.nextLine().contains("0")) {
                exitFlag = false;
            }
        }

    }
    public static void adjust(){
        if(foodToppings.containsKey("ice cream")){
            foodToppings.put("Yoghurt", foodToppings.get("ice cream"));
        }
        if(foodToppings.containsKey("spinach")){
            foodToppings.replace("spinach","nuts");
        }
    }
}
