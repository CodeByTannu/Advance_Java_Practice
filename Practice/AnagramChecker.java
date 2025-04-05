package Practice;

import java.util.Arrays;

public class AnagramChecker
{

    public static boolean areAnagrams(String str1, String str2) 
    {
        // Check if both strings have the same length
        if (str1.length() != str2.length())
        {
            return false;
        }

        // Convert strings to char arrays
        char[] charArray1 = str1.toLowerCase().toCharArray();
        char[] charArray2 = str2.toLowerCase().toCharArray();

        // Sort the char arrays
        Arrays.sort(charArray1);
        Arrays.sort(charArray2);

        // Compare the sorted char arrays
        return Arrays.equals(charArray1, charArray2);
    }

    public static void main(String[] args) 
    {
        String str1 = "listen";
        String str2 = "silent";
        if (areAnagrams(str1, str2))
        {
            System.out.println("Anagrams");
        } else {
            System.out.println("Not Anagrams");
        }

        str1 = "hello";
        str2 = "world";
        if (areAnagrams(str1, str2))
        {
            System.out.println("Anagrams");
        } else 
        {
            System.out.println("Not Anagrams");
        }
    }
}