package List_Of_Palindromes;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;


public class Palindrome_List 
{
		public static void main(String[] args) 
		{
	        List<String> a = Arrays.asList("madam","mom","dad","sis","level","epam","apple","Welcome","Wow");
	        List<String> palindromes = Palindrome_List.findPal(a, 
	                (str) -> Palindrome_List.isPal((String) str));
	 
	        System.out.println("List of palindromes are :" + palindromes);
	    }
	 
	    public static boolean isPal(String str) {
	    	StringBuffer newStr =new StringBuffer();
	    	for(int j = str.length()-1; j >= 0 ; j--) {
	    	newStr = newStr.append(str.charAt(j));
	    	}
	    	if(str.equalsIgnoreCase(newStr.toString())) {
	    		return true;
	    	} else {
	    		return false;
	    	}
	        } 
	    public static List<String> findPal(List<String> list, Predicate<String> predicate) { 
	    	List<String> sortedpal = new ArrayList<String>(); 
	    	list
	    	.stream()
	    	.filter((i) -> (predicate.test((String) i))).forEach((i) -> {
	            sortedpal.add((String) i);
	        });
	        return sortedpal;
	 
	    }
	    
	}


