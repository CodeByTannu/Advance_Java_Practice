package Practice;

public class UserNameValidator 
{
	 public static boolean isValidUsername(String username) 
	 {
	        if (username == null || username.length() < 5 || username.length() > 20) {
	            return false; // Invalid length
	        }

	        if (!Character.isLetter(username.charAt(0))) 
	        {
	            return false; // Does not start with a letter
	        }

	        for (char c : username.toCharArray())
	        {
	            if (!Character.isLetterOrDigit(c) && c != '_')
	            {
	                return false; // Contains invalid characters
	            }
	        }

	        return true; // Username is valid
	    }

	    public static void main(String[] args)
	    {
	        String username = "user_123";
	        if (isValidUsername(username))
	        {
	            System.out.println("Valid username");
	        } else
	        {
	            System.out.println("Invalid username");
	        }
	    }
	}


