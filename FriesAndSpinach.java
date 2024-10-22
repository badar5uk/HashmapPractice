import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class FriesAndSpinach {

    /*
    Given a map of food keys and topping values, modify and return the map as follows: if the key
     "potato" has a value, set that as the value for the key "fries".
      key "salad" has a value, set that as the value for the key "spinach".


topping3({"potato": "ketchup"}) → {"potato": "ketchup", "fries": "ketchup"}
topping3({"potato": "butter"}) → {"potato": "butter", "fries": "butter"}
topping3({"salad": "oil", "potato": "ketchup"}) → {"spinach": "oil", "salad": "oil", "potato": "ketchup", "fries": "ketchup"}
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
        if(foodToppings.containsKey("potato")){
            foodToppings.put("fries", foodToppings.get("potato"));
        }
        if(foodToppings.containsKey("salad")){
            foodToppings.put("spinach",foodToppings.get("salad"));
        }
    }
}
