
public class StringPermutation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String input = "a";
		String other = "a";
		boolean isAPermuation = checkStringPermutation(input.toLowerCase(), other.toLowerCase());

		String result = isAPermuation ? "" : "not ";
		System.out.println("String \"" + other + "\" is " + result + "a permuation of \"" + input+"\"");
	}

	private static boolean checkStringPermutation(String input, String other) {
		// TODO Auto-generated method stub

		if (input.length() != other.length())
			return false;
		// StringBuffer sb = new StringBuffer(other);
		for (int i = 0; i < input.length(); i++) {

			char ch = input.charAt(i);
			if (other.contains(ch + ""))
				other = other.replaceFirst(ch + "", "");
			else
				return false;

		}

		if (other.length() == 0)
			return true;

		return false;
	}

}
