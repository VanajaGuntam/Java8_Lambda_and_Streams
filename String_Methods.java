package String_List;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.*;


public class String_Methods
{
	
		public static List<String> search(List<String> list)
		{
			return list
					.stream()
					.filter(s -> s.startsWith("a") && s.length()==3)
					.collect(Collectors.toList());
		}
		
		public static void main(String args[]) 
		{
			
			List<String> str = new ArrayList<String>();
			    str.add("aim"); 
		        str.add("apple"); 
		        str.add("age");
		        str.add("ago");
		        str.add("air");
		        str.add("and");
		        str.add("awesome");
		        List<String> s1 = search(str); 
		        System.out.println(s1);
			 
	            
			
		}
	}





