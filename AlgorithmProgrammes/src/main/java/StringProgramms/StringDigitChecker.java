package StringProgramms;
public class StringDigitChecker {

   

    public static boolean containsOnlyDigits(String str) {
        if (str == null || str.isEmpty()) {
            return false;
        }

        for (char ch : str.toCharArray()) {
            if (!Character.isDigit(ch)) {
                return false;  // Found a non-digit character
            }
        }
        return true;  // All characters are digits
    }
    
    public static void main(String[] args) {
        String str1 = "12345";
        String str2 = "12aF45";

        System.out.println("\"" + str1 + "\" contains only digits: " + containsOnlyDigits(str1));
        System.out.println("\"" + str2 + "\" contains only digits: " + containsOnlyDigits(str2));
    }
}

