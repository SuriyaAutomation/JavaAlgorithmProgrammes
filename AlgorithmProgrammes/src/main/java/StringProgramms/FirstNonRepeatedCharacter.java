package StringProgramms;
import java.util.HashMap;
import java.util.Map;

public class FirstNonRepeatedCharacter {

    
    public static char findFirstNonRepeatedCharacter(String str) {
        // Convert the string to lowercase for case-insensitive comparison
        str = str.toLowerCase();

        // Create a HashMap to store character frequency
        Map<Character, Integer> charFrequency = new HashMap<>();

        // Populate the HashMap with character frequencies
        for (char ch : str.toCharArray()) {
            charFrequency.put(ch, charFrequency.getOrDefault(ch, 0) + 1);
        }

        // Find the first non-repeated character
        for (char ch : str.toCharArray()) {
            if (charFrequency.get(ch) == 1) {
                return ch;
            }
        }

        // If no non-repeated character found, return '\0' (null character)
        return '\0';
    }
    
    public static void main(String[] args) {
        String str = "Java programming Launguage";
        char result = findFirstNonRepeatedCharacter(str);
        if (result != '\0') {
            System.out.println("The first non-repeated character is: " + result);
        } else {
            System.out.println("No non-repeated character found.");
        }
    }
}
