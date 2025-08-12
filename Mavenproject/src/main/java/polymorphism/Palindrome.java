package polymorphism;

public class Palindrome {
	    public static void main(String[] args) {
	        String word1 = "Java";
	        String word2 = "Malayalam";

	        System.out.println(word1 + ":" + isPalindrome(word1));
	        System.out.println(word2 + ":" + isPalindrome(word2));
	    }

	   public static String isPalindrome(String str) {
	        String rev = "";
	        for (int i = str.length() - 1; i >= 0; i--) {
	            rev += str.charAt(i);
	        }
	        if (str.equalsIgnoreCase(rev)) {
	            return "Palindrome";
	        } else {
	            return "Not Palindrome";
	        }
	    }
	}

	

