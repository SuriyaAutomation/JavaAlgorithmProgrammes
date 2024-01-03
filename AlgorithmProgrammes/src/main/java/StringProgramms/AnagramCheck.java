package StringProgramms;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;


public class AnagramCheck {
	static List myArray ;
    
    public static boolean isAnagram(String word, String anagram) {
        if (word.length() != anagram.length()) {
            return false;
        }

        char[] chars = word.toCharArray();
        for (char c : chars) {
            int index = anagram.indexOf(c);
            if (index != -1) {
                anagram = anagram.substring(0, index) + anagram.substring(index + 1, anagram.length());
            } else {
                return false;
            }
        }
        return anagram.isEmpty();
    }

    
    public static boolean iAnagram(String word, String anagram) {
        char[] charFromWord = word.toCharArray();
        char[] charFromAnagram = anagram.toCharArray();

        Arrays.sort(charFromWord);
        Arrays.sort(charFromAnagram);

        return Arrays.equals(charFromWord, charFromAnagram);
    }

    
    public static boolean checkAnagram(String first, String second) {
        char[] characters = first.toCharArray();
        StringBuilder sbSecond = new StringBuilder(second);

        for (char ch : characters) {
            int index = sbSecond.indexOf("" + ch);
            if (index != -1) {
                sbSecond.deleteCharAt(index);
            } else {
                return false;
            }
        }
        return sbSecond.length() == 0;
    }
    
    public static void main(String[] args) throws Throwable{    	
    	myArray=new ArrayList();// Adding multiple validations
    	
    	myArray.add(AnagramCheck.isAnagram("word", "wrdo"));
    	myArray.add(AnagramCheck.isAnagram("mary", "arffmy"));
    	myArray.add(AnagramCheck.isAnagram("stop", "tops"));
    	myArray.add(AnagramCheck.isAnagram("boat", "btrggoa"));
    	
    	//iterating All Validations 
    	for (int i = 0; i < myArray.size(); i++) {
    		if (myArray.get(i).equals(true) ) {
        		System.out.println("Pass");			
    		} else {
    			System.out.println("fail");
    		}
		}
    	
	}
}

