package Practice;

public class PasswordStrengthChecker 
{

    public static String evaluatePasswordStrength(String password)
    {
        if (password.length() < 8)
        {
            return "Weak password";
        }

        boolean hasUppercase = false;
        boolean hasLowercase = false;
        boolean hasDigit = false;
        boolean hasSpecialChar = false;

        for (char c : password.toCharArray())
        {
            if (Character.isUpperCase(c)) 
            {
                hasUppercase = true;
            } else if (Character.isLowerCase(c)) 
            {
                hasLowercase = true;
            } else if (Character.isDigit(c)) 
            {
                hasDigit = true;
            } else if (!Character.isLetterOrDigit(c))
            {
                hasSpecialChar = true;
            }

            if (hasUppercase && hasLowercase && hasDigit && hasSpecialChar) 
            {
                break;
            }
        }

        if (hasUppercase && hasLowercase && hasDigit && hasSpecialChar)
        {
            return "Strong password";
        } else {
            return "Weak password";
        }
    }

    public static void main(String[] args)
    {
        String password = "P@ssw0rd";
        System.out.println(evaluatePasswordStrength(password));
    }
}