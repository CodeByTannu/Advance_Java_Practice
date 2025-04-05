package Practice;

public class PhoneNumberFormatter {
	 public static String formatPhoneNumber(String phoneNumber) {
	        if (phoneNumber == null || phoneNumber.length() != 10) {
	            throw new IllegalArgumentException("Invalid phone number. Please provide a 10-digit number.");
	        }

	        return String.format("%s-%s-%s",
	                phoneNumber.substring(0, 3),
	                phoneNumber.substring(3, 6),
	                phoneNumber.substring(6));
	    }

	    public static void main(String[] args) {
	        String phoneNumber = "1234567890";
	        String formattedPhoneNumber = formatPhoneNumber(phoneNumber);
	        System.out.println("Formatted Phone Number: " + formattedPhoneNumber);
	    }

}
