package StringProgramms;
public class StringReversal {

   
    public static String reverseString(String str) {
        // Base case: if the string is empty or has only one character
        if (str == null || str.length() <= 1) {
            return str;
        }

        // Recursive case: reverse the substring excluding the first character
        return reverseString(str.substring(1)) + str.charAt(0);
    }
    
    public static void main(String[] args) {
        String str = "Suriya Automation";
        String reversed = reverseString(str).toLowerCase().replaceAll(" ", "");
        System.out.println("Original String: " + str);
        System.out.println("Reversed String: " + reversed);
    }
}

