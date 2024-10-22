import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class UpdateToppings {

    /*
    Input:

    Given a map of food keys and topping values, modify and return
    the map as follows: if the key "ice cream" is present, set its value to "cherry".
    In all cases, set the key "bread" to have the value "butter".

topping1({"ice cream": "peanuts"}) → {"bread": "butter", "ice cream": "cherry"}
topping1({}) → {"bread": "butter"}
topping1({"pancake": "syrup"}) → {"bread": "butter", "pancake": "syrup"}
     */


    static Map<String, String> foodItems = new HashMap<>();

    public static void main(String[] args) {
        scannerInp();
        System.out.println("Before adjusting: " +foodItems);
        adjust();
        System.out.println("After adjusting: " +foodItems);

    }

    public static void scannerInp(){

        Scanner input = new Scanner(System.in);
        Boolean exitFlag = true;
        while (exitFlag) {
            System.out.println("Enter a food and a topping");
            foodItems.put(input.nextLine(), input.nextLine());
            System.out.println("If you dont wish to continue press 0 or enter any number to continue");
            if (input.nextLine().contains("0")) {
                exitFlag = false;
            }
        }

    }
    public static void adjust(){
        if(foodItems.containsKey("ice cream")){
            foodItems.replace("ice cream", "Cherry");
        }
        foodItems.put("Bread","butter");
    }
}
