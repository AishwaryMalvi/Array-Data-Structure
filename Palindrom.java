package Array;

public class Palindrom {

	
	public boolean isPalindrom(String word) {
		char[] charArray = word.toCharArray();
		int start = 0;
		int end = word.length()-1;
		while(start < end) {
			if(charArray[start] != charArray[end]) {
				return false;
			}
			start++;
			end--;
		}
		return true;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Palindrom palindrom = new Palindrom();
		if(palindrom.isPalindrom("madam")) {
			System.out.println("The string is palindrom");
		}
		else {
			System.out.println("The string is not palindrom");

		}
	}

}
