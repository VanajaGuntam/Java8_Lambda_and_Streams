package array_list;
import java.util.*; 
import java.util.stream.IntStream; 


public class Array_integer_list 
{
	
		 public static void main(String[] args) 
		    {
		        IntStream stream = IntStream.of(2, 53, 143, 21, 6, 7, 8,9,16,133,149,154); 
		        OptionalDouble objj1 = stream.average(); 
		        if (objj1.isPresent()) 
		        { 
		            System.out.println(objj1.getAsDouble()); 
		        } 
		        else 
		        { 
		            System.out.println("-1"); 
		        } 
		    } 

}


