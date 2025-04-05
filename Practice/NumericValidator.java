package Practice;
import java.util.*;
import java.util.regex.Pattern;

public class NumericValidator
{
	
        public static boolean isNumeric(String input) 
        {
	        String numericPattern = "^-?\\d{1,3}(?:,\\d{3})*(?:\\.\\d+)?$";
	        return Pattern.matches(numericPattern, input);
	    }

	    public static void main(String[] args)
	    {
	        String inputValue = "123.45";
	        if (isNumeric(inputValue)) 
	        {
	            System.out.println("Valid numeric value");
	        } else {
	            System.out.println("Invalid numeric value");
	        }
	    }
	}


