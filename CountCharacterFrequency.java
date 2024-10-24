import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class CountCharacterFrequency {

    /*
    Input: A string taken in by a scanner input
    Output: the number of vowels and nu,ber of consonants in string
    Process: - use a scanner to take a string and convert it to lower characters
             - remove non-alphabetic characters(including spaces)
             - convert string into character array
             - go through letter in a for loop
             - if it is a vowel, add to vowel map
             - if consonant add to consonant map
             - display the output as 2 hashmaps with the counter as their value.
     */
    static Map<Character, Integer> vowelMap = new HashMap<>();
    static Map<Character, Integer> consonantMap = new HashMap<>();

    public static void main(String[] args) {
        scannerInp();
        System.out.println("The number of vowels in your String are" + vowelMap);
        System.out.println("The number of consonants are: " + consonantMap);

    }

    public static void scannerInp() {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter a string");
        String userInp = input.nextLine();
        userInp = userInp.toLowerCase();
        String nonAlpha = userInp.replaceAll("[^a-zA-Z]", "");
        vowelOrConsonant(nonAlpha);
    }

    public static void vowelOrConsonant(String stringManip) {
        char[] letterArray = stringManip.toCharArray();

        for (Character letters : letterArray) {
            if (letters == 'a' || letters == 'e' || letters == 'i' || letters == 'o' || letters == 'u') {
                if (vowelMap.containsKey(letters)) {
                    vowelMap.put(letters, vowelMap.get(letters) + 1);
                } else {
                    vowelMap.put(letters, 1);
                }
            } else if (letters != 'a' || letters != 'e' || letters != 'i' || letters != 'o' || letters != 'u') {
                if (consonantMap.containsKey(letters)) {
                    consonantMap.put(letters, consonantMap.get(letters) + 1);
                } else {
                    consonantMap.put(letters, 1);
                }
            }
        }
    }
}


